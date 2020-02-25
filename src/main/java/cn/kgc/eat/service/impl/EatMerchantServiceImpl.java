package cn.kgc.eat.service.impl;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.kgc.eat.mapper.EatMerchantMapper;
import cn.kgc.eat.service.EatMerchantService;
@Service
public class EatMerchantServiceImpl implements EatMerchantService{
    @Resource
    private EatMerchantMapper EatMerchantMapper;

}