package cn.kgc.eat.service.impl;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.kgc.eat.mapper.EatSecurityMapper;
import cn.kgc.eat.service.EatSecurityService;
@Service
public class EatSecurityServiceImpl implements EatSecurityService{
    @Resource
    private EatSecurityMapper EatSecurityMapper;

}