package cn.kgc.eat.service;

import cn.kgc.eat.pojo.EatComment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EatCommentService{
    /**
     * 根据商家id查询评论信息
     * @param commentMerchantId
     * @return
     */
    List<EatComment> commentList(@Param("commentMerchantId") Integer commentMerchantId);

    /**
     * 根据评论名字查询用户id
     * @param userName
     * @return
     */
    Integer commentAuthorByName(String userName);

    /**
     * 添加用户评论方法
     * @param comment
     * @return
     */
    int addComment(EatComment comment);

    /**
     * 删除用户评论方法
     * @param id
     * @return
     */
    int deleteComment(@Param("id") Integer id);
    /**
     * 前台：根据用户id查询商家id
     * @param id
     * @return
     */
    Integer selectEatCommentById(@Param("id")Integer id);


}