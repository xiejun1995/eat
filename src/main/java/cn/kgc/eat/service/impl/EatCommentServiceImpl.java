package cn.kgc.eat.service.impl;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.kgc.eat.mapper.EatCommentMapper;
import cn.kgc.eat.service.EatCommentService;
@Service
public class EatCommentServiceImpl implements EatCommentService{
    @Resource
    private EatCommentMapper EatCommentMapper;

}