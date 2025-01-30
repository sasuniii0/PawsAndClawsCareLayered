package lk.ijse.gdse.pawsandclawscaremvc.dao.custom.impl;

import lk.ijse.gdse.pawsandclawscaremvc.dao.custom.InventoryDAO;
import lk.ijse.gdse.pawsandclawscaremvc.dto.InventoryDto;
import lk.ijse.gdse.pawsandclawscaremvc.dao.SQLUtil;
import lk.ijse.gdse.pawsandclawscaremvc.entity.Inventory;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class InvenManageDAOImpl implements InventoryDAO {

    public String getNextId() throws SQLException {
        ResultSet rst = SQLUtil.execute("select inventoryId from Inventory order by inventoryId desc limit 1");

        if (rst.next()) {
            String lastId = rst.getString(1);
            String subString = lastId.substring(1);
            int i = Integer.parseInt(subString);
            int newIndex = i+1;
            return String.format("I%03d", newIndex);
        }
        return "I001";
    }

    public ArrayList<Inventory> getAll() throws SQLException {
        ResultSet rst = SQLUtil.execute("select * from Inventory");
        ArrayList<Inventory> inventory = new ArrayList<>();

        while (rst.next()) {
            Inventory entity = new Inventory(
                    rst.getString(1),
                    rst.getDate(2),
                    rst.getString(3),
                   rst.getString(4)
            );
            inventory.add(entity);
        }
        return inventory;
    }

    public boolean save(Inventory entity) throws SQLException {
        return SQLUtil.execute("INSERT INTO Inventory (inventoryId, stockUpdate, inventoryCategory,availabilityStatus) VALUES (?,?,?,?)",
                entity.getInventoryId(),
                entity.getStockUpdate(),
                entity.getInventoryCategory(),
                entity.getAvailabilityStatus()
        );
    }

    public boolean update(Inventory entity) throws SQLException {
        return  SQLUtil.execute("update Inventory set stockUpdate =?, inventoryCategory = ?, availabilityStatus = ? where inventoryId = ?",
                entity.getStockUpdate(),
                entity.getInventoryCategory(),
                entity.getAvailabilityStatus(),
                entity.getInventoryId()
        );
    }

    public boolean delete(String invenId) throws SQLException {
        return SQLUtil.execute("delete from Inventory where inventoryId = ?",invenId);

    }

    public ArrayList<Inventory> searchProductsByCatalog(String searchText) throws SQLException {
        String query = "SELECT inventoryId, stockUpdate, inventoryCategory, availabilityStatus FROM Inventory WHERE inventoryCategory LIKE ?";
        ResultSet rst = SQLUtil.execute(query, "%" + searchText + "%");

        ArrayList<Inventory> entity = new ArrayList<>();
        while (rst.next()) {
            Inventory inventory = new Inventory(
                    rst.getString(1),
                    rst.getDate(2),
                    rst.getString(3),
                   rst.getString(4)
            );
            entity.add(inventory);
        }
        return entity;
    }

    public ArrayList<String> getAllInventoryId() throws SQLException {
        ResultSet rst = SQLUtil.execute("select inventoryId from Inventory");
        ArrayList<String> invenIds = new ArrayList<>();
        while (rst.next()) {
            invenIds.add(rst.getString(1));
        }

        return invenIds;
    }

    public Inventory findById(String selectedInvenId) throws SQLException {
        ResultSet rst = SQLUtil.execute("select * from Inventory where inventoryId=?", selectedInvenId);

        if (rst.next()) {
            return new Inventory(
                    rst.getString(1),
                    rst.getDate(2),
                    rst.getString(3),
                    rst.getString(4)
            );
        }
        return null;
    }
}
