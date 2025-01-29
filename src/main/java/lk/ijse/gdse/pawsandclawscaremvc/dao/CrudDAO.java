package lk.ijse.gdse.pawsandclawscaremvc.dao;

import lk.ijse.gdse.pawsandclawscaremvc.dto.CustomerDto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface CrudDAO <T> extends SuperDAO {
    public boolean save(T dto) throws SQLException;
    public String getNextId() throws SQLException;
    public ArrayList<T> getAll() throws SQLException ;
    public boolean delete(String id) throws SQLException;
    public boolean update(T dto) throws SQLException ;
    public ArrayList<String> getAllIds() throws SQLException ;
    //public CustomerDto findById(String selectedCustId) throws SQLException;
    //public CustomerDto SearchCustomerByContact(String contactNumber) ;
    //public String getCustomerNameById(String selectedCustId) throws SQLException ;
}
