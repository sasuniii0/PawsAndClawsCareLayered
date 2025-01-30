package lk.ijse.gdse.pawsandclawscaremvc.dao.custom;

import lk.ijse.gdse.pawsandclawscaremvc.dao.CrudDAO;
import lk.ijse.gdse.pawsandclawscaremvc.dao.SQLUtil;
import lk.ijse.gdse.pawsandclawscaremvc.dto.OrderDetailsDto;
import lk.ijse.gdse.pawsandclawscaremvc.dto.ProductDto;
import lk.ijse.gdse.pawsandclawscaremvc.entity.Product;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface ProductDAO extends CrudDAO<Product> {
    public boolean saveProduct(ProductDto productDto) throws SQLException;
    public  boolean reduceQty(OrderDetailsDto orderDetailsDto) throws SQLException;
    public ArrayList<ProductDto> getAllProducts() throws SQLException;
    public String getNextProductId() throws SQLException;
    public boolean deleteItem(String proId) throws SQLException;
    public boolean updateProduct(ProductDto productDto) throws SQLException;
    public ArrayList<String> getAllProductId() throws SQLException;
    public ProductDto findById(String selectedProId) throws SQLException ;
    public ArrayList<ProductDto> searchProductsByCatalog(String searchText) throws SQLException ;
    public ArrayList<ProductDto> getLowStockProducts() throws SQLException;
}
