package com.slukovskyi.tradertracker.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class AccountInformation {

    @JsonProperty("totalInitialMargin")
    private Double totalInitialMargin;

    @JsonProperty("totalMaintMargin")
    private Double totalMaintenanceMargin;

    @JsonProperty("totalWalletBalance")
    private Double totalWalletBalance;

    @JsonProperty("totalUnrealizedProfit")
    private Double totalUnrealizedProfit;

    @JsonProperty("totalMarginBalance")
    private Double totalMarginBalance;

    @JsonProperty("totalPositionInitialMargin")
    private Double totalPositionInitialMargin;

    @JsonProperty("totalOpenOrderInitialMargin")
    private Double totalOpenOrderInitialMargin;

    @JsonProperty("totalCrossWalletBalance")
    private Double totalCrossWalletBalance;

    @JsonProperty("totalCrossUnPnl")
    private Double totalCrossUnrealizedPnl;

    @JsonProperty("availableBalance")
    private Double availableBalance;

    @JsonProperty("maxWithdrawAmount")
    private Double maximumWithdrawAmount;

    @JsonProperty("assets")
    private List<Asset> assets;


}
