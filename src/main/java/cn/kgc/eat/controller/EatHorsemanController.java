package cn.kgc.eat.controller;
import cn.kgc.eat.pojo.EatHorseman;
import cn.kgc.eat.service.EatHorsemanService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import org.apache.ibatis.annotations.Param;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/horseman")
public class EatHorsemanController{
    private Logger logger=Logger.getLogger(EatHorsemanController.class);
    @Resource
    private EatHorsemanService EatHorsemanService;

    /**
     * 后台骑手管理主页
     * @姚天祥 set 2020-02-23 08:30
     */
    @RequestMapping("/toindex")
    public Object toindex() {
        return "back/horseman";
    }
    /**
     * 后台骑手添加主页
     * @姚天祥 set 2020-02-23 08:30
     */
    @RequestMapping("/toadd")
    public Object toadd() {
        return "back/horseman-add";
    }
    /**
     * 后台骑手添加功能
     * @姚天祥 set 2020-02-23 08:30
     */
    @RequestMapping("/addHoresman")
    public Object addHoresman(EatHorseman horseman){
        int i = this.EatHorsemanService.insertSelective(horseman);
        if (i>0) {
            return "redirect:selectHoresmanAll";
        }else {
            //return "back/horseman-add";
            throw new RuntimeException("添加失败");
        }
    }

    /**
     * 后台骑手根据姓名或电话搜索功能
     * @姚天祥 set 2020-02-23 08:30
     */
    @RequestMapping(value = "/selectHoresmanByNameOrPhone",produces = {"application/json;charset=UTF-8"})
    public Object selectHoresmanByNameOrPhone (EatHorseman eatHorseman, Model model) {
        List<EatHorseman> eatHorsemanList = this.EatHorsemanService.selectHoresmanByNameOrPhone(eatHorseman);
        model.addAttribute("eatHorsemanList",eatHorsemanList);
        return "back/horseman";
    }


//    @RequestMapping(value = "selectHoresmanByNameOrPhone",produces = {"application/json;charset=UTF-8"})
//    public Object selectHoresmanByNameOrPhone (@Param("horsemanName")String horsemanName,@Param("horsemanPhone")String horsemanPhone) {
//        Object json = null;
//        List<EatHorseman> eatHorsemanList = this.EatHorsemanService.selectHoresmanByNameOrPhone(horsemanName,horsemanPhone);
//        json = JSON.toJSONString(eatHorsemanList);
//        return json;
//    }

    /**
     * 后台显示骑手信息列表
     * @姚天祥 set 2020-02-23 08:30
     */
//    @RequestMapping(value = "/selectHoresmanAll")
//    public Object selectHoresmanAll (Model model) {
//        List<EatHorseman> eatHorsemanList = this.EatHorsemanService.selectHoresmanAll();
//        model.addAttribute("eatHorsemanList",eatHorsemanList);
//        return "back/horseman";
//    }

    /**
     * 后台显示骑手信息列表
     * @姚天祥 set 2020-02-23 08:30
     */
    @ResponseBody
    @RequestMapping(value = "/selectHoresmanAll",produces = {"application/json;charset=UTF-8"})
    public Object selectHoresmanAll () {
        Object json = null;
        //Map<String,Object> map = new HashMap<>();
        List<EatHorseman> eatHorsemanList = this.EatHorsemanService.selectHoresmanAll();
        //map.put("result",eatHorsemanList);
        //return JSONArray.toJSONString(map);
        json = JSON.toJSONString(eatHorsemanList);
        return json;
    }

    /**
     * 后台显示骑手信息列表
     * @姚天祥 set 2020-02-23 08:30
     */
    @RequestMapping("/selectByPrimaryKey")
    public Object selectByPrimaryKey(@Param("horsemanPhone")String horsemanPhone,Model model) {
        EatHorseman eatHorseman = this.EatHorsemanService.selectByPrimaryKey(horsemanPhone);
        model.addAttribute("eatHorseman",eatHorseman);
        return "back/horseman-update";
    }


    /**
     * 后台根据电话删除骑手信息
     * @姚天祥 set 2020-02-23 08:30
     */
    @RequestMapping("/deleteByPrimaryKey")
    public Object deleteByPrimaryKey(@Param("horsemanPhone")String horsemanPhone) {
        int i = this.EatHorsemanService.deleteByPrimaryKey(horsemanPhone);
        if (i>0) {
            System.out.println("删除成功");
            return "redirect:selectHoresmanAll";
        }else {
            throw new RuntimeException("删除失败");
        }
    }

    /**
     * 后台根据电话修改骑手信息
     * @姚天祥 set 2020-02-23 08:30
     */
    @RequestMapping("/updateByPhone")
    public Object updateByPhone(EatHorseman eatHorseman) {
        int i = this.EatHorsemanService.updateByPhone(eatHorseman);
        if (i>0) {
            return "redirect:selectHoresmanAll";
        } else {
            return "back/horseman-update";
        }
    }

}