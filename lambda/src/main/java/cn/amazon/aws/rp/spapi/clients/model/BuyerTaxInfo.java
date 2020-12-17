/*
 * Selling Partner API for Orders
 * The Selling Partner API for Orders helps you programmatically retrieve order information. These APIs let you develop fast, flexible, custom applications in areas like order synchronization, order research, and demand-based decision support tools.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package cn.amazon.aws.rp.spapi.clients.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Tax information about the buyer.
 */
@ApiModel(description = "Tax information about the buyer.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-27T15:23:41.622+08:00")
public class BuyerTaxInfo {
  @SerializedName("CompanyLegalName")
  private String companyLegalName = null;

  @SerializedName("TaxingRegion")
  private String taxingRegion = null;

  @SerializedName("TaxClassifications")
  private List<TaxClassification> taxClassifications = null;

  public BuyerTaxInfo companyLegalName(String companyLegalName) {
    this.companyLegalName = companyLegalName;
    return this;
  }

   /**
   * The legal name of the company.
   * @return companyLegalName
  **/
  @ApiModelProperty(value = "The legal name of the company.")
  public String getCompanyLegalName() {
    return companyLegalName;
  }

  public void setCompanyLegalName(String companyLegalName) {
    this.companyLegalName = companyLegalName;
  }

  public BuyerTaxInfo taxingRegion(String taxingRegion) {
    this.taxingRegion = taxingRegion;
    return this;
  }

   /**
   * The country or region imposing the tax.
   * @return taxingRegion
  **/
  @ApiModelProperty(value = "The country or region imposing the tax.")
  public String getTaxingRegion() {
    return taxingRegion;
  }

  public void setTaxingRegion(String taxingRegion) {
    this.taxingRegion = taxingRegion;
  }

  public BuyerTaxInfo taxClassifications(List<TaxClassification> taxClassifications) {
    this.taxClassifications = taxClassifications;
    return this;
  }

  public BuyerTaxInfo addTaxClassificationsItem(TaxClassification taxClassificationsItem) {
    if (this.taxClassifications == null) {
      this.taxClassifications = new ArrayList<TaxClassification>();
    }
    this.taxClassifications.add(taxClassificationsItem);
    return this;
  }

   /**
   * A list of tax classifications that apply to the order.
   * @return taxClassifications
  **/
  @ApiModelProperty(value = "A list of tax classifications that apply to the order.")
  public List<TaxClassification> getTaxClassifications() {
    return taxClassifications;
  }

  public void setTaxClassifications(List<TaxClassification> taxClassifications) {
    this.taxClassifications = taxClassifications;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuyerTaxInfo buyerTaxInfo = (BuyerTaxInfo) o;
    return Objects.equals(this.companyLegalName, buyerTaxInfo.companyLegalName) &&
        Objects.equals(this.taxingRegion, buyerTaxInfo.taxingRegion) &&
        Objects.equals(this.taxClassifications, buyerTaxInfo.taxClassifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyLegalName, taxingRegion, taxClassifications);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuyerTaxInfo {\n");
    
    sb.append("    companyLegalName: ").append(toIndentedString(companyLegalName)).append("\n");
    sb.append("    taxingRegion: ").append(toIndentedString(taxingRegion)).append("\n");
    sb.append("    taxClassifications: ").append(toIndentedString(taxClassifications)).append("\n");
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

