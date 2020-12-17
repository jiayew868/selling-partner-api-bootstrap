/*
 * Selling Partner API for Finances
 * The Selling Partner API for Finances helps you obtain financial information relevant to a seller's business. You can obtain financial events for a given order, financial event group, or date range without having to wait until a statement period closes. You can also obtain financial event groups for a given date range.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package cn.amazon.aws.rp.spapi.clients.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * A currency type and amount.
 */
@ApiModel(description = "A currency type and amount.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-10T09:30:40.719+08:00")
public class Currency {
  @SerializedName("CurrencyCode")
  private String currencyCode = null;

  @SerializedName("CurrencyAmount")
  private BigDecimal currencyAmount = null;

  public Currency currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * The three-digit currency code in ISO 4217 format.
   * @return currencyCode
  **/
  @ApiModelProperty(value = "The three-digit currency code in ISO 4217 format.")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public Currency currencyAmount(BigDecimal currencyAmount) {
    this.currencyAmount = currencyAmount;
    return this;
  }

   /**
   * The monetary value.
   * @return currencyAmount
  **/
  @ApiModelProperty(value = "The monetary value.")
  public BigDecimal getCurrencyAmount() {
    return currencyAmount;
  }

  public void setCurrencyAmount(BigDecimal currencyAmount) {
    this.currencyAmount = currencyAmount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Currency currency = (Currency) o;
    return Objects.equals(this.currencyCode, currency.currencyCode) &&
        Objects.equals(this.currencyAmount, currency.currencyAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, currencyAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Currency {\n");

    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    currencyAmount: ").append(toIndentedString(currencyAmount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

