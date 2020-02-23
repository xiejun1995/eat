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

    @RequestMapping("/toindex")
    public Object toindex() {
        return "back/horseman";
    }

    @RequestMapping("/toadd")
    public Object toadd() {
        return "back/horseman-add";
    }

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


    @RequestMapping(value = "/selectHoresmanByNameOrPhone",produces = {"application/json;charset=UTF-8"})
    public Object selectHoresmanByNameOrPhone (@Param("horsemanName")String horsemanName,@Param("horsemanPhone")String horsemanPhone,Model model) {
        List<EatHorseman> eatHorsemanList = this.EatHorsemanService.selectHoresmanByNameOrPhone(horsemanName,horsemanPhone);
        model.addAttribute("eatHorsemanList",eatHorsemanList);
        return "redirect:selectHoresmanAll";
    }


//    @RequestMapping(value = "selectHoresmanByNameOrPhone",produces = {"application/json;charset=UTF-8"})
//    public Object selectHoresmanByNameOrPhone (@Param("horsemanName")String horsemanName,@Param("horsemanPhone")String horsemanPhone) {
//        Object json = null;
//        List<EatHorseman> eatHorsemanList = this.EatHorsemanService.selectHoresmanByNameOrPhone(horsemanName,horsemanPhone);
//        json = JSON.toJSONString(eatHorsemanList);
//        return json;
//    }

    @RequestMapping(value = "/selectHoresmanAll")
    public Object selectHoresmanAll (Model model) {
        List<EatHorseman> eatHorsemanList = this.EatHorsemanService.selectHoresmanAll();
        model.addAttribute("eatHorsemanList",eatHorsemanList);
        return "back/horseman";
    }

//    @RequestMapping(value = "/selectHoresmanAll",produces = {"application/json;charset=UTF-8"})
//    public Object selectHoresmanAll () {
//        Map<String,Object> map = new HashMap<>();
//        List<EatHorseman> eatHorsemanList = this.EatHorsemanService.selectHoresmanAll();
//        map.put("result",eatHorsemanList);
//        return JSONArray.toJSONString(map);
        //Object json = JSON.toJSONString(eatHorsemanList);
        //return json;
//    }

    @RequestMapping("/selectByPrimaryKey")
    public Object selectByPrimaryKey(@Param("horsemanPhone")String horsemanPhone,Model model) {
        EatHorseman eatHorseman = this.EatHorsemanService.selectByPrimaryKey(horsemanPhone);
        model.addAttribute("eatHorseman",eatHorseman);
        return "back/horseman-update";
    }

    @RequestMapping("/updateByPrimaryKeySelective")
    public Object updateByPrimaryKeySelective (EatHorseman eatHorseman) {
        int i = this.EatHorsemanService.updateByPrimaryKeySelective(eatHorseman);
        if (i>0) {
            return "redirect:selectHoresmanAll";
        }else {
            return "back/horseman-update";
        }
    }

    @RequestMapping("/updateByPrimaryKey")
    public Object updateByPrimaryKey(@Param("horsemanPhone")String horsemanPhone) {
        int i = this.EatHorsemanService.updateByPrimaryKey(horsemanPhone);
        System.out.println("-----------controller"+horsemanPhone);
        if (i>0) {
            return "redirect:selectHoresmanAll";
        }else {
            return "back/horseman-update";
        }
    }

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

    @RequestMapping("/updateByPhone")
    public Object updateByPhone(String horsemanName) {
        int i = this.EatHorsemanService.updateByPhone(horsemanName);
        if (i>0) {
            return "redirect:selectHoresmanAll";
        }else {
            return "back/horseman-update";
        }
    }

}