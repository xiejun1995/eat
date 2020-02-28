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
    private EatCommentMapper eatCommentMapper;

    @Override
    public List<EatComment> commentList(Integer commentMerchantId) {
        return eatCommentMapper.commentList(commentMerchantId);
    }

    @Override
    public Integer commentAuthorByName(String userName) {
        return eatCommentMapper.commentAuthorByName(userName);
    }

    @Override
    public int addComment(EatComment comment) {
        return eatCommentMapper.addComment(comment);
    }

    @Override
    public EatComment findComById(Integer commentId) {
        return eatCommentMapper.findComById(commentId);
    }

    @Override
    public int updateComment(EatComment eatComment) {
        return eatCommentMapper.updateComment(eatComment);
    }

    @Override
    public int deleteById(Integer commentId) {
        return eatCommentMapper.deleteById(commentId);
    }

    @Override
    public int deleteComment(Integer id) {
        return eatCommentMapper.deleteComment(id);
    }

    @Override
    public Integer selectEatCommentById(Integer id) {
        return eatCommentMapper.selectEatCommentById(id);
    }

    @Override
    public List<EatComment> selectAll() {
        return eatCommentMapper.selectAll();
    }
}