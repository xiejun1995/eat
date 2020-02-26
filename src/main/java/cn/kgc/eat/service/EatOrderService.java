package cn.kgc.eat.service;

import cn.kgc.eat.pojo.EatOrder;

import java.util.List;

public interface EatOrderService{
    /**
     *前台骑手查询未配送的订单
     *@姚天祥 set 2020-02-25 11:30
     */
    List<EatOrder> findUnOrder();
}