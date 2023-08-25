package com.slukovskyi.tradertracker.services;

import com.slukovskyi.tradertracker.models.Position;

import java.util.List;

public interface PositionService {

    List<Position> getPositionsBySymbol(String symbol);
    List<Position> getAllPositions();
}
