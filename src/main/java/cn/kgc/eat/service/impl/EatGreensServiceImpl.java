package cn.kgc.eat.service.impl;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.kgc.eat.mapper.EatGreensMapper;
import cn.kgc.eat.service.EatGreensService;
@Service
public class EatGreensServiceImpl implements EatGreensService{
    @Resource
    private EatGreensMapper EatGreensMapper;

}