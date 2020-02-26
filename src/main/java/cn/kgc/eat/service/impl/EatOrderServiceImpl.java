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
    public List<EatOrder> findUnOrder() {
        List<EatOrder> eatOrderList = this.EatOrderMapper.findUnOrder();
        return eatOrderList;
    }
}