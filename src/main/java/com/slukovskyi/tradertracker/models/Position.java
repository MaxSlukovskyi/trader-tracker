package com.slukovskyi.tradertracker.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.slukovskyi.tradertracker.models.enums.PositionSide;
import lombok.Data;

@Data
public class Position {

    @JsonProperty("entryPrice")
    private Double entryPrice;

    @JsonProperty("marginType")
    private String marginType;

    @JsonProperty("isolatedMargin")
    private Double isolatedMargin;

    @JsonProperty("leverage")
    private Integer leverage;

    @JsonProperty("liquidationPrice")
    private Double liquidationPrice;

    @JsonProperty("markPrice")
    private Double markPrice;

    @JsonProperty("maxNotionalValue")
    private Integer maximumNotionalValue;

    @JsonProperty("positionAmt")
    private Double positionAmount;

    @JsonProperty("symbol")
    private String symbol;

    @JsonProperty("unRealizedProfit")
    private Double unrealizedProfit;

    @JsonProperty("positionSide")
    private PositionSide positionSide;

}
