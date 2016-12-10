package MainFrame;

import java.util.List;
import vo.OrderVo;



public interface HotelFrameControllerService {
public void ManageButtonClicked();
public void InputButtonClicked();
public void StrategyButtonClicked();
public void ManageRoomButtonClicked();
public void SearchButtonClicked();
public void ExecuteButtonClicked();


public void ModifyButtonClicked();
public void ConfirmButtonClicked();


public void InputRoomButtonClicked();
public void DeleteRoomButtonClicked();


public void StrategyConfirmButtonClicked();
public void StrategyAddButtonClicked();


public void OrderSearchButtonClicked();
public void OrderBrowseButtonClicked();


public void ExecuteConfirmButtonClicked();
public void ExecutingButtonClicked();
public void CreditChangeButtonClicked();

public void setview();

public List<OrderVo> getAllOrders(int holelID);

public void selectStrategy(String selected);

public OrderVo searchOrder(int orderID);

public boolean executeOrder(int orderID);

//public void changeCredit(String userID);


}
