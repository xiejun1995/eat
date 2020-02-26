package cn.kgc.eat.controller;
import cn.kgc.eat.pojo.EatUser;
import cn.kgc.eat.service.EatUserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

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

    /**
     * @author 齐宏伟
     * @desc 管理员查询用户信息(后台页面)
     * @date 2020/2/23
     */
    @RequestMapping(value = "/getUserList")
    public ModelAndView getUserList(){
        List<EatUser> userList =  EatUserService.getUserList();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userList",userList);
        modelAndView.setViewName("back/select-user");
        return modelAndView;
    }

    /**
     * @author 齐宏伟
     * @desc 管理员增加用户信息(后台页面)
     * @date 2020/2/23
     */
    @RequestMapping(value="/toAddUser")
    public String toAddUser(){
        return "back/add-user";
    }
    @RequestMapping(value="/addUser")
    public String addUser(EatUser eatUser){
        int result = EatUserService.insertSelective(eatUser);
        if(result != 0){
            logger.info("增加用户成功");
        }
        return "redirect:/user/getUserList";
    }

    /**
     * @author 齐宏伟
     * @desc 管理员修改用户信息(后台页面)
     * @date 2020/2/23
     */
    @RequestMapping(value="/toUpdateUser")
    public String toUpdateUser(HttpServletRequest request, Model model){
        String id = request.getParameter("userId");
        EatUser eatUser = EatUserService.getUserById(id);
        model.addAttribute(eatUser);
        return "back/update-user";
    }
    @RequestMapping(value="/updateUser")
    public String updateUser(EatUser eatUser){
        int result = EatUserService.updateByPrimaryKeySelective(eatUser);
        if(result!=0){
            logger.info("修改用户成功");
        }
        return "redirect:/user/getUserList";
    }

    /**
     * @author 齐宏伟
     * @desc 管理员删除用户信息
     * @date 2020/2/23
     */
    @RequestMapping(value="/deleteUser")
    public String deleteUser(HttpServletRequest request){
        String id = request.getParameter("userId");
        Integer userId = Integer.parseInt(id);
       int result =EatUserService.deleteByPrimaryKey(userId);
       if(result!=0){
           logger.info("用户删除成功");
       }
        return "redirect:/user/getUserList";
    }

}