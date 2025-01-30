package lk.ijse.gdse.pawsandclawscaremvc.bo;

import lk.ijse.gdse.pawsandclawscaremvc.bo.custom.impl.*;
import lk.ijse.gdse.pawsandclawscaremvc.dao.SuperDAO;
import lk.ijse.gdse.pawsandclawscaremvc.dao.custom.impl.*;

public class BOFactory {
    private static BOFactory boFactory;
    private BOFactory(){}

    private static BOFactory getBoFactory(){
        return (boFactory==null) ? boFactory= new BOFactory():boFactory;
    }
    public enum BOTypes{
        CUSTOMER,EMPLOYEE,INVENTORY,ORDERS,ORDER_DETAIL,PAYMENT,PET,PRODUCT,REPORT,RESERVATION,SERVICE,SERVICE_DETAIL,SUPPLIER,USER
    }
    public SuperBO getBO(BOTypes botypes){
        switch(botypes){
            case CUSTOMER -> {
                return new CustomerBOImpl();
            }
            case EMPLOYEE -> {
                return new EmployeeBOImpl();
            }
            case INVENTORY -> {
                return new InventoryBOImpl();
            }
            case ORDER_DETAIL -> {
                return new OrderDetailsBOImpl();
            }
            case ORDERS -> {
                return new OrderBOImpl();
            }
            case PAYMENT -> {
                return new PaymentBOImpl();
            }
            case PET -> {
                return new PetBOImpl();
            }
            case PRODUCT -> {
                return new ProductBOImpl();
            }
            case RESERVATION -> {
                return new ReservationBOImpl();
            }
            case SERVICE -> {
                return new ServiceBOImpl();
            }
            case SERVICE_DETAIL -> {
                return new ServiceDetailsBOImpl();
            }
            case SUPPLIER -> {
                return new SupplierBOImpl();
            }
            case USER -> {
                return new UserBOImpl();
            }
            default -> {
                return null;
            }
        }
    }
}
