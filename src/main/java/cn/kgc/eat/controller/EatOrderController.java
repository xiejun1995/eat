package cn.kgc.eat.controller;
import cn.kgc.eat.pojo.EatOrder;
import cn.kgc.eat.service.EatOrderService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
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
    @ResponseBody
    @RequestMapping(value = "/findUnOrder",produces = {"application/json;charset=UTF-8"})
    public Object findUnOrder() {
        Object json = null;
        List<EatOrder> eatOrderList = this.EatOrderService.findUnOrder();
        json = JSON.toJSONString(eatOrderList);
        return json;
    }

}