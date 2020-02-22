package cn.kgc.eat.service.impl;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.kgc.eat.mapper.EatShoppingMapper;
import cn.kgc.eat.service.EatShoppingService;
@Service
public class EatShoppingServiceImpl implements EatShoppingService{
    @Resource
    private EatShoppingMapper EatShoppingMapper;

}