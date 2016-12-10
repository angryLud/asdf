package service.impl;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import dataservice.*;
import dataserviceimpl.*;
import po.OrderPo;

import service.OrderService;
import vo.OrderVo;
public class OrderServiceImpl implements OrderService{
	
	private int hotelID;
    
    private List<OrderPo> hotelOrderList;
	
	private orderservice orderservice;
	
	public OrderServiceImpl(int hotelID){
		this.hotelID = hotelID;
		hotelOrderList = orderservice.orderfindbyhotel(hotelID);
	}
	
	@Override
	public List<OrderVo> getAllOrders(int hotelID) {
		List<OrderVo> list = new ArrayList<OrderVo>();
		for (OrderPo orderPo : hotelOrderList) {
			
			OrderVo orderVo = new OrderVo(orderPo);
			list.add(orderVo);
		}
		return list;
	}

	@Override
	public OrderVo searchOrder(int orderID) {
		
		OrderPo orderPo = orderservice.orderfindbyid(orderID);
		OrderVo orderVo = new OrderVo(orderPo);
		return orderVo;
		
	}

	@Override
	public boolean executeOrder(int orderID) {
		OrderPo orderPo = orderservice.orderfindbyid(orderID);
		if(orderPo.getExecutetime()==0){
			Date date=new Date();
			DateFormat format=new SimpleDateFormat("yyyy/MM/dd");
			String time=format.format(date);
			String res = time.replaceAll("/","");
			orderPo.setExecutetime(Long.parseLong(time));
			if(orderservice.orderupdate(orderPo)){
				for (OrderPo o : hotelOrderList) {
					if(o.getOrderid() == orderID){
						o = orderPo;
						break;
					}
				}
				return true;
			}
		}
		return false;
	}

	

	

}
