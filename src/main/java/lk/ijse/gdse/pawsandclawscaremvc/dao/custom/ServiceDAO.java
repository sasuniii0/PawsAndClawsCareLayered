package lk.ijse.gdse.pawsandclawscaremvc.dao.custom;

import lk.ijse.gdse.pawsandclawscaremvc.dao.SQLUtil;
import lk.ijse.gdse.pawsandclawscaremvc.dto.ServiceDetailsDto;
import lk.ijse.gdse.pawsandclawscaremvc.dto.ServiceDto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface ServiceDAO {

    public ArrayList<String> getAllItemIds() throws SQLException ;
    public ServiceDto findServiceByEmployeeId(String empId) throws SQLException;
    public ArrayList<ServiceDto> getAllServices() throws SQLException ;
    public String getNextCustomerId() throws SQLException ;
    public boolean saveService(ServiceDto serviceDto) throws SQLException;
    public boolean updateService(ServiceDto serviceDto) throws SQLException;
    public boolean deleteService(String serviceIdText) throws SQLException ;
    public ArrayList<String> getAllServiceIds() throws SQLException ;
    public double getPricePerHour(String selectedService) throws SQLException;
    public String getDuration(String selectedService) throws SQLException;
    public boolean bookService(ServiceDetailsDto serviceDetailsDto) throws SQLException ;
    boolean saveServiceDetails(ServiceDetailsDto serviceDetailsDto) ;
    boolean updateServiceAvailability(String serviceId) throws SQLException ;
    boolean checkServiceAvailability(String serviceId, String description) throws SQLException ;
    public String getServiceDescriptionById(String selectedServiceId) throws SQLException;
    public ArrayList<String> getAllServiceIdDesc() throws SQLException;
}
