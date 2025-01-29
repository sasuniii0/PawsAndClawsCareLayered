package lk.ijse.gdse.pawsandclawscaremvc.dao.custom;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import lk.ijse.gdse.pawsandclawscaremvc.dao.SQLUtil;
import lk.ijse.gdse.pawsandclawscaremvc.dto.PaymentDto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface PaymentDAO {
    public ObservableList<String> getAllOrderIds() throws SQLException ;
    public ObservableList<String> getAllReservationIds() throws SQLException ;
    public String getNextPaymentId() throws SQLException;
    public ArrayList<PaymentDto> getAllPayments() throws SQLException;
    public boolean savePayment(PaymentDto paymentDto) throws SQLException ;
    public void displayCustomerDetailsByResId(String newValue) throws SQLException;
    public void displayCustomerDetailsByOrderId(String newValue) throws SQLException ;
    public boolean UpdatePayment(PaymentDto paymentDto) throws SQLException ;
    public boolean deletePayment(String paymentIdTxt) throws SQLException ;
    public ArrayList<PaymentDto> searchPaymentsByEmail(String searchText) throws SQLException ;
}
