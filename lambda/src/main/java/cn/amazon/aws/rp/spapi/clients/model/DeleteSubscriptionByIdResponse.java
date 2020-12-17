/*
 * Selling Partner API for Notifications
 * The Selling Partner API for Notifications lets you subscribe to notifications that are relevant to a selling partner's business. Using this API you can create a destination to receive notifications, subscribe to notifications, delete notification subscriptions, and more.
 *
 * OpenAPI spec version: v1
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

/**
 * The response schema for the deleteSubscriptionById operation.
 */
@ApiModel(description = "The response schema for the deleteSubscriptionById operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-27T15:23:56.921+08:00")
public class DeleteSubscriptionByIdResponse {
  @SerializedName("errors")
  private ErrorList errors = null;

  public DeleteSubscriptionByIdResponse errors(ErrorList errors) {
    this.errors = errors;
    return this;
  }

   /**
   * An unexpected condition occurred during the deleteSubscriptionById operation.
   * @return errors
  **/
  @ApiModelProperty(value = "An unexpected condition occurred during the deleteSubscriptionById operation.")
  public ErrorList getErrors() {
    return errors;
  }

  public void setErrors(ErrorList errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteSubscriptionByIdResponse deleteSubscriptionByIdResponse = (DeleteSubscriptionByIdResponse) o;
    return Objects.equals(this.errors, deleteSubscriptionByIdResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteSubscriptionByIdResponse {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

