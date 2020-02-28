package cn.kgc.eat.controller;
import cn.kgc.eat.pojo.EatOrder;
import cn.kgc.eat.service.EatOrderService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("order")
public class EatOrderController{
    private Logger logger=Logger.getLogger(EatOrderController.class);
    @Resource
    private EatOrderService EatOrderService;

    /**
     * 前台骑手查询订单信息及状态
     * @姚天祥 set 2020-02-25 09:00
     * */
    @RequestMapping(value = "/findUnOrder")
    public Object findUnOrder(Model model) {
        //Object json = null;
        List<EatOrder> eatOrderList = this.EatOrderService.findUnOrder();
        model.addAttribute("eatOrderList",eatOrderList);
        return "front/horseman-index";
        //json = JSON.toJSONString(eatOrderList);
        //return json;
    }

    /**
     * 前台商家查看未完成订单列表
     * @姚天祥 set 2020-02-27 15:00
     */
    //@ResponseBody
    @RequestMapping("/selectAllByName")
    public Object selectAllByName(String merchantName,Model model) {
        //Object json = null;
        List<EatOrder> eatOrderList = this.EatOrderService.selectAllByName(merchantName);
        System.out.println(eatOrderList.toString());
        model.addAttribute("eatOrderList",eatOrderList);
        //json = JSON.toJSONString(eatOrderList);
        //return json;
        return "front/merchant-order";

    }

    /**
     * 前台骑手接受订单
     * @姚天祥 set 2020-02-28 14:00
     */
    @RequestMapping("/doOrder")
    public Object doOrder(String orderId) {
        this.EatOrderService.doOrder(orderId);
        return "redirect:findUnOrder";
    }

    /**
     * 前台骑手完成配送任务
     * @姚天祥 set 2020-02-28 14:30
     */
    @RequestMapping("/overOrder")
    public Object overOrder(String orderId) {
        this.EatOrderService.overOrder(orderId);
        return "redirect:findUnOrder";
    }

}