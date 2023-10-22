package com.billing.repository;

import com.billing.dto.DailyPriceListResponse;
import com.billing.models.DailyPriceList;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface DailyPriceListRepository  extends MongoRepository<DailyPriceList,String> {
    List<DailyPriceListResponse> findAll(DailyPriceList dailyPriceList);
}
