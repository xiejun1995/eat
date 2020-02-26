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
    private EatOrderMapper EatOrderMapper;

    @Override
    public List<EatOrder> MyOrderList(String name) {
        return EatOrderMapper.MyOrderList(name);
    }

    @Override
    public int deleteOrderById(String id) {
        return EatOrderMapper.deleteOrderById(id);
    }

    @Override
    public String selectOrderById(String id) {
        return EatOrderMapper.selectOrderById(id);
    }

    @Override
    public List<EatOrder> orderListByAll(String text) {
        return EatOrderMapper.orderListByAll(text);
    }

    @Override
    public List<EatOrder> orderList() {
        return EatOrderMapper.orderList();
    }

    @Override
    public int deleteOrder(String id) {
        return EatOrderMapper.deleteOrder(id);
    }
}