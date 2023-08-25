package com.slukovskyi.tradertracker.services.impl;

import com.slukovskyi.tradertracker.clients.AccountDataFeignClient;
import com.slukovskyi.tradertracker.models.Position;
import com.slukovskyi.tradertracker.services.PositionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PositionServiceImpl implements PositionService {

    private final AccountDataFeignClient accountDataFeignClient;

    @Override
    public List<Position> getPositionsBySymbol(String symbol) {
        return accountDataFeignClient.position(symbol, System.currentTimeMillis())
                .stream().filter(position -> position.getEntryPrice() != 0).toList();
    }

    @Override
    public List<Position> getAllPositions() {
        return accountDataFeignClient.position(null, System.currentTimeMillis())
                .stream().filter(position -> position.getEntryPrice() != 0).toList();
    }
}
