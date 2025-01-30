package lk.ijse.gdse.pawsandclawscaremvc.dao.custom;

import lk.ijse.gdse.pawsandclawscaremvc.dao.CrudDAO;
import lk.ijse.gdse.pawsandclawscaremvc.dao.SQLUtil;
import lk.ijse.gdse.pawsandclawscaremvc.dto.CustomerDto;
import lk.ijse.gdse.pawsandclawscaremvc.entity.Customer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface CustomerDAO extends CrudDAO<Customer>{
    public ArrayList<String> getAllCustomerIds() throws SQLException;
    public CustomerDto findById(String selectedCustId) throws SQLException;
    public CustomerDto SearchCustomerByContact(String contactNumber);
    public String getCustomerNameById(String selectedCustId) throws SQLException;
}
