package cn.kgc.eat.service;

import cn.kgc.eat.pojo.EatComment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EatCommentService{

    /**
     * 后台查询全部评论
     * @姚天祥 set 2020-02-28 09:00
     */
    List<EatComment> selectAll();

    /**
     * 后台添加评论
     * @姚天祥 set 2020-02-28 09:00
     */
    int addComment(EatComment eatComment);

    /**
     * 后台根据ID查询评论
     * @姚天祥 set 2020-02-28 10:00
     */
    EatComment findComById(Integer commentId);

    /**
     * 修改评论
     * @姚天祥 set 2020-02-28 10:00
     */
    int updateComment(EatComment eatComment);

    /**
     * 根据ID删除评论信息
     * @姚天祥 set 2020-02-28 11:00
     */
    int deleteById(@Param("commentId")Integer commentId);
}