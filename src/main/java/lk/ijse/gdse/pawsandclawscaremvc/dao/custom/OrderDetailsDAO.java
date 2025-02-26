package lk.ijse.gdse.pawsandclawscaremvc.dao.custom;

import lk.ijse.gdse.pawsandclawscaremvc.dao.CrudDAO;
import lk.ijse.gdse.pawsandclawscaremvc.dao.SQLUtil;
import lk.ijse.gdse.pawsandclawscaremvc.dao.custom.impl.OrderDetailsDAOImpl;
import lk.ijse.gdse.pawsandclawscaremvc.dao.custom.impl.ProductManageDAOImpl;
import lk.ijse.gdse.pawsandclawscaremvc.db.DBConnection;
import lk.ijse.gdse.pawsandclawscaremvc.dto.OrderDetailsDto;
import lk.ijse.gdse.pawsandclawscaremvc.dto.OrdersDto;
import lk.ijse.gdse.pawsandclawscaremvc.entity.OrderDetails;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface OrderDetailsDAO extends CrudDAO<OrderDetails> {
    public boolean saveOrderDetailsList(ArrayList<OrderDetailsDto> orderDetailsDtos) throws SQLException;
    boolean saveOrderDetail(OrderDetailsDto orderDetailsDto) throws SQLException ;
}
