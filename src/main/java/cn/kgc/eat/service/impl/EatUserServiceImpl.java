package cn.kgc.eat.service.impl;
import cn.kgc.eat.pojo.EatMerchant;
import cn.kgc.eat.pojo.EatUser;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.kgc.eat.mapper.EatUserMapper;
import cn.kgc.eat.service.EatUserService;
@Service
public class EatUserServiceImpl implements EatUserService{
    @Resource
    private EatUserMapper EatUserMapper;

    @Override
    public EatUser findUserByPhone(String userPhone) {
        EatUser eatUser = this.EatUserMapper.findUserByPhone(userPhone);
        return eatUser;
    }
}