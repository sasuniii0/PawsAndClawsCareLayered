package lk.ijse.gdse.pawsandclawscaremvc.dao.custom;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import lk.ijse.gdse.pawsandclawscaremvc.dao.CrudDAO;
import lk.ijse.gdse.pawsandclawscaremvc.dao.SQLUtil;
import lk.ijse.gdse.pawsandclawscaremvc.dao.custom.impl.ServiceDetailsDAOImpl;
import lk.ijse.gdse.pawsandclawscaremvc.db.DBConnection;
import lk.ijse.gdse.pawsandclawscaremvc.dto.ReservationDto;
import lk.ijse.gdse.pawsandclawscaremvc.entity.Reservation;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface ReservationDAO extends CrudDAO<Reservation> {
    public String getNextReservationId() throws SQLException ;
    public ObservableList<String> getAllCustomerId() throws SQLException;
    public boolean checkServiceAvailability(String services, String date, String dropOffTime) throws SQLException ;
    public ArrayList<String> getAvailableEmployee() throws SQLException;
    public String getSelectedServicePrice(String selectedService) throws SQLException ;
    ServiceDetailsDAOImpl serviceDetailsDAOImpl = new ServiceDetailsDAOImpl();
    public boolean saveReservation(ReservationDto reservationDto) throws SQLException;
}
