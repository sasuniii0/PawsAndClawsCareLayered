package lk.ijse.gdse.pawsandclawscaremvc.dao.custom;

import lk.ijse.gdse.pawsandclawscaremvc.dao.CrudDAO;
import lk.ijse.gdse.pawsandclawscaremvc.dao.SQLUtil;
import lk.ijse.gdse.pawsandclawscaremvc.dto.CustomerDto;
import lk.ijse.gdse.pawsandclawscaremvc.entity.Customer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface CustomerDAO {
    public boolean saveCustomer(CustomerDto customerDto) throws SQLException;
    public String getNextCustomerId() throws SQLException;
    public ArrayList<CustomerDto> getAllCustomers() throws SQLException;
    public boolean deleteCustomer(String customerId) throws SQLException;
    public boolean updateCustomer(CustomerDto customerDto) throws SQLException ;
    public ArrayList<String> getAllCustomerIds() throws SQLException;
    public CustomerDto findById(String selectedCustId) throws SQLException;
    public CustomerDto SearchCustomerByContact(String contactNumber);
    public String getCustomerNameById(String selectedCustId) throws SQLException;
}
