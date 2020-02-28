package cn.kgc.eat.service;

import cn.kgc.eat.pojo.EatOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EatOrderService{
    /**
     *前台骑手查询未配送的订单
     *@姚天祥 set 2020-02-25 11:30
     */
    List<EatOrder> findUnOrder();
    /**
     * 前台商家查看订单列表
     * @姚天祥 set 2020-02-27 15:00
     */
    List<EatOrder> selectAllByName(@Param("merchantName")String merchantName);

    /**
     * 前台骑手接受订单
     * @姚天祥 set 2020-02-28 14:00
     */
    int doOrder(String orderId);

    /**
     * 前台骑手完成配送任务
     * @姚天祥 set 2020-02-28 14:30
     */
    int overOrder(String orderId);
}