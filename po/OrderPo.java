package po;

import java.io.Serializable;

/**
 * Created by huihantao on 2016/11/30.
 */
public class OrderPo implements Serializable {
    private static final long serialVersionUID=3L;
    private int orderid;
    private int userid;
    private int hotelid;
    private long createtime;
    private long executetime;
    private long delaytime;
    private int duringtime;
    private int value;
    private int status;
    
    private int roomNum;
    private int strategyNum;
    private String assess;

    public OrderPo(int orderid,int userid, int hotelid, long createtime, long executetime, long delaytime ,int duringtime, int value, int status) {
        this.createtime = createtime;
        this.executetime = executetime;
        this.delaytime = delaytime;
        this.duringtime = duringtime;
        this.userid = userid;
        this.hotelid = hotelid;
        this.orderid = orderid;
       
        this.value = value;
        this.status = status;
    }


    public long getCreatetime() {
        return createtime;
    }
    public void setCreatetime(long createtime){
    	this.createtime = createtime;
    }
    public long getExecutetime() {
        return executetime;
    }
    public void setExecutetime(long executetime){
    	this.executetime = executetime;
    }
    public long getDelaytime() {
        return delaytime;
    }
    public void setDelaytime(long delaytime){
    	this.delaytime = delaytime;
    }
    public int getUserid() {
        return userid;
    }

    public int getHotelid() {
        return hotelid;
    }

    public int getOrderid() {
        return orderid;
    }
    public int getRoomnum(){
    	return roomNum;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value){
    	this.value = value;
    }
    public int getDuringtime() {
        return duringtime;
    }
    public void setDuringtime(int duringtime){
    	this.duringtime = duringtime;
    }
    public int getStrategyNum(){
    	return strategyNum;
    }
    public void setStrategyNum(int strategyNum){
    	this.strategyNum = strategyNum;
    }
    public int getStatus(){
    	return status;
    }
    public void setStatus(int status){
    	this.status = status;
    }
    public String getAssess(){
    	return assess;
    }
    public void setAssess(String assess){
    	this.assess=assess;
    	}

}
