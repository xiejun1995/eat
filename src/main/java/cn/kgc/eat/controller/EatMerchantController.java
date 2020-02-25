package cn.kgc.eat.controller;
import cn.kgc.eat.pojo.EatMerchant;
import cn.kgc.eat.pojo.EatUser;
import cn.kgc.eat.service.EatMerchantService;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("")
public class EatMerchantController{
    private Logger logger=Logger.getLogger(EatMerchantController.class);
    @Resource
    private EatMerchantService EatMerchantService;

    /**
     * @author 齐宏伟
     * @desc 根据商家名称、电话号码查询商家信息（后台）
     * @date 2020/2/24
     */
    @RequestMapping(value = "getMerchantByName")
    public String  getMerchantByName(Model model){
        String MERCHANT_NAME = null;
        String MERCHANT_PHONE = null;
        List<EatMerchant> listMerchant = EatMerchantService.getMerchantListByName(MERCHANT_NAME,MERCHANT_PHONE);
        model.addAttribute("listMerchant",listMerchant);
        return "back/select-merchant";
    }

    /**
     * @author 齐宏伟
     * @desc 管理员添加商家信息（后台）
     * @date 2020/2/24
     */
    @RequestMapping(value="/toAddMerchant")
    public String toAddMerchant(){
        return "back/add-merchant";
    }
    @RequestMapping(value="/addMerchant")
    public String addMerchant(EatMerchant eatMerchant){
        int result = EatMerchantService.insertSelective(eatMerchant);
        if(result != 0){
            logger.info("增加商家成功");
        }
        return "redirect:/getMerchantByName";
    }


    /**
     * @author 齐宏伟
     * @desc 管理员根据商家id修改商家信息（后台）
     * @date 2020/2/24
     */
    @RequestMapping(value="/toUpdateMerchant")
    public String toUpdateMerchant(HttpServletRequest request,Model model){
      String id = request.getParameter("merchantId");
      Integer merchantId = Integer.parseInt(id);
      EatMerchant eatMerchant = EatMerchantService.getEatMerchantById(merchantId);
      model.addAttribute(eatMerchant);
      return "back/update-merchant";
    }
    @RequestMapping(value="/updateMerchant")
    public String updateMerchant(EatMerchant record){
        int result = EatMerchantService.updateByPrimaryKeySelective(record);
        if(result!=0){
            System.out.print("修改用户成功");
        }
        return "redirect:/getMerchantByName";
    }

    /**
     * @author 齐宏伟
     * @desc 管理员删除商家信息（后台）
     * @date 2020/2/24
     */
    @RequestMapping(value = "deleteMerchant")
    public String  deleteMerchant(HttpServletRequest request){
        String id = request.getParameter("merchantId");
        Integer merchantId = Integer.parseInt(id);
        int result = EatMerchantService.deleteByPrimaryKey(merchantId);
        if(result!=0){
            System.out.print("删除商家成功");
        }
        return "redirect:/getMerchantByName";
    }
}