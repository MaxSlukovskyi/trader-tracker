package com.slukovskyi.tradertracker.controllers;

import com.slukovskyi.tradertracker.clients.AccountDataFeignClient;
import com.slukovskyi.tradertracker.models.AccountInformation;
import com.slukovskyi.tradertracker.models.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/account")
//@RequiredArgsConstructor
public class AccountDataController {

    private final AccountDataFeignClient accountDataFeignClient;

    public AccountDataController(AccountDataFeignClient accountDataFeignClient) {
        this.accountDataFeignClient = accountDataFeignClient;
    }

    @GetMapping("/all/orders")
    public ResponseEntity<List<Order>> getAllOrders() {
        List<Order> orders = accountDataFeignClient.allOrders("ETHUSDT", System.currentTimeMillis());
        return new ResponseEntity<>(orders, HttpStatus.ACCEPTED);
    }

    @GetMapping
    public ResponseEntity<AccountInformation> getAccountInformation() {
        AccountInformation accountInformation = accountDataFeignClient.account(System.currentTimeMillis());
        return new ResponseEntity<>(accountInformation, HttpStatus.ACCEPTED);
    }
}
