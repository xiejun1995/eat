package cn.kgc.eat.controller;
import cn.kgc.eat.pojo.EatGreens;
import cn.kgc.eat.service.EatGreensService;
import org.apache.commons.io.FilenameUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

@Controller
@RequestMapping("")
public class EatGreensController{
    private Logger logger=Logger.getLogger(EatGreensController.class);
    @Resource
    private EatGreensService EatGreensService;

    /**
     * @author 齐宏伟
     * @desc 根据菜品名称，价格，区域，分类查询菜品信息（后台）
     * @date 2020/2/25
     */
    @RequestMapping(value = "getGreensList")
    public String getGreensList(Model model){
        String GREENS_NAME= null;
        BigDecimal GREENS_PRICE =null; /*BigDecimal.valueOf(18);*/
        String CUISINE_NAME = null;
        String GREENS_ADDRESS = null;

        List <EatGreens> list = EatGreensService.getGreensList( GREENS_NAME, GREENS_PRICE, CUISINE_NAME,GREENS_ADDRESS);
        model.addAttribute("list",list);
        return "back/select-greens";
    }

    /**
     * @author 齐宏伟
     * @desc 添加菜品信息（后台）
     * @date 2020/2/26
     */
    @RequestMapping(value = "toAddGreens")
    public String toAddGreens(){
        return "back/add-greens";
    }
    @RequestMapping(value = "addGreens")
    public String addGreens(EatGreens eatGreens,HttpServletRequest request, MultipartFile multipartFile){
        String greensPic = null;
        if(!multipartFile.isEmpty()){
            String path = request.getSession().getServletContext().getRealPath("statics"+ File.separator+"img"+File.separator+"uploadFiles");
            String oldFileName = multipartFile.getOriginalFilename();
            String prefix = FilenameUtils.getExtension(oldFileName);
            int fileSize = 5000000;
            if(multipartFile.getSize() > fileSize){
                System.out.print("文件大小超过了500k");
                return "back/add-greens";
            }else if (prefix.equalsIgnoreCase("jpg")
                    ||prefix.equalsIgnoreCase("jpeg")
                    ||prefix.equalsIgnoreCase("png")
                    ||prefix.equalsIgnoreCase("pneg") ){
                String fileName = System.currentTimeMillis()+"_Personal.jpg";
                File targetFile = new File(path,fileName);
                if(!targetFile.exists()){
                    targetFile.mkdirs();
                }
                try {
                    multipartFile.transferTo(targetFile);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                greensPic = path+File.separator+fileName;
            }else{
                System.out.print("上传图片格式不正确");
                return "back/add-greens";
            }
        }
        eatGreens.setGreensPic(greensPic);
        int result = EatGreensService.insertSelective(eatGreens);
        if(result!=0){
            System.out.print("菜品添加成功");
        }
        return "redirect:getGreensList";
    }

    /**
     * @author 齐宏伟
     * @desc 修改菜品信息（后台）
     * @date 2020/2/26
     */
    @RequestMapping(value = "toUpdateGreens")
    public String toUpdateGreens(HttpServletRequest request,Model model){
        String id = request.getParameter("greensId");
        Long greenId = Long.valueOf(id);
        EatGreens eatGreens = EatGreensService.selectByPrimaryKey(greenId);
        model.addAttribute(eatGreens);
        return "back/update-greens";
    }
    @RequestMapping(value = "updateGreens")
    public String updateGreens(EatGreens eatGreens){
        int result = EatGreensService.updateByPrimaryKeySelective(eatGreens);
        if(result!=0){
            System.out.print("菜品修改成功");
        }
        return "redirect:getGreensList";
    }

    /**
     * @author 齐宏伟
     * @desc 删除菜品信息（后台）
     * @date 2020/2/26
     */
    @RequestMapping(value = "deleteGreens")
    public String deleteGreens(HttpServletRequest request){
        String id = request.getParameter("greensId");
        Long greensId = Long.valueOf(id);
        int result = EatGreensService.deleteByPrimaryKey(greensId);
        if(result!=0){
            System.out.print("菜品删除成功");
        }
        return "redirect:getGreensList";
    }


    @RequestMapping(value = "getGreensListByMerchantId")
    public String getGreensListByMerchantId(HttpServletRequest request,Model model){
       /* String id = request.getParameter("MERCHANT_SECURITY_ID");
        Integer MERCHANT_SECURITY_ID = Integer.parseInt(id);*/
        int MERCHANT_SECURITY_ID = 1;
        List <EatGreens> greensList = EatGreensService.getGreensListByMerchantId(MERCHANT_SECURITY_ID);
        System.out.print(greensList);
        model.addAttribute("greensList",greensList);
        return "front/greens-careful";
    }
}