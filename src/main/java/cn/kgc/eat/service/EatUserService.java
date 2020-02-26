package cn.kgc.eat.service;

import cn.kgc.eat.pojo.EatMerchant;
import cn.kgc.eat.pojo.EatUser;
import org.apache.ibatis.annotations.Param;

/**
 * @author 谢军军
 * @Email 18045972801@163.com
 * @date 2020/2/22 14:58
 */
public interface EatUserService {
    /**
     * 前台骑手电话查看用户信息
     * @姚天祥 set 2020-02-25 11:00
     */
    EatUser findUserByPhone (@Param("userPhone")String userPhone);
}
