package cn.kgc.eat.service;

import cn.kgc.eat.pojo.EatGreens;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EatGreensService{
    /**
     * 添加菜品信息
     * @姚天祥 set 2020-02-26 09:00
     *
     */
    int addGreens(EatGreens eatGreens);
    /**
     * 删除菜品信息
     * @姚天祥 set 2020-02-27 09:00
     */
    int deleteById(@Param("greensId")Integer greensId);
    /**
     * 查询所有菜品
     * @姚天祥 set 2020-02-27 10:00
     */
    List<EatGreens> selectAll(String greensName);
    /**
     * 查看菜品详情
     * @姚天祥 set 2020-02-27 11:00
     */
    EatGreens findGreensById(@Param("greensId")String greensId);
    /**
     * 修改菜品详情
     * @姚天祥 set 2020-02-27 11:00
     */
    int updateGreensById(EatGreens eatGreens);
}