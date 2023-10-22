package com.billing.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class DailyPriceListRequest {
    LocalDateTime businessDate;
    String apple;
    String ball;
    String carrot;
    String detergent;

}
