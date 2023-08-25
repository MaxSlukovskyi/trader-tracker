package com.slukovskyi.tradertracker.controllers;

import com.slukovskyi.tradertracker.clients.AccountDataFeignClient;
import com.slukovskyi.tradertracker.models.AccountInformation;
import com.slukovskyi.tradertracker.models.Order;
import com.slukovskyi.tradertracker.models.Position;
import com.slukovskyi.tradertracker.services.PositionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
@RequiredArgsConstructor
public class AccountDataController {

    private final AccountDataFeignClient accountDataFeignClient;
    private final PositionService positionService;

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

    @GetMapping("/position")
    public ResponseEntity<List<Position>> getPositionsBySymbol(@RequestParam("symbol") String symbol) {
        List<Position> positions = positionService.getPositionsBySymbol(symbol);
        return new ResponseEntity<>(positions, HttpStatus.ACCEPTED);
    }

    @GetMapping("/position/all")
    public ResponseEntity<List<Position>> getAllPositions() {
        List<Position> positions = positionService.getAllPositions();
        return new ResponseEntity<>(positions, HttpStatus.ACCEPTED);
    }
}
