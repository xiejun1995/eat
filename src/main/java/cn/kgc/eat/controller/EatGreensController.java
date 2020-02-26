package cn.kgc.eat.controller;
import cn.kgc.eat.pojo.EatGreens;
import cn.kgc.eat.service.EatGreensService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
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
        String GREENS_ADDRESS = "七里河";

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
    public String addGreens(EatGreens eatGreens){
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
}