package cn.kgc.eat.service.impl;
import cn.kgc.eat.pojo.EatComment;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.kgc.eat.mapper.EatCommentMapper;
import cn.kgc.eat.service.EatCommentService;

import java.util.List;

@Service
public class EatCommentServiceImpl implements EatCommentService{
    @Resource
    private EatCommentMapper EatCommentMapper;

    /**
     * 后台查询全部评论
     * @姚天祥 set 2020-02-28 09:00
     */
    @Override
    public List<EatComment> selectAll() {
        List<EatComment> eatCommentList = this.EatCommentMapper.selectAll();
        return eatCommentList;
    }
    /**
     * 后台添加评论
     * @姚天祥 set 2020-02-28 09:00
     */
    @Override
    public int addComment(EatComment eatComment) {
        int i = this.EatCommentMapper.addComment(eatComment);
        return i;
    }
    /**
     * 后台根据ID查询评论
     * @姚天祥 set 2020-02-28 10:00
     */
    @Override
    public EatComment findComById(Integer commentId) {
        EatComment eatComment = this.EatCommentMapper.findComById(commentId);
        return eatComment;
    }
    /**
     * 修改评论
     * @姚天祥 set 2020-02-28 10:00
     */
    @Override
    public int updateComment(EatComment eatComment) {
        int i = this.EatCommentMapper.updateComment(eatComment);
        return i;
    }
    /**
     * 根据ID删除评论信息
     * @姚天祥 set 2020-02-28 11:00
     */
    @Override
    public int deleteById(Integer commentId) {
        int i = this.EatCommentMapper.deleteById(commentId);
        return i;
    }
}