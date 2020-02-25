package cn.kgc.eat.service;

import cn.kgc.eat.pojo.EatUser;
import org.apache.ibatis.annotations.Param;

/**
 * 用户相关业务类
 * @author 谢军军
 * @Email 18045972801@163.com
 * @date 2020/2/22 14:58
 */
public interface EatUserService {
    EatUser getEatUserByUserName(String userName);
}
