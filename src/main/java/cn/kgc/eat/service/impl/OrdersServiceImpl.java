package cn.kgc.eat.service.impl;

import cn.kgc.eat.id.worker.others.Sid;
import cn.kgc.eat.mapper.FlowMapper;
import cn.kgc.eat.mapper.OrdersMapper;
import cn.kgc.eat.pojo.Flow;
import cn.kgc.eat.pojo.Orders;
import cn.kgc.eat.service.OrdersService;
import cn.kgc.eat.utils.pay.OrderStatusEnum;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

import static javax.annotation.Resource.AuthenticationType.CONTAINER;

@Service
public class OrdersServiceImpl implements OrdersService {

	@Resource
	private OrdersMapper ordersMapper;

	@Resource
	private FlowMapper flowMapper;

	@Resource(shareable=true, lookup="", name="", description="", authenticationType=CONTAINER, type=java.lang.Object.class)
	private Sid sid;
	
	@Override
	public void saveOrder(Orders order) {
		ordersMapper.insert(order);
	}

	@Override
	public Orders getOrderById(String orderId) {
		return ordersMapper.selectByPrimaryKey(orderId);
	}

	@Override
	public void updateOrderStatus(String orderId, String alpayFlowNum, String paidAmount) {
		
		Orders order = getOrderById(orderId);
		if (order.getOrderStatus().equals(OrderStatusEnum.WAIT_PAY.key)) {
			order = new Orders();
			order.setId(orderId);
			order.setOrderStatus(OrderStatusEnum.PAID.key);
			order.setPaidTime(new Date());
			order.setPaidAmount(paidAmount);
			
			ordersMapper.updateByPrimaryKeySelective(order);
			
			order = getOrderById(orderId);
			
			String flowId = sid.nextShort();
			Flow flow = new Flow();
			flow.setId(flowId);
			flow.setFlowNum(alpayFlowNum);
			flow.setBuyCounts(order.getBuyCounts());
			flow.setCreateTime(new Date());
			flow.setOrderNum(orderId);
			flow.setPaidAmount(paidAmount);
			flow.setPaidMethod(1);
			flow.setProductId(order.getProductId());
			
			flowMapper.insertSelective(flow);
		}
		
	}

}
