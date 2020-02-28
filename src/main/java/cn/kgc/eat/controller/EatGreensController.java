package cn.kgc.eat.controller;
import cn.kgc.eat.pojo.EatGreens;
import cn.kgc.eat.service.EatGreensService;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/greens")
public class EatGreensController{
    private Logger logger=Logger.getLogger(EatGreensController.class);
    @Resource
    private EatGreensService EatGreensService;

    /**
     * 转向前台添加菜品页面
     * @姚天祥 set 2020-02-27 14:00
     */
    @RequestMapping("/toadd")
    public Object toadd() {
        return "front/merchant-add";
    }
    /**
     * 添加菜品信息
     * @姚天祥 set 2020-02-26 09:00
     *
     */
    @RequestMapping("/addGreens")
    public Object addGreens(EatGreens eatGreens) {
        int i = this.EatGreensService.addGreens(eatGreens);
        if (i>0) {
            return "front/merchant-index";
        }else {
            return "front/merchant-add";
        }
    }

    /**
     * 删除菜品信息
     * @姚天祥 set 2020-02-27 09:00
     */
    @RequestMapping("/deleteById")
    public Object deleteById(Integer greensId) {
        int i = this.EatGreensService.deleteById(greensId);
        if (i>0) {
            return "front/merchant-index";
        }else {
            return "front/merchant-index";
        }
    }

    /**
     * 查询所有菜品
     * @姚天祥 set 2020-02-27 10:00
     */
    @RequestMapping("/selectAll")
    public Object selectAll(String greensName,Model model) {
        List<EatGreens> eatGreensList = this.EatGreensService.selectAll(greensName);
        model.addAttribute("eatGreensList",eatGreensList);
        return "front/merchant-index";
    }

    /**
     * 查看菜品详情
     * @姚天祥 set 2020-02-27 11:00
     */
    @RequestMapping("/findGreensById")
    public Object findGreensById(String greensId,Model model) {
        EatGreens eatGreens = this.EatGreensService.findGreensById(greensId);
        model.addAttribute("eatGreens",eatGreens);
        return "front/merchant-update";
    }

    /**
     * 修改菜品详情
     * @姚天祥 set 2020-02-27 11:00
     */
    @RequestMapping(value = "/updateGreensById",method = RequestMethod.POST)
    public Object updateGreensById(@RequestParam("fileName")MultipartFile[] muitipartFiles,EatGreens eatGreens,
                                   HttpServletRequest request ) {
        try {
            //项目部署路径（根路径）
            String filePath=request.getSession().getServletContext().getRealPath("statics"+File.separator+"img");
            System.out.println("全文路径："+filePath);
            for (MultipartFile multipartFile:muitipartFiles) {
                //获取系统当前时间+图片名称(图片文件名称)
                String fileName=System.currentTimeMillis()+""+multipartFile.getOriginalFilename();
                File file=new File(filePath+fileName);
                multipartFile.transferTo(file);
                String filenames = filePath+fileName;
                eatGreens.setGreensPic(filenames);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        int i = this.EatGreensService.updateGreensById(eatGreens);
        if (i>0) {
            return "redirect:selectAll";
        }else {
            return "front/merchant-update";
        }
    }


    /**
     * 添加图片
     * @姚天祥 set 2020-02-27 19:00
     */
    @RequestMapping(value = "/addPics",method = RequestMethod.POST)
    public  String doUpload(@RequestParam(value = "fileName")  MultipartFile[] muitipartFiles,EatGreens eatGreens,
                            HttpServletRequest request){
        try {
            //项目部署路径（根路径）
            String filePath=request.getSession().getServletContext().getRealPath("statics"+File.separator+"img");
            System.out.println("全文路径："+filePath);
            for (MultipartFile multipartFile:muitipartFiles) {
                //获取系统当前时间+图片名称(图片文件名称)
                String fileName=System.currentTimeMillis()+""+multipartFile.getOriginalFilename();
                File file=new File(filePath+fileName);
                multipartFile.transferTo(file);
                String filenames = filePath+fileName;
                eatGreens.setGreensPic(filenames);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        int i = this.EatGreensService.addGreens(eatGreens);
        if (i>0) {
            return "redirect:selectAll";
        }else {
            return "front/merchant-add";
        }
    }

}