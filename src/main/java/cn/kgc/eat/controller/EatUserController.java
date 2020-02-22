package cn.kgc.eat.controller;
import cn.kgc.eat.service.EatUserService;
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
@RequestMapping("/user")
public class EatUserController{
    private Logger logger=Logger.getLogger(EatUserController.class);
    @Resource
    private EatUserService EatUserService;

    /**
     * 后台登录验证
     * @param username
     * @param password
     * @return
     */
    @RequestMapping("/doLogin")
    public String doLogin(@RequestParam("username") String username,@RequestParam("password") String password){
        return "back/index";
    }

    /**
     * 后台登录页面
     * @return
     */
    @RequestMapping("/toLogin")
    public String toLogin(){
        return "back/login";
    }

    /**
     * 前台主页面
     * @return
     */
    @RequestMapping("/Login")
    public String Login(){
        return "front/index";
    }

}