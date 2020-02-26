package cn.kgc.eat.controller;
import cn.kgc.eat.pojo.EatGreens;
import cn.kgc.eat.service.EatGreensService;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;
@Controller
@RequestMapping("")
public class EatGreensController{
    private Logger logger=Logger.getLogger(EatGreensController.class);
    @Resource
    private EatGreensService EatGreensService;

    /**
     * 添加菜品信息
     * @姚天祥 set 2020-02-26 09:00
     *
     */
    @RequestMapping("/addGreens")
    public Object addGreens(EatGreens eatGreens) {
        int i = this.EatGreensService.addGreens(eatGreens);
        if (i>0) {
            return "front/index";
        }else {
            return "front/greens-add";
        }
    }

}