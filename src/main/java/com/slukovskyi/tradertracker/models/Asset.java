package com.slukovskyi.tradertracker.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Asset {

    @JsonProperty("asset")
    private String name;

    @JsonProperty("walletBalance")
    private Double walletBalance;

    @JsonProperty("unrealizedProfit")
    private Double unrealizedProfit;

    @JsonProperty("marginBalance")
    private Double marginBalance;

    @JsonProperty("initialMargin")
    private Double initialMargin;

    @JsonProperty("positionInitialMargin")
    private Double positionsInitialMargin;

    @JsonProperty("openOrderInitialMargin")
    private Double openOrdersInitialMargin;

    @JsonProperty("crossWalletBalance")
    private Double crossWalletBalance;

    @JsonProperty("crossUnPnl")
    private Double crossUnrealizedPnl;

    @JsonProperty("availableBalance")
    private Double availableBalance;

    @JsonProperty("maxWithdrawAmount")
    private Double maximumWithdrawAmount;

}
