package cn.kgc.eat.service.impl;
import cn.kgc.eat.pojo.EatMerchant;
import cn.kgc.eat.pojo.EatUser;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.kgc.eat.mapper.EatUserMapper;
import cn.kgc.eat.service.EatUserService;

import java.util.List;

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
    @Override
    public int addUser(EatUser user) {
        return eatUserMapper.addUser(user);
    }

    @Override
    public int deleteUser(Integer id) {
        return eatUserMapper.deleteUser(id);
    }

    @Override
    public EatUser selectUserById(Integer id) {
        return eatUserMapper.selectUserById(id);
    }

    @Override
    public int updateUser(EatUser user) {
        return eatUserMapper.updateUser(user);
    }

    @Override
    public List<EatMerchant> selectByAddressOrGreensName(String text) {
        return eatUserMapper.selectByAddressOrGreensName(text);
    }
    /**
     * @author 齐宏伟
     * @desc 管理员查询用户信息
     * @date 2020/2/23
     */
    public List<EatUser> getUserList() {
        List <EatUser> list =eatUserMapper.getUserList();
        return list;
    }

    /**
     * @author 齐宏伟
     * @desc 管理员增加用户信息
     * @date 2020/2/23
     */
    public int insertSelective(EatUser eatUser) {
        int count = eatUserMapper.insertSelective(eatUser);
        return count;
    }

    /**
     * @author 齐宏伟
     * @desc 管理员修改用户信息
     * @date 2020/2/23
     */
    public int updateByPrimaryKeySelective(EatUser eatUser) {
        int count = eatUserMapper.updateByPrimaryKeySelective(eatUser);
        return count;
    }

    /**
     * @author 齐宏伟
     * @desc 根据用户id查询用户信息
     * @date 2020/2/23
     */
    public EatUser getUserById(String USER_ID) {
        EatUser eatUser = eatUserMapper.getUserById(USER_ID);
        return eatUser;
    }

    /**
     * @author 齐宏伟
     * @desc 管理员删除用户信息
     * @date 2020/2/23
     */
    public int deleteByPrimaryKey(Integer userId) {
        int count = eatUserMapper.deleteByPrimaryKey(userId);
        return count;
    }

    @Override
    public EatUser findUserByPhone(String userPhone) {
        return eatUserMapper.findUserByPhone(userPhone);
    }
}