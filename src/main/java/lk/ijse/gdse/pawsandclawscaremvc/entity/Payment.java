package lk.ijse.gdse.pawsandclawscaremvc.entity;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private String paymentId;
    private LocalDate date;
    private double amount;
    private String method;
    private String resId;
    private String orderId;
    private String custId;
    private String email;
}
