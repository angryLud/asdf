package service;

import java.util.List;

import po.RoomPo;
import vo.RoomVo;

public interface RoomService {
    public List<RoomVo> getAllRooms(int hotelID);
    
	public RoomVo searchRoom(int roomNum);
	
	public List<RoomVo> getAvailableRooms(int hotelID);
	
	
}
