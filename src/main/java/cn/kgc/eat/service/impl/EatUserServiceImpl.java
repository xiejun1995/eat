package cn.kgc.eat.service.impl;
import cn.kgc.eat.pojo.EatMerchant;
import cn.kgc.eat.pojo.EatUser;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.kgc.eat.mapper.EatUserMapper;
import cn.kgc.eat.service.EatUserService;

import java.util.List;

@Service
public class EatUserServiceImpl implements EatUserService{
    @Resource
    private EatUserMapper EatUserMapper;

    @Override
    public int addUser(EatUser user) {
        return EatUserMapper.addUser(user);
    }

    @Override
    public int deleteUser(Integer id) {
        return EatUserMapper.deleteUser(id);
    }

    @Override
    public EatUser selectUserById(Integer id) {
        return EatUserMapper.selectUserById(id);
    }

    @Override
    public int updateUser(EatUser user) {
        return EatUserMapper.updateUser(user);
    }

    @Override
    public List<EatMerchant> selectByAddressOrGreensName(String text) {
        return EatUserMapper.selectByAddressOrGreensName(text);
    }


}