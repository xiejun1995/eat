package cn.kgc.eat.service;

import cn.kgc.eat.pojo.EatOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EatOrderService{
    /**
     * 前台：我的订单列表
     * @param name
     * @return
     */
    List<EatOrder> MyOrderList(String name);

    /**
     * 前台：删除订单
     * @param id
     * @return
     */
    int  deleteOrderById(@Param("id") String id);
    /**
     *前台：根据订单id查询订单名称
     * @param id
     * @return
     */
    String selectOrderById(@Param("id") String id);
    /**
     * 前台：根据订单号、订单人、订单人手机号、下单时间、状态查询、商家名称订单信息
     * @param text
     * @return
     */
    List<EatOrder> orderListByAll(@Param("text") String text);
    /**
     * 后台：订单管理-查询所有订单
     * @return
     */
    List<EatOrder> orderList();
    /**
     * 后台：订单管理-删除订单
     * @param id
     * @return
     */
    int deleteOrder(@Param("id") String id);
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