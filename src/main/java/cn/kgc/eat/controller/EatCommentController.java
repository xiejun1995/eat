package cn.kgc.eat.controller;
import cn.kgc.eat.pojo.EatComment;
import cn.kgc.eat.service.EatCommentService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/comment")
public class EatCommentController{
    private Logger logger=Logger.getLogger(EatCommentController.class);
    @Resource
    private EatCommentService EatCommentService;

    /**
     * 前台页面：根据商家id查询评论信息
     * @param comment
     * @param model
     * @return
     */
    @RequestMapping("/commentList")
    public String commentList(EatComment comment, Model model){
        List<EatComment> list=null;
        list=EatCommentService.commentList(comment.getCommentMerchantId());
        System.out.println("集合："+list);
        if (list!=null){
            model.addAttribute("list",list);
            return "front/comment";
        }else{
            return "front/index";
        }
    }

    /**
     * 前台：添加用户评论
     * @return
     */
    @RequestMapping("/addComment")
    public String addComment(HttpServletRequest request){
        Integer commentMerchantId= Integer.valueOf(request.getParameter("commentMerchantId"));
        String userName=request.getParameter("userName");
        Integer commentAuthor=EatCommentService.commentAuthorByName(userName);
        String commentContent=request.getParameter("commentContent");
        EatComment comment=new EatComment(commentMerchantId,commentAuthor,new Date()
                ,commentContent);
        int count=EatCommentService.addComment(comment);
        if (count>0){
            System.out.println("添加评论成功");
        }else{
            System.out.println("添加评论失败");
        }
        return "redirect:commentList?commentMerchantId="+commentMerchantId;
    }

    /**
     *
     * @param id
     * @return
     */
    @RequestMapping("/deleteComment")
    public String deleteComment(Integer id){
        Integer result=EatCommentService.selectEatCommentById(id);
       int count= EatCommentService.deleteComment(id);
       if (count>0){
           System.out.println("删除评论成功");
       }else{
           System.out.println("删除评论失败");
       }

        System.out.println("商家id是："+result);
       return  "redirect:commentList?commentMerchantId="+result;

    }














}