package lk.ijse.gdse.pawsandclawscaremvc.dao.custom;

import lk.ijse.gdse.pawsandclawscaremvc.dao.CrudDAO;
import lk.ijse.gdse.pawsandclawscaremvc.dao.SQLUtil;
import lk.ijse.gdse.pawsandclawscaremvc.dto.InventoryDto;
import lk.ijse.gdse.pawsandclawscaremvc.entity.Inventory;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface InventoryDAO extends CrudDAO<Inventory> {
    public ArrayList<Inventory> searchProductsByCatalog(String searchText) throws SQLException;
    public ArrayList<String> getAllInventoryId() throws SQLException ;
    public Inventory findById(String selectedInvenId) throws SQLException;
}
