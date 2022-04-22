//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.binance.api.client.domain.event;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonIgnoreProperties(
        ignoreUnknown = true
)
public class MiniTickerEvent {
    @JsonProperty("e")
    private String eventType;
    @JsonProperty("E")
    private long eventTime;
    @JsonProperty("s")
    private String symbol;
    @JsonProperty("c")
    private String closePrice;
    @JsonProperty("o")
    private String openPrice;
    @JsonProperty("h")
    private String highPrice;
    @JsonProperty("l")
    private String lowPrice;
    @JsonProperty("v")
    private String totalTradedBaseAssetVolume;
    @JsonProperty("q")
    private String totalTradedQuoteAssetVolume;

    public MiniTickerEvent() {
    }

    public String getEventType() {
        return this.eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public long getEventTime() {
        return this.eventTime;
    }

    public void setEventTime(long eventTime) {
        this.eventTime = eventTime;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getClosePrice() {
        return this.closePrice;
    }

    public void setClosePrice(String closePrice) {
        this.closePrice = closePrice;
    }

    public String getOpenPrice() {
        return this.openPrice;
    }

    public void setOpenPrice(String openPrice) {
        this.openPrice = openPrice;
    }

    public String getHighPrice() {
        return this.highPrice;
    }

    public void setHighPrice(String highPrice) {
        this.highPrice = highPrice;
    }

    public String getLowPrice() {
        return this.lowPrice;
    }

    public void setLowPrice(String lowPrice) {
        this.lowPrice = lowPrice;
    }

    public String getTotalTradedBaseAssetVolume() {
        return this.totalTradedBaseAssetVolume;
    }

    public void setTotalTradedBaseAssetVolume(String totalTradedBaseAssetVolume) {
        this.totalTradedBaseAssetVolume = totalTradedBaseAssetVolume;
    }

    public String getTotalTradedQuoteAssetVolume() {
        return this.totalTradedQuoteAssetVolume;
    }

    public void setTotalTradedQuoteAssetVolume(String totalTradedQuoteAssetVolume) {
        this.totalTradedQuoteAssetVolume = totalTradedQuoteAssetVolume;
    }

    public String toString() {
        return (new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)).append("eventType", this.eventType).append("eventTime", this.eventTime).append("symbol", this.symbol).append("closePrice", this.closePrice).append("openPrice", this.openPrice).append("highPrice", this.highPrice).append("lowPrice", this.lowPrice).append("totalTradedBaseAssetVolume", this.totalTradedBaseAssetVolume).append("totalTradedQuoteAssetVolume", this.totalTradedQuoteAssetVolume).toString();
    }
}