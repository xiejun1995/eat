package cn.kgc.eat.controller;
import cn.kgc.eat.pojo.EatMerchant;
import cn.kgc.eat.pojo.EatUser;
import cn.kgc.eat.service.EatUserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/user")
public class EatUserController {
    private Logger logger = Logger.getLogger(EatUserController.class);
    @Resource
    private EatUserService EatUserService;

    /**
     * 后台登录验证
     *
     * @param username
     * @param password
     * @return
     */
    @RequestMapping("/doLogin")
    public String doLogin(@RequestParam(value = "username", required = false) String username, @RequestParam(value = "password", required = false) String password) {
        return "back/index";
    }

    /**
     * 后台登录页面
     *
     * @return
     */
    @RequestMapping("/toLogin")
    public String toLogin() {
        return "back/login";
    }

    /**
     * 前台主页面
     *
     * @return
     */
    @RequestMapping("/Login")
    public String Login() {
        return "front/index";
    }

    /**
     * 前台：添加用户页面
     *
     * @return
     */
    @RequestMapping("/doAddUser")
    public String doAddUser() {

        return "front/do-add-user";
    }

    /**
     * 前台：添加用户方法
     *
     * @param user
     * @return
     */
    @RequestMapping("/addUser")
    public String addUser(EatUser user) {
        int count = EatUserService.addUser(user);
        if (count > 0) {
            System.out.println("用户添加成功");
        } else {
            System.out.println("用户添加失败");
        }
        return "front/index";
    }

    /**
     * 前台：删除用户方法
     * @param id
     * @return
     */
    @RequestMapping("/delete")
    public String deleteUser(Integer id) {
        int count = EatUserService.deleteUser(id);
        if (count > 0) {
            System.out.println("删除用户成功");
        } else {
            System.out.println("删除用户失败");
        }
        return "front/index";
    }

    /**
     * 前台：根据id查询用户方法
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/selectById")
    public String selectUserById(Integer id,Model model){
        EatUser user=EatUserService.selectUserById(id);
        System.out.println("返回值："+user);
        if (user!=null){
            model.addAttribute("user",user);
            return "front/selectUserById";
        }else{
            return "front/index";
        }
    }

    /**
     * 前台：修改用户评论
     * @param user
     * @return
     */
    @RequestMapping("/update")
    public String updateUser(EatUser user){
        int count=EatUserService.updateUser(user);
        if (count>0){
            System.out.println("修改用户成功");
        }else{
            System.out.println("修改用户失败");
        }
        return  "front/index";
    }

    /**
     * 前台：根据地址或者商家名称查询用户
     * @param model
     * @param request
     * @return
     */
    @RequestMapping("/selectByAddressORGreensName")
    public String selectByAddressORGreensName(Model model, HttpServletRequest request){
        String text=request.getParameter("text");
        if (text!=null||!text.trim().equals("")){
            List<EatMerchant> list =EatUserService.selectByAddressOrGreensName(text);
            if (list!=null){
                model.addAttribute("list",list);
                System.out.println("根据地址查询用户成功");
                return "merchant";
            }else{
                System.out.println("根据地址查询用户失败");
            }
        }
        return  "front/index";

    }














}