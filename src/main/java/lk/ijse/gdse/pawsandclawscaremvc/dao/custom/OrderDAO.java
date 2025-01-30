package lk.ijse.gdse.pawsandclawscaremvc.dao.custom;

import lk.ijse.gdse.pawsandclawscaremvc.dao.CrudDAO;
import lk.ijse.gdse.pawsandclawscaremvc.dao.SQLUtil;
import lk.ijse.gdse.pawsandclawscaremvc.dao.custom.impl.OrderDetailsDAOImpl;
import lk.ijse.gdse.pawsandclawscaremvc.db.DBConnection;
import lk.ijse.gdse.pawsandclawscaremvc.dto.OrdersDto;
import lk.ijse.gdse.pawsandclawscaremvc.entity.Orders;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface OrderDAO extends CrudDAO<Orders> {
    final OrderDetailsDAOImpl orderDetailsDAOImpl = new OrderDetailsDAOImpl();
    public String getNextOrderId() throws SQLException ;
    public boolean saveOrder(OrdersDto ordersDto) throws SQLException ;
    public String getOrderDateById(String selectedOrderId) throws SQLException;
}
