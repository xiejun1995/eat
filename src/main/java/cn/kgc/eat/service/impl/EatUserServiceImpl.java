package cn.kgc.eat.service.impl;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.kgc.eat.mapper.EatUserMapper;
import cn.kgc.eat.service.EatUserService;
@Service
public class EatUserServiceImpl implements EatUserService{
    @Resource
    private EatUserMapper EatUserMapper;

}