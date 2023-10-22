package com.billing.models;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.time.LocalDateTime;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Document(value = "Daily_Price_List")
public class DailyPriceList {
    @Id
    String id;
    LocalDateTime businessDate;
    String apple;
    String ball;
    String carrot;
    String detergent;

}
