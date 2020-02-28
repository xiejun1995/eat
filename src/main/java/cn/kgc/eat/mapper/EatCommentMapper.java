package cn.kgc.eat.mapper;

import cn.kgc.eat.pojo.EatComment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EatCommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eat_comment
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    int deleteByPrimaryKey(Long commentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eat_comment
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    int insert(EatComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eat_comment
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    int insertSelective(EatComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eat_comment
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    EatComment selectByPrimaryKey(Long commentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eat_comment
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    int updateByPrimaryKeySelective(EatComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eat_comment
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    int updateByPrimaryKeyWithBLOBs(EatComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eat_comment
     *
     * @mbggenerated Sat Feb 22 14:23:02 CST 2020
     */
    int updateByPrimaryKey(EatComment record);

    /**
     * 前台：根据商家id查询评论信息
     * @param commentMerchantId
     * @return
     */
    List<EatComment> commentList(@Param("commentMerchantId") Integer commentMerchantId);

    /**
     * 前台：根据评论名字查询用户id
     * @param userName
     * @return
     */
    Integer commentAuthorByName(String userName);

    /**
     * 前台：添加用户评论方法
     * @param comment
     * @return
     */
    int addComment(EatComment comment);


    /**
     * 前台：删除用户评论方法
     * @param id
     * @return
     */
    int deleteComment(@Param("id") Integer id);

    /**
     * 前台：根据用户id查询商家id
     * @param id
     * @return
     */
    Integer selectEatCommentById(@Param("id") Integer id);
    /**
     * 后台查询全部评论
     * @姚天祥 set 2020-02-28 09:00
     */
    List<EatComment> selectAll();
    /**
     * 后台根据ID查询评论
     * @姚天祥 set 2020-02-28 10:00
     */
    EatComment findComById(@Param("commentId")Integer commentId);
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