package cn.kgc.eat.controller;
import cn.kgc.eat.pojo.EatUser;
import cn.kgc.eat.service.EatUserService;
import cn.kgc.eat.utils.constant.Constant;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 用户相关处理器类
 * @author 谢军军
 * @Email 18045972801@163.com
 * @date 2020/2/24 11:10
 */

@Controller
@RequestMapping("/user")
public class EatUserController{
    private Logger logger=Logger.getLogger(EatUserController.class);
    @Resource
    private EatUserService eatUserService;

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
     * 前台用户登录验证
     * @param username
     * @param password
     * @return
     */
    @RequestMapping("/front/doLogin")
    public String frontDoLogin(@RequestParam("username") String username, @RequestParam("password") String password, HttpSession session, HttpServletRequest request){
        EatUser eatUser=eatUserService.getEatUserByUserName(username);
        if(eatUser!=null){
            if(eatUser.getUserPassword().equals(password)){
                session.setAttribute("eatUser",eatUser);
                return "front/index";
            }else{
                request.setAttribute("msg", Constant.USER_PWD_ERROR);
                return "front/login";
            }
        }else{
            request.setAttribute("msg",Constant.USER_NAME_ERROR);
            return "front/login";
        }
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
    @RequestMapping("/front/login")
    public String frontLogin(){
        return "front/form";
    }

}