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
     * 添加用户方法
     * @param user
     * @return
     */
    int addUser(EatUser user);

    /**
     * 删除用户方法
     * @param id
     * @return
     */
    int deleteUser(@Param("id")Integer id);


    /**
     * 根据用户id查询用户信息
     * @param id
     * @return
     */
    EatUser selectUserById(@Param("id")Integer id);

    /**
     * 修改用户方法
     * @param user
     * @return
     */
    int updateUser(EatUser user);

    /**
     * 根据商家地址查询
     * @param address
     * @return
     */
    List<EatUser> selectByAddress(String address);

    /**
     * 根据菜品名称查询
     * @param greensName
     * @return
     */
    List<EatUser> selectByGreens(String greensName);
}
