package com.slukovskyi.tradertracker.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Order {

    @JsonProperty("avgPrice")
    private String averagePrice;

    private String clientOrderId;

    @JsonProperty("cumQuote")
    private String cumulativeQuoteQuantity;

    @JsonProperty("executedQty")
    private String executedQuantity;

    private Long orderId;

    @JsonProperty("origQty")
    private String originalQuantity;

    @JsonProperty("origType")
    private String originalType;

    private String price;

    private Boolean reduceOnly;

    private String side;

    private String positionSide;

    private String status;

    private String stopPrice;

    private Boolean closePosition;

    private String symbol;

    @JsonProperty("time")
    private Long orderTime;

    private String timeInForce;

    private String type;

    @JsonProperty("activatePrice")
    private String activationPrice;

    private String priceRate;

    private Long updateTime;

    private String workingType;

    private Boolean priceProtect;

}
