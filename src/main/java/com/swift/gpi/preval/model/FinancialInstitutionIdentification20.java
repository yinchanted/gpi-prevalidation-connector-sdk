/*
 * Beneficiary account pre-validation
 * Move your app forward with the Account Pre-Validation API
 *
 * OpenAPI spec version: 1.0.7-oas3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.swift.gpi.preval.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.swift.gpi.preval.model.ClearingSystemMemberIdentification2;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;

/**
 * Set of elements used to identify a financial institution.
 */
@Schema(description = "Set of elements used to identify a financial institution.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-06-19T14:52:07.265298-04:00[America/New_York]")public class FinancialInstitutionIdentification20 {

  @SerializedName("bicfi")
  private String bicfi = null;

  @SerializedName("clearing_system_member_identification")
  private ClearingSystemMemberIdentification2 clearingSystemMemberIdentification = null;
  public FinancialInstitutionIdentification20 bicfi(String bicfi) {
    this.bicfi = bicfi;
    return this;
  }

  

  /**
  * Get bicfi
  * @return bicfi
  **/
  @Schema(description = "")
  public String getBicfi() {
    return bicfi;
  }
  public void setBicfi(String bicfi) {
    this.bicfi = bicfi;
  }
  public FinancialInstitutionIdentification20 clearingSystemMemberIdentification(ClearingSystemMemberIdentification2 clearingSystemMemberIdentification) {
    this.clearingSystemMemberIdentification = clearingSystemMemberIdentification;
    return this;
  }

  

  /**
  * Get clearingSystemMemberIdentification
  * @return clearingSystemMemberIdentification
  **/
  @Schema(description = "")
  public ClearingSystemMemberIdentification2 getClearingSystemMemberIdentification() {
    return clearingSystemMemberIdentification;
  }
  public void setClearingSystemMemberIdentification(ClearingSystemMemberIdentification2 clearingSystemMemberIdentification) {
    this.clearingSystemMemberIdentification = clearingSystemMemberIdentification;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinancialInstitutionIdentification20 financialInstitutionIdentification20 = (FinancialInstitutionIdentification20) o;
    return Objects.equals(this.bicfi, financialInstitutionIdentification20.bicfi) &&
        Objects.equals(this.clearingSystemMemberIdentification, financialInstitutionIdentification20.clearingSystemMemberIdentification);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(bicfi, clearingSystemMemberIdentification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialInstitutionIdentification20 {\n");
    
    sb.append("    bicfi: ").append(toIndentedString(bicfi)).append("\n");
    sb.append("    clearingSystemMemberIdentification: ").append(toIndentedString(clearingSystemMemberIdentification)).append("\n");
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
