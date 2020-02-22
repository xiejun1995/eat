package cn.kgc.eat.service.impl;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.kgc.eat.mapper.EatOrderMapper;
import cn.kgc.eat.service.EatOrderService;
@Service
public class EatOrderServiceImpl implements EatOrderService{
    @Resource
    private EatOrderMapper EatOrderMapper;

}