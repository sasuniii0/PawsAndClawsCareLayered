package lk.ijse.gdse.pawsandclawscaremvc.dao.custom;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import lk.ijse.gdse.pawsandclawscaremvc.dao.CrudDAO;
import lk.ijse.gdse.pawsandclawscaremvc.dao.SQLUtil;
import lk.ijse.gdse.pawsandclawscaremvc.dto.EmployeeDto;
import lk.ijse.gdse.pawsandclawscaremvc.entity.Employee;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface EmployeeDAO extends CrudDAO<Employee> {
    public ObservableList<String> getAllServiceIds() throws SQLException;
    public String getServiceDescription(String newValue) throws SQLException;
    public ObservableList<String> getAllOrderIds() throws SQLException ;
    public Object getOrderDate(String newValue) throws SQLException;
    public ArrayList<Employee> searchEmployeeByRole(String searchText) throws SQLException;
}
