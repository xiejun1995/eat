package cn.kgc.eat.service.impl;
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

    /**
     * @author 齐宏伟
     * @desc 管理员查询用户信息
     * @date 2020/2/23
     */
    public List<EatUser> getUserList() {
        List <EatUser> list = EatUserMapper.getUserList();
        return list;
    }

    /**
     * @author 齐宏伟
     * @desc 管理员增加用户信息
     * @date 2020/2/23
     */
    public int insertSelective(EatUser eatUser) {
       int count = EatUserMapper.insertSelective(eatUser);
        return count;
    }

    /**
     * @author 齐宏伟
     * @desc 管理员修改用户信息
     * @date 2020/2/23
     */
    public int updateByPrimaryKeySelective(EatUser eatUser) {
        int count = EatUserMapper.updateByPrimaryKeySelective(eatUser);
        return count;
    }

    /**
     * @author 齐宏伟
     * @desc 根据用户id查询用户信息
     * @date 2020/2/23
     */
    public EatUser getUserById(String USER_ID) {
        EatUser eatUser = EatUserMapper.getUserById(USER_ID);
        return eatUser;
    }

    /**
     * @author 齐宏伟
     * @desc 管理员删除用户信息
     * @date 2020/2/23
     */
    public int deleteByPrimaryKey(Integer userId) {
      int count = EatUserMapper.deleteByPrimaryKey(userId);
        return count;
    }

}