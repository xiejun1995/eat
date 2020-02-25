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

    @Override
    public List<EatComment> commentList(Integer commentMerchantId) {
        return EatCommentMapper.commentList(commentMerchantId);
    }

    @Override
    public Integer commentAuthorByName(String userName) {
        return EatCommentMapper.commentAuthorByName(userName);
    }

    @Override
    public int addComment(EatComment comment) {
        return EatCommentMapper.addComment(comment);
    }

    @Override
    public int deleteComment(Integer id) {
        return EatCommentMapper.deleteComment(id);
    }

    @Override
    public Integer selectEatCommentById(Integer id) {
        return EatCommentMapper.selectEatCommentById(id);
    }
}