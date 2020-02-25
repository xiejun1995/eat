package cn.kgc.eat.service.impl;
import cn.kgc.eat.pojo.EatUser;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.kgc.eat.mapper.EatUserMapper;
import cn.kgc.eat.service.EatUserService;

/**
 * 用户相关业务实现类
 * @author 谢军军
* @Email 18045972801@163.com
* @date 2020/2/22 14:58
*/
@Service
public class EatUserServiceImpl implements EatUserService{
    @Resource
    private EatUserMapper eatUserMapper;

    @Override
    public EatUser getEatUserByUserName(String userName) {
        return eatUserMapper.getEatUserByUserName(userName);
    }
}