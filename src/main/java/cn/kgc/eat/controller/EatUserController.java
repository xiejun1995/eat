package cn.kgc.eat.controller;
import cn.kgc.eat.pojo.EatMerchant;
import cn.kgc.eat.pojo.EatUser;
import cn.kgc.eat.service.EatUserService;
import cn.kgc.eat.utils.constant.Constant;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

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
    public String frontDoLogin(@RequestParam("username") String username, @RequestParam("password") String password, HttpSession session, HttpServletRequest request) throws ParseException {
        if(username!="" && password!=""){
            EatUser eatUser=new EatUser();
            eatUser.setUserName("张三");
            eatUser.setUserPassword("123456");
            eatUser.setUserBornDate(new SimpleDateFormat("yyyy-MM-dd").parse("2020-02-22"));
            eatUser.setUserAddress("兰州安宁");
            eatUser.setUserAddressId(1);
            eatUser.setUserPhone("17777777777");
            eatUser.setUserRole(1);
            if(eatUser.getUserName().equals(username)){
                if(eatUser.getUserPassword().equals(password)){
                    session.setAttribute("eatUser",eatUser);
                    return "front/index";
                }else{
                    request.setAttribute("msg", Constant.USER_PWD_ERROR);
                    return "front/login";
                }
            }else{
                request.setAttribute("msg", Constant.USER_NAME_ERROR);
                return "front/login";
            }
        }else{
            request.setAttribute("msg", Constant.USER_NAME_EMPTY);
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

    /*使用spring 表单：实现用户添加功能*/
    /**
     * 前台：添加用户页面
     *
     * @return
     */
    @RequestMapping(value = "/doAddUser",method = RequestMethod.GET)
    public String doAddUser(@ModelAttribute("eatUser")EatUser eatUser) {
        return "front/do-add-user";
    }

    /**
     * 前台：添加用户方法
     *
     * @param user
     * @return
     */
    @RequestMapping(value = "/doAddUser",method = RequestMethod.POST)
    public String addUser(@Valid EatUser user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()){
            return "front/do-add-user";
        }
        int count = eatUserService.addUser(user);
        if (count > 0) {
            System.out.println("用户添加成功");
        } else {
            System.out.println("用户添加失败");
        }
        return "front/index";
    }


    /*普通表单提交数据*/
    /**
     * 前台：添加用户页面
     *
     * @return
     */
   /* @RequestMapping("/doAddUser")
    public String doAddUser(@ModelAttribute("user")EatUser user) {
        return "front/do-add-user";
    }*/

    /**
     * 前台：添加用户方法
     *
     * @param user
     * @return
     */
   /* @RequestMapping("/addUser")
    public String addUser(EatUser user) {
        int count = EatUserService.addUser(user);
        if (count > 0) {
            System.out.println("用户添加成功");
        } else {
            System.out.println("用户添加失败");
        }
        return "front/index";
    }*/

    /**
     * 前台：删除用户方法
     * @param id
     * @return
     */
    @RequestMapping("/delete")
    public String deleteUser(Integer id) {
        int count = eatUserService.deleteUser(id);
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
    public String selectUserById(Integer id, Model model){
        EatUser user=eatUserService.selectUserById(id);
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
        int count=eatUserService.updateUser(user);
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
            List<EatMerchant> list =eatUserService.selectByAddressOrGreensName(text);
            if (list!=null){
                model.addAttribute("list",list);
                System.out.println("根据地址查询用户成功");
                return "front/merchant";
            }else{
                System.out.println("根据地址查询用户失败");
            }
        }
        return  "front/index";

    }

    /**
     * 多文件上传
     * @param muitipartFiles
     * @param request
     * @return
     */
    @RequestMapping("/upload")
    public  String doUpload(@RequestParam(value = "fileName") MultipartFile[] muitipartFiles,
                            HttpServletRequest request){
        try {
            //项目部署路径（根路径）
            String filePath=request.getSession().getServletContext().getRealPath("/")+"statics/upload/";
            System.out.println("全文路径："+filePath);
            for (MultipartFile multipartFile:muitipartFiles) {
                //获取系统当前时间+图片名称(图片文件名称)
                String fileName=System.currentTimeMillis()+""+multipartFile.getOriginalFilename();
                File file=new File(filePath+fileName);
                multipartFile.transferTo(file);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  "front/index";
    }
    /**
     * @author 齐宏伟
     * @desc 管理员查询用户信息(后台页面)
     * @date 2020/2/23
     */
    @RequestMapping(value = "/getUserList")
    public ModelAndView getUserList(){
        List<EatUser> userList =  eatUserService.getUserList();
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
        int result = eatUserService.insertSelective(eatUser);
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
        EatUser eatUser = eatUserService.getUserById(id);
        model.addAttribute(eatUser);
        return "back/update-user";
    }
    @RequestMapping(value="/updateUser")
    public String toUpdateUser(EatUser eatUser){
        int result = eatUserService.updateByPrimaryKeySelective(eatUser);
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
        int result =eatUserService.deleteByPrimaryKey(userId);
        if(result!=0){
            logger.info("用户删除成功");
        }
        return "redirect:/user/getUserList";
    }

}