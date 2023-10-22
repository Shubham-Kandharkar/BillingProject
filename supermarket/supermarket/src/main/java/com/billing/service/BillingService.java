package com.billing.service;

import com.billing.dto.DailyPriceListRequest;
import com.billing.dto.DailyPriceListResponse;
import com.billing.models.DailyPriceList;
import com.billing.repository.DailyPriceListRepository;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Log4j
public class BillingService {

    private final DailyPriceListRepository dailyPriceListRepository;
    public void todayPrices(DailyPriceListRequest dailyPriceListRequest){

        DailyPriceList dailyPriceList = dailyPriceListMapping(dailyPriceListRequest);
//        Logger.INFO_INT("Inside Save method to save daily price list: {}",dailyPriceList);
        dailyPriceListRepository.save(dailyPriceList);

    }

    private static DailyPriceList dailyPriceListMapping(DailyPriceListRequest dailyPriceListRequest) {

        return DailyPriceList.builder()
                .apple(dailyPriceListRequest.getApple())
                .ball(dailyPriceListRequest.getBall())
                .carrot(dailyPriceListRequest.getCarrot())
                .detergent(dailyPriceListRequest.getDetergent())
                .build();
    }

    public List<DailyPriceListResponse> getTodayPrice(DailyPriceListRequest dailyPriceListRequest) {
        DailyPriceList dailyPriceList = dailyPriceListMapping(dailyPriceListRequest);
               return dailyPriceListRepository.findAll(dailyPriceList);
    }
}
