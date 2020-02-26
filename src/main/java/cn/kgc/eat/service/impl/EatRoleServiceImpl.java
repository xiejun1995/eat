package cn.kgc.eat.service.impl;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.kgc.eat.mapper.EatRoleMapper;
import cn.kgc.eat.service.EatRoleService;
@Service
public class EatRoleServiceImpl implements EatRoleService{
    @Resource
    private EatRoleMapper EatRoleMapper;

}