package hotel.controller;
import service.OrderService;
import service.impl.OrderServiceImpl;
import vo.OrderVo;

import java.util.List;

import MainFrame.HotelFrame;
import MainFrame.HotelFrameControllerService;
public class HotelFrameControllerServiceImpl implements HotelFrameControllerService{
private int hotelID;
private OrderService orderService;
private HotelFrame hotelFrame;

public HotelFrameControllerServiceImpl(int hotelID){
	this.hotelID = hotelID;
	orderService = new OrderServiceImpl(hotelID);
}

@Override
public void ManageButtonClicked() {
	// TODO Auto-generated method stub
	hotelFrame.ManageButtonClicked();
}

@Override
public void InputButtonClicked() {
	// TODO Auto-generated method stub
	hotelFrame.InputButtonClicked();
}

@Override
public void StrategyButtonClicked() {
	// TODO Auto-generated method stub
	hotelFrame.StrategyButtonClicked();
}

@Override
public void ManageRoomButtonClicked() {
	// TODO Auto-generated method stub
	hotelFrame.ManageButtonClicked();
}

@Override
public void SearchButtonClicked() {
	// TODO Auto-generated method stub
	hotelFrame.SearchButtonClicked();
}

@Override
public void ExecuteButtonClicked() {
	// TODO Auto-generated method stub
	hotelFrame.ExecuteButtonClicked();
}

@Override
public void ModifyButtonClicked() {
	// TODO Auto-generated method stub
	hotelFrame.ModifyButtonClicked();
}

@Override
public void ConfirmButtonClicked() {
	// TODO Auto-generated method stub
	hotelFrame.ConfirmButtonClicked();
}
@Override
public void InputRoomButtonClicked() {
	// TODO Auto-generated method stub
	hotelFrame.InputRoomButtonClicked();
}
@Override
public void DeleteRoomButtonClicked() {
	// TODO Auto-generated method stub
	hotelFrame.DeleteRoomButtonClicked();
}
@Override
public void StrategyConfirmButtonClicked() {
	// TODO Auto-generated method stub
	hotelFrame.StrategyConfirmButtonClicked();
}
@Override
public void StrategyAddButtonClicked() {
	// TODO Auto-generated method stub
	hotelFrame.StrategyAddButtonClicked();
}
@Override
public void OrderSearchButtonClicked() {
	// TODO Auto-generated method stub
	hotelFrame.OrderSearchButtonClicked();
}
@Override
public void OrderBrowseButtonClicked() {
	// TODO Auto-generated method stub
	hotelFrame.OrderBrowseButtonClicked();
}
@Override
public void ExecuteConfirmButtonClicked() {
	// TODO Auto-generated method stub
	hotelFrame.ExecuteConfirmButtonClicked();
}
@Override
public void ExecutingButtonClicked() {
	// TODO Auto-generated method stub
	hotelFrame.ExecutingButtonClicked();
}
@Override
public void CreditChangeButtonClicked() {
	// TODO Auto-generated method stub
	hotelFrame.CreditChangeButtonClicked();
}
@Override
public List<OrderVo> getAllOrders(int holelID) {
	// TODO Auto-generated method stub
	return orderService.getAllOrders(holelID);
}
@Override
public void selectStrategy(String selected) {
	// TODO Auto-generated method stub
	
}
@Override
public OrderVo searchOrder(int orderID) {
	
	return orderService.searchOrder(orderID);
	// TODO Auto-generated method stub
	
}
@Override
public boolean executeOrder(int orderID) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public void setview() {
	// TODO Auto-generated method stub
	
}
}
