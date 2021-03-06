/*
 * Bybit API
 * ## REST API for the Bybit Exchange. Base URI: [https://api.bybit.com]  
 *
 * OpenAPI spec version: 0.2.10
 * Contact: support@bybit.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * LinearListOrderResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-12T14:39:31.513+08:00")
public class LinearListOrderResult {
  @SerializedName("created_time")
  private String createdTime = null;

  @SerializedName("cum_exec_fee")
  private Double cumExecFee = null;

  @SerializedName("cum_exec_qty")
  private Double cumExecQty = null;

  @SerializedName("cum_exec_value")
  private Double cumExecValue = null;

  @SerializedName("last_exec_price")
  private Double lastExecPrice = null;

  @SerializedName("order_id")
  private String orderId = null;

  @SerializedName("order_link_id")
  private String orderLinkId = null;

  @SerializedName("order_status")
  private String orderStatus = null;

  @SerializedName("order_type")
  private String orderType = null;

  @SerializedName("price")
  private Double price = null;

  @SerializedName("qty")
  private Double qty = null;

  @SerializedName("reduce_only")
  private Boolean reduceOnly = null;

  @SerializedName("side")
  private String side = null;

  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("time_in_force")
  private String timeInForce = null;

  @SerializedName("updated_time")
  private String updatedTime = null;

  @SerializedName("user_id")
  private Long userId = null;

  @SerializedName("take_profit")
  private Double takeProfit = null;

  @SerializedName("stop_loss")
  private Double stopLoss = null;

  @SerializedName("tp_trigger_by")
  private String tpTriggerBy = null;

  @SerializedName("sl_trigger_by")
  private String slTriggerBy = null;

  public LinearListOrderResult createdTime(String createdTime) {
    this.createdTime = createdTime;
    return this;
  }

   /**
   * Get createdTime
   * @return createdTime
  **/
  @ApiModelProperty(value = "")
  public String getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(String createdTime) {
    this.createdTime = createdTime;
  }

  public LinearListOrderResult cumExecFee(Double cumExecFee) {
    this.cumExecFee = cumExecFee;
    return this;
  }

   /**
   * Get cumExecFee
   * @return cumExecFee
  **/
  @ApiModelProperty(value = "")
  public Double getCumExecFee() {
    return cumExecFee;
  }

  public void setCumExecFee(Double cumExecFee) {
    this.cumExecFee = cumExecFee;
  }

  public LinearListOrderResult cumExecQty(Double cumExecQty) {
    this.cumExecQty = cumExecQty;
    return this;
  }

   /**
   * Get cumExecQty
   * @return cumExecQty
  **/
  @ApiModelProperty(value = "")
  public Double getCumExecQty() {
    return cumExecQty;
  }

  public void setCumExecQty(Double cumExecQty) {
    this.cumExecQty = cumExecQty;
  }

  public LinearListOrderResult cumExecValue(Double cumExecValue) {
    this.cumExecValue = cumExecValue;
    return this;
  }

   /**
   * Get cumExecValue
   * @return cumExecValue
  **/
  @ApiModelProperty(value = "")
  public Double getCumExecValue() {
    return cumExecValue;
  }

  public void setCumExecValue(Double cumExecValue) {
    this.cumExecValue = cumExecValue;
  }

  public LinearListOrderResult lastExecPrice(Double lastExecPrice) {
    this.lastExecPrice = lastExecPrice;
    return this;
  }

   /**
   * Get lastExecPrice
   * @return lastExecPrice
  **/
  @ApiModelProperty(value = "")
  public Double getLastExecPrice() {
    return lastExecPrice;
  }

  public void setLastExecPrice(Double lastExecPrice) {
    this.lastExecPrice = lastExecPrice;
  }

  public LinearListOrderResult orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Get orderId
   * @return orderId
  **/
  @ApiModelProperty(value = "")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public LinearListOrderResult orderLinkId(String orderLinkId) {
    this.orderLinkId = orderLinkId;
    return this;
  }

   /**
   * Get orderLinkId
   * @return orderLinkId
  **/
  @ApiModelProperty(value = "")
  public String getOrderLinkId() {
    return orderLinkId;
  }

  public void setOrderLinkId(String orderLinkId) {
    this.orderLinkId = orderLinkId;
  }

  public LinearListOrderResult orderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
    return this;
  }

   /**
   * Get orderStatus
   * @return orderStatus
  **/
  @ApiModelProperty(value = "")
  public String getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
  }

  public LinearListOrderResult orderType(String orderType) {
    this.orderType = orderType;
    return this;
  }

   /**
   * Get orderType
   * @return orderType
  **/
  @ApiModelProperty(value = "")
  public String getOrderType() {
    return orderType;
  }

  public void setOrderType(String orderType) {
    this.orderType = orderType;
  }

  public LinearListOrderResult price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public LinearListOrderResult qty(Double qty) {
    this.qty = qty;
    return this;
  }

   /**
   * Get qty
   * @return qty
  **/
  @ApiModelProperty(value = "")
  public Double getQty() {
    return qty;
  }

  public void setQty(Double qty) {
    this.qty = qty;
  }

  public LinearListOrderResult reduceOnly(Boolean reduceOnly) {
    this.reduceOnly = reduceOnly;
    return this;
  }

   /**
   * Get reduceOnly
   * @return reduceOnly
  **/
  @ApiModelProperty(value = "")
  public Boolean isReduceOnly() {
    return reduceOnly;
  }

  public void setReduceOnly(Boolean reduceOnly) {
    this.reduceOnly = reduceOnly;
  }

  public LinearListOrderResult side(String side) {
    this.side = side;
    return this;
  }

   /**
   * Get side
   * @return side
  **/
  @ApiModelProperty(value = "")
  public String getSide() {
    return side;
  }

  public void setSide(String side) {
    this.side = side;
  }

  public LinearListOrderResult symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * Get symbol
   * @return symbol
  **/
  @ApiModelProperty(value = "")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public LinearListOrderResult timeInForce(String timeInForce) {
    this.timeInForce = timeInForce;
    return this;
  }

   /**
   * Get timeInForce
   * @return timeInForce
  **/
  @ApiModelProperty(value = "")
  public String getTimeInForce() {
    return timeInForce;
  }

  public void setTimeInForce(String timeInForce) {
    this.timeInForce = timeInForce;
  }

  public LinearListOrderResult updatedTime(String updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

   /**
   * Get updatedTime
   * @return updatedTime
  **/
  @ApiModelProperty(value = "")
  public String getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(String updatedTime) {
    this.updatedTime = updatedTime;
  }

  public LinearListOrderResult userId(Long userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public LinearListOrderResult takeProfit(Double takeProfit) {
    this.takeProfit = takeProfit;
    return this;
  }

   /**
   * Get takeProfit
   * @return takeProfit
  **/
  @ApiModelProperty(value = "")
  public Double getTakeProfit() {
    return takeProfit;
  }

  public void setTakeProfit(Double takeProfit) {
    this.takeProfit = takeProfit;
  }

  public LinearListOrderResult stopLoss(Double stopLoss) {
    this.stopLoss = stopLoss;
    return this;
  }

   /**
   * Get stopLoss
   * @return stopLoss
  **/
  @ApiModelProperty(value = "")
  public Double getStopLoss() {
    return stopLoss;
  }

  public void setStopLoss(Double stopLoss) {
    this.stopLoss = stopLoss;
  }

  public LinearListOrderResult tpTriggerBy(String tpTriggerBy) {
    this.tpTriggerBy = tpTriggerBy;
    return this;
  }

   /**
   * Get tpTriggerBy
   * @return tpTriggerBy
  **/
  @ApiModelProperty(value = "")
  public String getTpTriggerBy() {
    return tpTriggerBy;
  }

  public void setTpTriggerBy(String tpTriggerBy) {
    this.tpTriggerBy = tpTriggerBy;
  }

  public LinearListOrderResult slTriggerBy(String slTriggerBy) {
    this.slTriggerBy = slTriggerBy;
    return this;
  }

   /**
   * Get slTriggerBy
   * @return slTriggerBy
  **/
  @ApiModelProperty(value = "")
  public String getSlTriggerBy() {
    return slTriggerBy;
  }

  public void setSlTriggerBy(String slTriggerBy) {
    this.slTriggerBy = slTriggerBy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinearListOrderResult linearListOrderResult = (LinearListOrderResult) o;
    return Objects.equals(this.createdTime, linearListOrderResult.createdTime) &&
        Objects.equals(this.cumExecFee, linearListOrderResult.cumExecFee) &&
        Objects.equals(this.cumExecQty, linearListOrderResult.cumExecQty) &&
        Objects.equals(this.cumExecValue, linearListOrderResult.cumExecValue) &&
        Objects.equals(this.lastExecPrice, linearListOrderResult.lastExecPrice) &&
        Objects.equals(this.orderId, linearListOrderResult.orderId) &&
        Objects.equals(this.orderLinkId, linearListOrderResult.orderLinkId) &&
        Objects.equals(this.orderStatus, linearListOrderResult.orderStatus) &&
        Objects.equals(this.orderType, linearListOrderResult.orderType) &&
        Objects.equals(this.price, linearListOrderResult.price) &&
        Objects.equals(this.qty, linearListOrderResult.qty) &&
        Objects.equals(this.reduceOnly, linearListOrderResult.reduceOnly) &&
        Objects.equals(this.side, linearListOrderResult.side) &&
        Objects.equals(this.symbol, linearListOrderResult.symbol) &&
        Objects.equals(this.timeInForce, linearListOrderResult.timeInForce) &&
        Objects.equals(this.updatedTime, linearListOrderResult.updatedTime) &&
        Objects.equals(this.userId, linearListOrderResult.userId) &&
        Objects.equals(this.takeProfit, linearListOrderResult.takeProfit) &&
        Objects.equals(this.stopLoss, linearListOrderResult.stopLoss) &&
        Objects.equals(this.tpTriggerBy, linearListOrderResult.tpTriggerBy) &&
        Objects.equals(this.slTriggerBy, linearListOrderResult.slTriggerBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdTime, cumExecFee, cumExecQty, cumExecValue, lastExecPrice, orderId, orderLinkId, orderStatus, orderType, price, qty, reduceOnly, side, symbol, timeInForce, updatedTime, userId, takeProfit, stopLoss, tpTriggerBy, slTriggerBy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinearListOrderResult {\n");
    
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    cumExecFee: ").append(toIndentedString(cumExecFee)).append("\n");
    sb.append("    cumExecQty: ").append(toIndentedString(cumExecQty)).append("\n");
    sb.append("    cumExecValue: ").append(toIndentedString(cumExecValue)).append("\n");
    sb.append("    lastExecPrice: ").append(toIndentedString(lastExecPrice)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    orderLinkId: ").append(toIndentedString(orderLinkId)).append("\n");
    sb.append("    orderStatus: ").append(toIndentedString(orderStatus)).append("\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    qty: ").append(toIndentedString(qty)).append("\n");
    sb.append("    reduceOnly: ").append(toIndentedString(reduceOnly)).append("\n");
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    timeInForce: ").append(toIndentedString(timeInForce)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    takeProfit: ").append(toIndentedString(takeProfit)).append("\n");
    sb.append("    stopLoss: ").append(toIndentedString(stopLoss)).append("\n");
    sb.append("    tpTriggerBy: ").append(toIndentedString(tpTriggerBy)).append("\n");
    sb.append("    slTriggerBy: ").append(toIndentedString(slTriggerBy)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

