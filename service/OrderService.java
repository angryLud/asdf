package service;
import vo.OrderVo;

import java.util.ArrayList;
import java.util.List;

import po.OrderPo;
public interface OrderService {
	public List<OrderVo> getAllOrders(int hotelID);
    
	public OrderVo searchOrder(int orderID);
	
	
	public boolean executeOrder(int orderID);
}
