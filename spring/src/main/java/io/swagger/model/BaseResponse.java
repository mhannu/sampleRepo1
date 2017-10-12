package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BaseResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-12T08:46:19.568Z")

public class BaseResponse   {
  @JsonProperty("operationName")
  private String operationName = null;

  @JsonProperty("result")
  private String result = null;

  public BaseResponse operationName(String operationName) {
    this.operationName = operationName;
    return this;
  }

   /**
   * VNF Operation Name.
   * @return operationName
  **/
  @ApiModelProperty(value = "VNF Operation Name.")
  public String getOperationName() {
    return operationName;
  }

  public void setOperationName(String operationName) {
    this.operationName = operationName;
  }

  public BaseResponse result(String result) {
    this.result = result;
    return this;
  }

   /**
   * VNF Operation result.
   * @return result
  **/
  @ApiModelProperty(value = "VNF Operation result.")
  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseResponse baseResponse = (BaseResponse) o;
    return Objects.equals(this.operationName, baseResponse.operationName) &&
        Objects.equals(this.result, baseResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationName, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseResponse {\n");
    
    sb.append("    operationName: ").append(toIndentedString(operationName)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

