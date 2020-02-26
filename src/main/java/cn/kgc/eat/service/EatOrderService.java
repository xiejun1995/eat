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
    int deleteOrder(@Param("id")String id);
}