package com.slukovskyi.tradertracker.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.slukovskyi.tradertracker.models.enums.PositionSide;
import lombok.Data;

@Data
public class Position {

    @JsonProperty("symbol")
    private String symbol;

    @JsonProperty("initialMargin")
    private Double initialMargin;

    @JsonProperty("maintMargin")
    private Double maintenanceMargin;

    @JsonProperty("unrealizedProfit")
    private Double unrealizedProfit;

    @JsonProperty("positionInitialMargin")
    private Double positionInitialMargin;

    @JsonProperty("openOrderInitialMargin")
    private Double openOrderInitialMargin;

    @JsonProperty("leverage")
    private Integer leverage;

    @JsonProperty("isolated")
    private Boolean isolated;

    @JsonProperty("entryPrice")
    private Double entryPrice;

    @JsonProperty("maximumNotional")
    private Integer maximumNotional;

    @JsonProperty("positionSide")
    private PositionSide positionSide;

    @JsonProperty("positionAmt")
    private Double positionAmount;

    @JsonProperty("lastUpdateTime")
    private Long lastUpdateTime;

}
