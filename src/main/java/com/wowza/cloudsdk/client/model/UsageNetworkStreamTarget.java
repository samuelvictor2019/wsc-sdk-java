/*
 * This code and all components © 2015 - 2019 Wowza Media Systems, LLC. All rights reserved.
 * This code is licensed pursuant to the BSD 3-Clause License.
 * 
 * Wowza Streaming Cloud REST API Reference Documentation
 *
 * OpenAPI spec version: v1.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.wowza.cloudsdk.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.wowza.cloudsdk.client.model.HashOfProtocols;
import java.io.IOException;

/**
 * 
 */
@ApiModel(description = "")
public class UsageNetworkStreamTarget {
  @SerializedName("bytes_billed")
  private Integer bytesBilled = null;

  @SerializedName("bytes_used")
  private Integer bytesUsed = null;

  @SerializedName("deleted")
  private Boolean deleted = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("protocols")
  private HashOfProtocols protocols = null;

  public UsageNetworkStreamTarget bytesBilled(Integer bytesBilled) {
    this.bytesBilled = bytesBilled;
    return this;
  }

   /**
   * The amount of usage, in bytes, that was billed for the stream target during the selected time frame.
   * @return bytesBilled
  **/
  @ApiModelProperty(example = "", value = "The amount of usage, in bytes, that was billed for the stream target during the selected time frame.")
  public Integer getBytesBilled() {
    return bytesBilled;
  }

  public void setBytesBilled(Integer bytesBilled) {
    this.bytesBilled = bytesBilled;
  }

  public UsageNetworkStreamTarget bytesUsed(Integer bytesUsed) {
    this.bytesUsed = bytesUsed;
    return this;
  }

   /**
   * The amount of content, in bytes, that went through the stream target during the selected time frame.
   * @return bytesUsed
  **/
  @ApiModelProperty(example = "", value = "The amount of content, in bytes, that went through the stream target during the selected time frame.")
  public Integer getBytesUsed() {
    return bytesUsed;
  }

  public void setBytesUsed(Integer bytesUsed) {
    this.bytesUsed = bytesUsed;
  }

  public UsageNetworkStreamTarget deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * A value of &lt;strong&gt;true&lt;/strong&gt; indicates that the stream target has been removed from Wowza Streaming Cloud.
   * @return deleted
  **/
  @ApiModelProperty(value = "A value of <strong>true</strong> indicates that the stream target has been removed from Wowza Streaming Cloud.")
  public Boolean isDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  public UsageNetworkStreamTarget id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique alphanumeric string that identifies the stream target.
   * @return id
  **/
  @ApiModelProperty(example = "", value = "The unique alphanumeric string that identifies the stream target.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UsageNetworkStreamTarget name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A descriptive name for the stream target.
   * @return name
  **/
  @ApiModelProperty(example = "", value = "A descriptive name for the stream target.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UsageNetworkStreamTarget protocols(HashOfProtocols protocols) {
    this.protocols = protocols;
    return this;
  }

   /**
   * Get protocols
   * @return protocols
  **/
  @ApiModelProperty(value = "")
  public HashOfProtocols getProtocols() {
    return protocols;
  }

  public void setProtocols(HashOfProtocols protocols) {
    this.protocols = protocols;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageNetworkStreamTarget usageNetworkStreamTarget = (UsageNetworkStreamTarget) o;
    return Objects.equals(this.bytesBilled, usageNetworkStreamTarget.bytesBilled) &&
        Objects.equals(this.bytesUsed, usageNetworkStreamTarget.bytesUsed) &&
        Objects.equals(this.deleted, usageNetworkStreamTarget.deleted) &&
        Objects.equals(this.id, usageNetworkStreamTarget.id) &&
        Objects.equals(this.name, usageNetworkStreamTarget.name) &&
        Objects.equals(this.protocols, usageNetworkStreamTarget.protocols);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bytesBilled, bytesUsed, deleted, id, name, protocols);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageNetworkStreamTarget {\n");
    
    sb.append("    bytesBilled: ").append(toIndentedString(bytesBilled)).append("\n");
    sb.append("    bytesUsed: ").append(toIndentedString(bytesUsed)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    protocols: ").append(toIndentedString(protocols)).append("\n");
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

