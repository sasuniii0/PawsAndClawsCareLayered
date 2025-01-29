module lk.ijse.gdse.pawsandclawscaremvc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires static lombok;
    requires net.sf.jasperreports.core;
    requires java.mail;
    requires jdk.jsobject;
    requires org.json;
    requires mysql.connector.j;
    requires jbcrypt;

    opens lk.ijse.gdse.pawsandclawscaremvc.controller to javafx.fxml;
    exports lk.ijse.gdse.pawsandclawscaremvc;
    opens lk.ijse.gdse.pawsandclawscaremvc.view.tdm to javafx.base;
}