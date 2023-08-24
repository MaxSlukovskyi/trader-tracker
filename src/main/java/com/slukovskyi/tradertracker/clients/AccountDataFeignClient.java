package com.slukovskyi.tradertracker.clients;

import com.slukovskyi.tradertracker.config.SignedEndpointFeignConfiguration;
import com.slukovskyi.tradertracker.models.AccountInformation;
import com.slukovskyi.tradertracker.models.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "order", url = "${binance.api.url}", configuration = SignedEndpointFeignConfiguration.class)
public interface AccountDataFeignClient {

    @GetMapping(value = "/fapi/v1/allOrders")
    List<Order> allOrders(@RequestParam("symbol") String symbol, @RequestParam("timestamp") Long timestamp);

    @GetMapping(value = "/fapi/v2/account")
    AccountInformation account(@RequestParam("timestamp") Long timestamp);
}
