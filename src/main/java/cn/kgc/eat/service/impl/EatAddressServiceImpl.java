package cn.kgc.eat.service.impl;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.kgc.eat.mapper.EatAddressMapper;
import cn.kgc.eat.service.EatAddressService;
@Service
public class EatAddressServiceImpl implements EatAddressService{
    @Resource
    private EatAddressMapper EatAddressMapper;

}