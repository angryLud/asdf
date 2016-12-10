package dataservice;

import java.util.ArrayList;
import java.util.List;

import po.RoomPo;

public interface roomservice {
    public ArrayList<RoomPo> roomfindbyhotel(int hotelID);
	
	public RoomPo roomfindbynum(int roomNum);
	
	public boolean roomupdate(RoomPo roomPo);
}
