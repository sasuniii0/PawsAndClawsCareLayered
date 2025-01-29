package lk.ijse.gdse.pawsandclawscaremvc.view.tdm;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ProductTm {
    private String productId;
    private String productName;
    private String description;
    private double price;
    private int qty;
}
