package service.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import dataservice.*;
import dataserviceimpl.*;
import po.OrderPo;
import po.RoomPo;

import service.RoomService;
import vo.OrderVo;
import vo.RoomVo;
public class RoomServiceImpl implements RoomService{
	private int hotelID;
	
    private List<RoomPo> hotelRoomList;
	
    private List<OrderPo> hotelOrderList;
	
	private orderservice orderservice;
	
	private roomservice roomservice;
	
	public RoomServiceImpl(int hotelID){
		this.hotelID = hotelID;
		this.hotelRoomList = roomservice.roomfindbyhotel(hotelID);
		this.hotelOrderList = orderservice.orderfindbyhotel(hotelID);
	}

	@Override
	public List<RoomVo> getAllRooms(int hotelID) {
		List<RoomVo> list = new ArrayList<RoomVo>();
		for (RoomPo roomPo : hotelRoomList) {
			
			RoomVo roomVo = new RoomVo(roomPo);
			list.add(roomVo);
		}
		return list;
	}

	@Override
	public RoomVo searchRoom(int roomNum) {
		RoomPo roomPo = roomservice.roomfindbynum(roomNum);
		RoomVo roomVo = new RoomVo(roomPo);
		return roomVo;
	}

	@Override
	public List<RoomVo> getAvailableRooms(int hotelID) {
		List<RoomVo> list = new ArrayList<RoomVo>();
		for(RoomPo roomPo : hotelRoomList){
			if(roomPo.getUsingCondition()==""){
				RoomVo roomVo = new RoomVo(roomPo);
				list.add(roomVo);
			}
		}
		return list;
	}

	

	

	

	


	
	



}
