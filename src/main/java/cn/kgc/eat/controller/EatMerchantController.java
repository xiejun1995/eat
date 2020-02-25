package cn.kgc.eat.controller;
import cn.kgc.eat.pojo.EatMerchant;
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
import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/merchant")
public class EatMerchantController{
    private Logger logger=Logger.getLogger(EatMerchantController.class);
    @Resource
    private EatMerchantService EatMerchantService;

    /**
     *转向商家管理主页
     * @姚天祥 set 2020-02-24 08:30
     */
    @RequestMapping("/toindex")
    public Object toindex() {
        return "back/merchant";
    }

    /**
     * 根据ID查询商家详细信息
     * @姚天祥 set 2020-02-24 08:30
     */
    @RequestMapping("/findMetByid")
    public Object findMetByid(Integer merchantId, Model model) {
        EatMerchant eatMerchant = this.EatMerchantService.findMetByid(merchantId);
        model.addAttribute("eatMerchant",eatMerchant);
        return "back/merchant-update";
    }

    /**
     * 根据商家名称、地址查询商家信息列表
     * @姚天祥 set 2020-02-24 09:30
     */
    @RequestMapping("/selectMerByNameAddressGreensN")
    public Object selectMerByNameAddressGreensN(String merchantName,String merchantAddress,Model model) {
        List<EatMerchant> eatMerchantList = this.EatMerchantService.selectMerByNameAddressGreensN(merchantName,merchantAddress);
        model.addAttribute("eatMerchantList",eatMerchantList);
        return "back/merchant";
    }

    /**
     * 根据菜品名称查询商家信息
     * 姚天祥 set 2020-02-24 09:30
     */
    @RequestMapping("/selectMerByName")
    public Object selectMerByName(String greensName,Model model) {
        List<EatMerchant> eatMerchantList = this.EatMerchantService.selectMerByName(greensName);
        model.addAttribute("eatMerchantList",eatMerchantList);
        System.out.println(eatMerchantList.toString()+"con");
        return "back/merchant";
    }

    /**
     * 查询所有商家信息列表
     * 姚天祥 set 2020-02-24 09:30
     */
    @RequestMapping("/selectAll")
    public Object selectAll(Model model) {
        List<EatMerchant> eatMerchantList = this.EatMerchantService.selectAll();
        model.addAttribute("eatMerchantList",eatMerchantList);
        return "back/merchant";
    }

    /**
     * 修改商家信息
     * @姚天祥 set 2020-02-24 10:30
     */
    @RequestMapping("/updateById")
    public Object updateById(EatMerchant eatMerchant) {
        int i = this.EatMerchantService.updateById(eatMerchant);
        if (i>0) {
            return "redirect:selectAll";
        }else {
            return "back/merchant-update";
        }
    }
}