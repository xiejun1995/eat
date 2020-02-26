package cn.kgc.eat.controller;
import cn.kgc.eat.pojo.EatOrder;
import cn.kgc.eat.service.EatOrderService;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.List;

@Controller
@RequestMapping("/order")
public class EatOrderController{
    private Logger logger=Logger.getLogger(EatOrderController.class);
    @Resource
    private EatOrderService EatOrderService;

    /**
     * 前台：我的订单
     * @param name
     * @param model
     * @return
     */
    @RequestMapping(value = "/myorder")
    public String myOrderList(String name, Model model){
        List<EatOrder> list=EatOrderService.MyOrderList(name);
        if (list!=null){
            System.out.println("我的订单有："+list.size());
            model.addAttribute("orderList",list);
            return "front/orderList";
        }else{
            System.out.println("没有我的订单");
            return "front/index";
        }

    }

    /**
     * 前台：删除我的订单
     * @param id
     * @param attr
     * @return
     */
    @RequestMapping(value = "/delete")
    public String deleteOrder(String id, RedirectAttributes attr){
        String name=EatOrderService.selectOrderById(id);
        attr.addAttribute("name",name);
        System.out.println("根据id查出姓名为："+name);
        int count=EatOrderService.deleteOrderById(id);
        if (count>0){
            System.out.println("删除订单成功");
            return "redirect:myorder";
        }else{
            System.out.println("删除订单失败");
            return  "front/index";
        }
    }

    /**
     * 前台：根据所有条件查询订单信息
     * @param model
     * @param request
     * @param attr
     * @return
     */
    @RequestMapping("/selectByAll")
    public String orderListByAll(Model model, HttpServletRequest request,
                            RedirectAttributes attr){
        String name=request.getParameter("name");
        String text=request.getParameter("text");
        List<EatOrder> list=EatOrderService.orderListByAll(text);
        attr.addAttribute("name",name);
        if (list!=null){
            System.out.println("根据所有条件查询成功");
            model.addAttribute("orderListByAll",list);
            return  "front/orderList";
        }else{
            System.out.println("根据所有条件查询失败");
            return "front/index";
        }

    }





    /**
     * 后台：订单管理-查询所有订单
     * @param model
     * @return
     */
    @RequestMapping("/orderList")
    public String orderList(Model model){
        List<EatOrder> list=EatOrderService.orderList();
        if (list!=null){
            System.out.println("查询所有订单为："+list.size());
            model.addAttribute("orderList",list);
            return "back/orderList";
        }else{
            System.out.println("查询所有订单失败");
            return "back/index";
        }
    }

    /**
     * 后台：订单管理--删除订单
     * @param id
     * @return
     */
    @RequestMapping("/deleteOrder")
    public String deleteOrder(String id){
        int count=EatOrderService.deleteOrder(id);
        if (count>0){
            System.out.println("后台删除成功");
            return "redirect:orderList";
        }else{
            System.out.println("后台删除失败");
            return "back/index";
        }
    }





}