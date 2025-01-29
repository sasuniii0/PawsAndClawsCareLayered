package lk.ijse.gdse.pawsandclawscaremvc.dao.custom;

import lk.ijse.gdse.pawsandclawscaremvc.dao.SQLUtil;
import lk.ijse.gdse.pawsandclawscaremvc.dao.custom.impl.ServiceDAOImpl;
import lk.ijse.gdse.pawsandclawscaremvc.dto.ServiceDetailsDto;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ServiceDetailDAO {
    ServiceDAOImpl serviceDAOImpl = new ServiceDAOImpl();
    public boolean saveReservationDetailsList(ArrayList<ServiceDetailsDto> serviceDetailsDtos) throws SQLException ;
    boolean saveReservationDetails(ServiceDetailsDto serviceDetailsDto) throws SQLException;
}
