package cn.kgc.eat.service;

import cn.kgc.eat.pojo.EatMerchant;
import cn.kgc.eat.pojo.EatUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户相关业务类
 * @author 谢军军
 * @Email 18045972801@163.com
 * @date 2020/2/22 14:58
 */
public interface EatUserService {
    /**
     * 根据用户名查询用户
     * @param userName
     * @return
     */
    EatUser getEatUserByUserName(String userName);
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
     * @param text
     * @return
     */
    List<EatMerchant> selectByAddressOrGreensName(@Param("text") String text);
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
    /**
     * 前台骑手电话查看用户信息
     * @姚天祥 set 2020-02-25 11:00
     */
    EatUser findUserByPhone (@Param("userPhone")String userPhone);
}
