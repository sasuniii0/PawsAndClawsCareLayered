package lk.ijse.gdse.pawsandclawscaremvc.dao;

import lk.ijse.gdse.pawsandclawscaremvc.dao.custom.impl.*;

public class DAOFactory {
    private static DAOFactory daoFactory;
    private DAOFactory(){
    }
    private static DAOFactory getDaoFactory(){
        return (daoFactory==null)? daoFactory= new DAOFactory():daoFactory;
    }
    public enum DAOTypes{
        CUSTOMER,EMPLOYEE,INVENTORY,ORDERS,ORDER_DETAIL,PAYMENT,PET,PRODUCT,REPORT,RESERVATION,SERVICE,SERVICE_DETAIL,SUPPLIER,USER
    }
    public SuperDAO getDAO(DAOTypes types){
        switch(types){
            case CUSTOMER -> {
                return new CustomerDAOImpl();
            }
            case EMPLOYEE -> {
                return new EmpManageDAOImpl();
            }
            case INVENTORY -> {
                return new InvenManageDAOImpl();
            }
            case ORDER_DETAIL -> {
                return new OrderDetailsDAOImpl();
            }
            case ORDERS -> {
                return new OrderManageDAOImpl();
            }
            case PAYMENT -> {
                return new PaymentDAOImpl();
            }
            case PET -> {
                return new PetManageDAOImpl();
            }
            case PRODUCT -> {
                return new ProductManageDAOImpl();
            }
            case RESERVATION -> {
                return new ReservationDAOImpl();
            }
            case SERVICE -> {
                return new ServiceDAOImpl();
            }
            case SERVICE_DETAIL -> {
                return new ServiceDetailsDAOImpl();
            }
            case SUPPLIER -> {
                return new SupManageDAOImpl();
            }
            case USER -> {
                return new UserDAOImpl();
            }
            default -> {
                return null;
            }
        }
    }
}
