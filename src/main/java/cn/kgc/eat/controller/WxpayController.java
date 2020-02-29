package cn.kgc.eat.controller;

import cn.kgc.eat.id.worker.others.Sid;
import cn.kgc.eat.pojo.EatGreens;
import cn.kgc.eat.pojo.Orders;
import cn.kgc.eat.pojo.Product;
import cn.kgc.eat.service.EatGreensService;
import cn.kgc.eat.service.OrdersService;
import cn.kgc.eat.service.ProductService;
import cn.kgc.eat.utils.pay.wx.service.WxOrderService;
import cn.kgc.eat.utils.pay.wx.entity.PreOrderResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@Controller
@RequestMapping("/wxpay")
public class WxpayController {

	@Resource
	private EatGreensService eatGreensService;

	@Resource
	private OrdersService orderService;

	@Resource
	private WxOrderService wxOrderService;

	@Resource
	private Sid sid;
	
	@RequestMapping(value = "/index")
	public String products() throws Exception {
		
		return "front/index";
	}
	
	// TODO 实际情况需要自己业务订单的状态，此处仅仅用于测试
	public static boolean isOrderPaid = false;
	
	/**
	 * 
	 * @Description: 生成预付单
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 * 
	 * @author leechenxiang
	 * @date 2017年8月31日 下午4:02:01
	 */
	@RequestMapping(value = "/createPreOrder")
	public ModelAndView createPreOrder(@RequestParam("greensId") String greensId, @RequestParam("totalCount") String totalCount,HttpServletRequest request, HttpServletResponse response) throws Exception {

		if(greensId!=null){
			Long id=Long.valueOf(greensId);
			EatGreens greens=eatGreensService.findGreensById(greensId);
			// 商品描述
			String body = greens.getGreensName();
			// 商户订单号
			String out_trade_no = sid.nextShort();
			// 订单总金额，单位为分
			String total_fee = "1"/*Integer.valueOf(totalCount)*100*/;
			// 统一下单
			PreOrderResult preOrderResult = wxOrderService.placeOrder(body, out_trade_no, total_fee);

			ModelAndView mv = new ModelAndView("pay/jsp/payQrCode");
			mv.addObject("qrCodeUrl", preOrderResult.getCode_url());
			return mv;
		}
//		ModelAndView mv = new ModelAndView("goPay");
//		mv.addObject("order", order);
//		mv.addObject("p", p);
		
		return new ModelAndView("front/index");
	}
	
	/**
	 * 
	 * @Description: 扫码完毕后每隔3秒检查是否支付成功
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 * 
	 * @author leechenxiang
	 * @date 2017年9月1日 上午9:01:09
	 */
	@RequestMapping(value = "/wxPayIsSuccess")
	@ResponseBody
	public boolean wxPayIsSuccess(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO 查看订单是否支付成功，成功返回true，失败返回false
		return isOrderPaid;
	}
	
	/**
	 * 
	 * @Description: 微信支付异步通知
	 * 					1. 支付成功修改订单状态，标记为成功
	 * 					2. 生成支付流水

	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 * 
	 * @author leechenxiang
	 * @date 2017年8月31日 下午4:01:57
	 */
	@RequestMapping(value = "/notify")
	public void notify(HttpServletRequest request, HttpServletResponse response) throws Exception {

		cn.kgc.eat.utils.pay.wx.entity.PayResult payResult = wxOrderService.getWxPayResult(request);
		
		boolean isPaid = payResult.getReturn_code().equals("SUCCESS") ? true : false;
		
		// 查询该笔订单在微信那边是否成功支付
		// 支付成功，商户处理后同步返回给微信参数
		PrintWriter writer = response.getWriter();
		if (isPaid) {
			System.out.println("================================= 支付成功 =================================");
			
			// ====================== 操作商户自己的业务，比如修改订单状态，生成支付流水等 start ==========================
			// TODO
			this.isOrderPaid = true;
			// ============================================ 业务结束， end ==================================
			
			// 通知微信已经收到消息，不要再给我发消息了，否则微信会8连击调用本接口
			String noticeStr = setXML("SUCCESS", "");
			writer.write(noticeStr);
			writer.flush();
						
		} else {
			System.out.println("================================= 支付失败 =================================");
			
			// 支付失败
			String noticeStr = setXML("FAIL", "");
			writer.write(noticeStr);
			writer.flush();
		}
		
	}
	
	/**
	 * 
	 * @Description: 支付成功
	 * @return
	 * @throws Exception
	 * 
	 * @author leechenxiang
	 * @date 2017年9月1日 上午9:10:41
	 */
	@RequestMapping(value = "/paySuccess")
	public String paySuccess() throws Exception {
		
		return "paySuccess";
	}
	
	public static String setXML(String return_code, String return_msg) {
		return "<xml><return_code><![CDATA[" + return_code + "]]></return_code><return_msg><![CDATA[" + return_msg + "]]></return_msg></xml>";
	}
}
