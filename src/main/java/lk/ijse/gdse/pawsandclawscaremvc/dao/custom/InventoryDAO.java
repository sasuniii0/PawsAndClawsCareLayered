package lk.ijse.gdse.pawsandclawscaremvc.dao.custom;

import lk.ijse.gdse.pawsandclawscaremvc.dao.SQLUtil;
import lk.ijse.gdse.pawsandclawscaremvc.dto.InventoryDto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface InventoryDAO {
    public String getNextInventoryId() throws SQLException ;
    public ArrayList<InventoryDto> getAllInventory() throws SQLException;
    public boolean saveInventory(InventoryDto inventoryDto) throws SQLException;
    public boolean updateInventory(InventoryDto inventoryDto) throws SQLException;
    public boolean deleteItem(String invenId) throws SQLException ;
    public ArrayList<InventoryDto> searchProductsByCatalog(String searchText) throws SQLException;
    public ArrayList<String> getAllInventoryId() throws SQLException ;
    public InventoryDto findById(String selectedInvenId) throws SQLException;
}
