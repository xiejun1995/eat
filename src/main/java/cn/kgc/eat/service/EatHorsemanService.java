package cn.kgc.eat.service;

import cn.kgc.eat.pojo.EatHorseman;
import cn.kgc.eat.pojo.EatMerchant;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EatHorsemanService{
    /**
     * 后台增加骑手接口
     * @姚天祥 set 2020-02-22 23:00:00
     */
    int insertSelective(EatHorseman record);

    /**
     * 后台根据姓名或电话分页查询骑手接口
     * @姚天祥 set 2020-02-23 08:30
     */
    List<EatHorseman> selectHoresmanByNameOrPhone(EatHorseman eatHorseman);

    /**
     * 进入后台显示骑手列表接口
     * @姚天祥 set 2020-02-23 08:40
     */
    List<EatHorseman> selectHoresmanAll();

    /**
     * 后台修改骑手信息时查询骑手信息接口
     * @姚天祥 set 2020-02-23 12:30
     */
    EatHorseman selectByPrimaryKey(String horsemanPhone);

    /**
     * 后台修改骑手信息接口
     * @姚天祥 set 2020-02-23 12:30
     */
    int updateByPrimaryKeySelective(EatHorseman record);

    /**
     * 后台删除骑手信息接阔
     * @姚天祥 set 2020-02-23 13:00
     */
    int deleteByPrimaryKey(String horsemanPhone);

    /**
     * 后台根据骑手电话修改骑手信息
     * @姚天祥 set 2020-02-23 16:30
     */
    int updateByPhone(EatHorseman eatHorseman);

    /**
     * 后跟根据骑手电话修改骑手信息
     * @姚天祥 set 2020-02-23 16:30
     */
    int updateByPrimaryKey(String horsemanPhone);
}