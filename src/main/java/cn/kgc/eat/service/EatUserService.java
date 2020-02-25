package cn.kgc.eat.service;

import cn.kgc.eat.pojo.EatUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 谢军军
 * @Email 18045972801@163.com
 * @date 2020/2/22 14:58
 */
public interface EatUserService {
    /**
     * @author 齐宏伟
     * @desc 管理员查询用户信息
     * @date 2020/2/23
     */
    public List<EatUser> getUserList();

    /**
     * @author 齐宏伟
     * @desc 管理员增加用户信息
     * @date 2020/2/23
     */
    int insertSelective(EatUser eatUser);

    /**
     * @author 齐宏伟
     * @desc 管理员修改用户信息
     * @date 2020/2/23
     */
    int updateByPrimaryKeySelective(EatUser eatUser);
    /**
     * @author 齐宏伟
     * @desc 根据用户id查询用户信息
     * @date 2020/2/23
     */
    public EatUser getUserById(String USER_ID);

    /**
     * @author 齐宏伟
     * @desc 管理员删除用户信息
     * @date 2020/2/23
     */
    public int deleteByPrimaryKey(Integer userId);
}
