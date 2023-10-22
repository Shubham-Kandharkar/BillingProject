package com.billing.contoller;

import com.billing.dto.DailyPriceListRequest;
import com.billing.dto.DailyPriceListResponse;
import com.billing.service.BillingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/price")
@RequiredArgsConstructor
public class UiController {

    private final BillingService billingService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void todayPrices(@RequestParam DailyPriceListRequest dailyPriceListRequest){
        billingService.todayPrices(dailyPriceListRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<DailyPriceListResponse> getTodayPrice(@RequestParam DailyPriceListRequest dailyPriceListRequest){
        return billingService.getTodayPrice(dailyPriceListRequest);
    }

}
