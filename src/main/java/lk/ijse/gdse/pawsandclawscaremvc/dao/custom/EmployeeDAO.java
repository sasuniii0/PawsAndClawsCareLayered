package lk.ijse.gdse.pawsandclawscaremvc.dao.custom;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import lk.ijse.gdse.pawsandclawscaremvc.dao.SQLUtil;
import lk.ijse.gdse.pawsandclawscaremvc.dto.EmployeeDto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface EmployeeDAO {
    public String getNextEmpId() throws SQLException;
    public ArrayList<EmployeeDto> getAllEmployees() throws SQLException;
    public ObservableList<String> getAllServiceIds() throws SQLException;
    public String getServiceDescription(String newValue) throws SQLException;
    public ObservableList<String> getAllOrderIds() throws SQLException ;
    public Object getOrderDate(String newValue) throws SQLException;
    public boolean saveEmployee(EmployeeDto employeeDto) throws SQLException;
    public boolean updateEmployee(EmployeeDto employeeDto) throws SQLException;
    public boolean deleteService(String serviceIdText) throws SQLException ;
    public ArrayList<EmployeeDto> searchEmployeeByRole(String searchText) throws SQLException;
}
