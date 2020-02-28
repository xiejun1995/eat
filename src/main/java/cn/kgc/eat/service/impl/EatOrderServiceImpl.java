package cn.kgc.eat.service.impl;
import cn.kgc.eat.pojo.EatOrder;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.kgc.eat.mapper.EatOrderMapper;
import cn.kgc.eat.service.EatOrderService;

import java.util.List;

@Service
public class EatOrderServiceImpl implements EatOrderService{
    @Resource
    private EatOrderMapper eatOrderMapper;

    @Override
    public List<EatOrder> MyOrderList(String name) {
        return eatOrderMapper.MyOrderList(name);
    }

    @Override
    public int deleteOrderById(String id) {
        return eatOrderMapper.deleteOrderById(id);
    }

    @Override
    public String selectOrderById(String id) {
        return eatOrderMapper.selectOrderById(id);
    }

    @Override
    public List<EatOrder> orderListByAll(String text) {
        return eatOrderMapper.orderListByAll(text);
    }

    @Override
    public List<EatOrder> orderList() {
        return eatOrderMapper.orderList();
    }

    @Override
    public int deleteOrder(String id) {
        return eatOrderMapper.deleteOrder(id);
    }

    @Override
    public List<EatOrder> findUnOrder() {
        return eatOrderMapper.findUnOrder();
    }

    @Override
    public List<EatOrder> selectAllByName(String merchantName) {
        return eatOrderMapper.selectAllByName(merchantName);
    }

    @Override
    public int doOrder(String orderId) {
        return eatOrderMapper.doOrder(orderId);
    }

    @Override
    public int overOrder(String orderId) {
        return eatOrderMapper.overOrder(orderId);
    }
}