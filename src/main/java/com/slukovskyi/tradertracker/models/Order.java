package com.slukovskyi.tradertracker.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.slukovskyi.tradertracker.models.enums.*;
import lombok.Data;

@Data
public class Order {

    @JsonProperty("avgPrice")
    private Double averagePrice;

    @JsonProperty("clientOrderId")
    private String clientOrderId;

    @JsonProperty("cumQuote")
    private Double cumulativeQuoteQuantity;

    @JsonProperty("executedQty")
    private Double executedQuantity;

    @JsonProperty("orderId")
    private Long orderId;

    @JsonProperty("origQty")
    private Double originalQuantity;

    @JsonProperty("price")
    private Double price;

    @JsonProperty("reduceOnly")
    private Boolean reduceOnly;

    @JsonProperty("side")
    private OrderSide side;

    @JsonProperty("positionSide")
    private PositionSide positionSide;

    @JsonProperty("status")
    private OrderStatus status;

    @JsonProperty("stopPrice")
    private Double stopPrice;

    @JsonProperty("closePosition")
    private Boolean closePosition;

    @JsonProperty("symbol")
    private String symbol;

    @JsonProperty("time")
    private Long orderTime;

    @JsonProperty("type")
    private OrderType type;

    @JsonProperty("activatePrice")
    private Double activationPrice;

    @JsonProperty("priceRate")
    private Double priceRate;

    @JsonProperty("updateTime")
    private Long updateTime;

    @JsonProperty("workingType")
    private OrderWorkingType workingType;

    @JsonProperty("priceProtect")
    private Boolean priceProtect;

}
