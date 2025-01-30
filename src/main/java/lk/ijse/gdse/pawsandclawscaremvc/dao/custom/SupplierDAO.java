package lk.ijse.gdse.pawsandclawscaremvc.dao.custom;

import lk.ijse.gdse.pawsandclawscaremvc.dao.CrudDAO;
import lk.ijse.gdse.pawsandclawscaremvc.dao.SQLUtil;
import lk.ijse.gdse.pawsandclawscaremvc.dto.SupplierDto;
import lk.ijse.gdse.pawsandclawscaremvc.entity.Supplier;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface SupplierDAO extends CrudDAO<Supplier> {
    public String getNextSupId() throws SQLException;
    public ArrayList<SupplierDto> getAllSuppliers() throws SQLException ;
    public boolean saveSupplier(SupplierDto supplierDto) throws SQLException ;
    public boolean updateSupplier(SupplierDto supplierDto) throws SQLException;
    public boolean deleteSupplier(String supId) throws SQLException ;
    public ArrayList<SupplierDto> searchSuppliersByNameOrId(String searchText) throws SQLException ;
}
