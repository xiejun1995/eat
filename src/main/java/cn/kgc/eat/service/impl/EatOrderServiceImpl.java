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
    /**
     *前台骑手查询未配送的订单
     *@姚天祥 set 2020-02-25 11:30
     */
    @Override
    public List<EatOrder> findUnOrder() {
        List<EatOrder> eatOrderList = this.EatOrderMapper.findUnOrder();
        return eatOrderList;
    }
    /**
     * 前台商家查看订单列表
     * @姚天祥 set 2020-02-27 15:00
     */
    @Override
    public List<EatOrder> selectAllByName(String merchantName) {
        List<EatOrder> eatOrderList = this.EatOrderMapper.selectAllByName(merchantName);
        return eatOrderList;
    }

    /**
     * 前台骑手接受订单
     * @姚天祥 set 2020-02-28 14:00
     */
    @Override
    public int doOrder(String orderId) {
        int i = this.EatOrderMapper.doOrder(orderId);
        return i;
    }

    /**
     * 前台骑手完成配送任务
     * @姚天祥 set 2020-02-28 14:30
     */
    @Override
    public int overOrder(String orderId) {
        int i = this.EatOrderMapper.overOrder(orderId);
        return i;
    }
}