package cn.kgc.eat.controller;
import cn.kgc.eat.pojo.EatMerchant;
import cn.kgc.eat.service.EatMerchantService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
        return "back/merchantselect";
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