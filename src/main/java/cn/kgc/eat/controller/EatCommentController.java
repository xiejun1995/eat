package cn.kgc.eat.controller;
import cn.kgc.eat.pojo.EatComment;
import cn.kgc.eat.service.EatCommentService;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("comment")
public class EatCommentController{
    private Logger logger=Logger.getLogger(EatCommentController.class);
    @Resource
    private EatCommentService EatCommentService;

    /**
     * 后台转向添加评论页面
     * @姚天祥 set 2020-02-28 09:00
     */
    @RequestMapping("/toadd")
    public Object toadd() {
        return "back/comment-add";
    }

    /**
     * 后台查询全部评论
     * @姚天祥 set 2020-02-28 09:00
     */
    @RequestMapping("/selectAll")
    public Object selectAll(Model model) {
        List<EatComment> eatCommentList = this.EatCommentService.selectAll();
        model.addAttribute("eatCommentList",eatCommentList);
        return "back/commentselect";
    }
    /**
     * 后台添加评论
     * @姚天祥 set 2020-02-28 09:00
     */
    @RequestMapping("/addComment")
    public Object addComment(EatComment eatComment) {
        int i = this.EatCommentService.addComment(eatComment);
        if (i>0) {
            return "redirect:selectAll";
        } else {
            return "back/comment-add";
        }
    }

    /**
     * 后台根据ID查询评论
     * @姚天祥 set 2020-02-28 10:00
     */
    @RequestMapping("/findComById")
    public Object findComById(Integer commentId,Model model) {
        EatComment eatComment = this.EatCommentService.findComById(commentId);
        model.addAttribute("eatComment",eatComment);
        return "back/comment-update";

    }

    /**
     * 修改评论
     * @姚天祥 set 2020-02-28 10:00
     */
    @RequestMapping("/updateComment")
    public Object updateComment (EatComment eatComment) {
        int i = this.EatCommentService.updateComment(eatComment);
        if (i>0) {
            return "redirect:selectAll";
        }else {
            return "back/comment-update";
        }
    }

    /**
     * 根据ID删除评论信息
     * @姚天祥 set 2020-02-28 11:00
     */
    @RequestMapping("deleteById")
    public Object deleteById(Integer commentId) {
        this.EatCommentService.deleteById(commentId);
        return "redirect:selectAll";
    }

}