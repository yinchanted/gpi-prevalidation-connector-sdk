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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;

/**
 * StatusCodeConnector
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-06-19T14:52:07.265298-04:00[America/New_York]")public class StatusCodeConnector {
  /**
   * Gets or Sets severity
   */
  @JsonAdapter(SeverityEnum.Adapter.class)
  public enum SeverityEnum {
    FATAL("Fatal"),
    TRANSIENT("Transient");

    private String value;

    SeverityEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SeverityEnum fromValue(String text) {
      for (SeverityEnum b : SeverityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SeverityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SeverityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SeverityEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SeverityEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("severity")
  private SeverityEnum severity = null;
  /**
   * Gets or Sets code
   */
  @JsonAdapter(CodeEnum.Adapter.class)
  public enum CodeEnum {
    SWAP001("SwAP001"),
    SWAP002("SwAP002"),
    SWAP003("SwAP003"),
    SWAP005("SwAP005"),
    SWAP006("SwAP006"),
    SWAP007("SwAP007"),
    SWAP008("SwAP008"),
    SWAP010("SwAP010"),
    SWAP009("SwAP009"),
    SWAP011("SwAP011"),
    SWAP099("SwAP099"),
    SWAP090("SwAP090"),
    SWAP501("SwAP501"),
    SWAP504("SwAP504"),
    SWAP506("SwAP506"),
    SWAP507("SwAP507"),
    SWAP521("SwAP521"),
    SWAP522("SwAP522"),
    SWAP590("SwAP590"),
    SWAP591("SwAP591"),
    SWAPPROXY001("SwAPProxy001"),
    SWAPPROXY002("SwAPProxy002"),
    SWAPPROXY003("SwAPProxy003"),
    SWAPPROXY004("SwAPProxy004"),
    SWAPPROXY005("SwAPProxy005"),
    SWAPPROXY006("SwAPProxy006"),
    SWAPPROXY007("SwAPProxy007"),
    SWAPPROXY008("SwAPProxy008"),
    CANT("CANT"),
    UNAV("UNAV"),
    INVALIDREQUEST("InvalidRequest"),
    MANDATORYFIELDMISSING("MandatoryFieldMissing"),
    MYINSTITUTIONAUTHORIZATIONFAILURE("MyInstitutionAuthorizationFailure"),
    FROMAUTHORIZATIONFAILURE("FromAuthorizationFailure"),
    NORESULTFOUND("NoResultFound"),
    UNKNOWNTRANSACTION("UnknownTransaction"),
    INVALIDRBACROLE("InvalidRBACRole"),
    INTERNALERROR("InternalError");

    private String value;

    CodeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static CodeEnum fromValue(String text) {
      for (CodeEnum b : CodeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<CodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CodeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CodeEnum.fromValue(String.valueOf(value));
      }
    }
  }
  @SerializedName("code")
  private CodeEnum code = null;

  @SerializedName("text")
  private String text = null;
  public StatusCodeConnector severity(SeverityEnum severity) {
    this.severity = severity;
    return this;
  }

  

  /**
  * Get severity
  * @return severity
  **/
  @Schema(required = true, description = "")
  public SeverityEnum getSeverity() {
    return severity;
  }
  public void setSeverity(SeverityEnum severity) {
    this.severity = severity;
  }
  public StatusCodeConnector code(CodeEnum code) {
    this.code = code;
    return this;
  }

  

  /**
  * Get code
  * @return code
  **/
  @Schema(required = true, description = "")
  public CodeEnum getCode() {
    return code;
  }
  public void setCode(CodeEnum code) {
    this.code = code;
  }
  public StatusCodeConnector text(String text) {
    this.text = text;
    return this;
  }

  

  /**
  * Get text
  * @return text
  **/
  @Schema(required = true, description = "")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusCodeConnector statusCodeConnector = (StatusCodeConnector) o;
    return Objects.equals(this.severity, statusCodeConnector.severity) &&
        Objects.equals(this.code, statusCodeConnector.code) &&
        Objects.equals(this.text, statusCodeConnector.text);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(severity, code, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusCodeConnector {\n");
    
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
