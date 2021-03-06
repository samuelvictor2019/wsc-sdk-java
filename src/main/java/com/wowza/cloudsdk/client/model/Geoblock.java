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
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")
public class Geoblock {
  @SerializedName("countries")
  private List<String> countries = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  /**
   * The state of the geo-blocking.
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    REQUESTED("requested"),
    
    ACTIVATED("activated"),
    
    UPDATE_REQUESTED("update_requested"),
    
    DELETE_REQUESTED("delete_requested"),
    
    FAILED("failed");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  @SerializedName("stream_target_id")
  private String streamTargetId = null;

  /**
   * The type of geo-blocking to apply. The value &lt;strong&gt;allow&lt;/strong&gt; permits viewing only in the locations specified by the &lt;em&gt;countries&lt;/em&gt; parameter. The value &lt;strong&gt;deny&lt;/strong&gt; prohibits viewing in the locations specified by the &lt;em&gt;countries&lt;/em&gt; parameter. The value &lt;strong&gt;disabled&lt;/strong&gt; (the default) permits viewing everywhere.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    DISABLED("disabled"),
    
    ALLOW("allow"),
    
    DENY("deny");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  @SerializedName("whitelist")
  private List<String> whitelist = null;

  public Geoblock countries(List<String> countries) {
    this.countries = countries;
    return this;
  }

  public Geoblock addCountriesItem(String countriesItem) {
    if (this.countries == null) {
      this.countries = new ArrayList<String>();
    }
    this.countries.add(countriesItem);
    return this;
  }

   /**
   * Required when &lt;em&gt;type&lt;/em&gt; is &lt;strong&gt;allow&lt;/strong&gt; or &lt;strong&gt;deny&lt;/strong&gt;. The locations affected by the geo-blocking. Enter a comma-separated list (an array) of two-letter ISO 3166-1 country codes. For a list, see &lt;a href&#x3D;&#39;https://en.wikipedia.org/wiki/ISO_3166-1&#39; target&#x3D;&#39;_blank&#39;&gt;ISO 3166-1&lt;/a&gt; on wikipedia.
   * @return countries
  **/
  @ApiModelProperty(example = "\"\"", value = "Required when <em>type</em> is <strong>allow</strong> or <strong>deny</strong>. The locations affected by the geo-blocking. Enter a comma-separated list (an array) of two-letter ISO 3166-1 country codes. For a list, see <a href='https://en.wikipedia.org/wiki/ISO_3166-1' target='_blank'>ISO 3166-1</a> on wikipedia.")
  public List<String> getCountries() {
    return countries;
  }

  public void setCountries(List<String> countries) {
    this.countries = countries;
  }

  public Geoblock createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time that the geo-blocking rendition was created.
   * @return createdAt
  **/
  @ApiModelProperty(example = "", value = "The date and time that the geo-blocking rendition was created.")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Geoblock state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * The state of the geo-blocking.
   * @return state
  **/
  @ApiModelProperty(example = "", value = "The state of the geo-blocking.")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public Geoblock streamTargetId(String streamTargetId) {
    this.streamTargetId = streamTargetId;
    return this;
  }

   /**
   * The unique alphanumeric string that identifies the stream target.
   * @return streamTargetId
  **/
  @ApiModelProperty(example = "", value = "The unique alphanumeric string that identifies the stream target.")
  public String getStreamTargetId() {
    return streamTargetId;
  }

  public void setStreamTargetId(String streamTargetId) {
    this.streamTargetId = streamTargetId;
  }

  public Geoblock type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of geo-blocking to apply. The value &lt;strong&gt;allow&lt;/strong&gt; permits viewing only in the locations specified by the &lt;em&gt;countries&lt;/em&gt; parameter. The value &lt;strong&gt;deny&lt;/strong&gt; prohibits viewing in the locations specified by the &lt;em&gt;countries&lt;/em&gt; parameter. The value &lt;strong&gt;disabled&lt;/strong&gt; (the default) permits viewing everywhere.
   * @return type
  **/
  @ApiModelProperty(example = "", value = "The type of geo-blocking to apply. The value <strong>allow</strong> permits viewing only in the locations specified by the <em>countries</em> parameter. The value <strong>deny</strong> prohibits viewing in the locations specified by the <em>countries</em> parameter. The value <strong>disabled</strong> (the default) permits viewing everywhere.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Geoblock updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The date and time that the geo-blocking rendition was updated.
   * @return updatedAt
  **/
  @ApiModelProperty(example = "", value = "The date and time that the geo-blocking rendition was updated.")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Geoblock whitelist(List<String> whitelist) {
    this.whitelist = whitelist;
    return this;
  }

  public Geoblock addWhitelistItem(String whitelistItem) {
    if (this.whitelist == null) {
      this.whitelist = new ArrayList<String>();
    }
    this.whitelist.add(whitelistItem);
    return this;
  }

   /**
   * Whitelisted addresses can be viewed even if they&#39;re within a geo-blocked location. Enter a comma-separated list (an array) of IP addresses that always allow streaming.
   * @return whitelist
  **/
  @ApiModelProperty(example = "\"\"", value = "Whitelisted addresses can be viewed even if they're within a geo-blocked location. Enter a comma-separated list (an array) of IP addresses that always allow streaming.")
  public List<String> getWhitelist() {
    return whitelist;
  }

  public void setWhitelist(List<String> whitelist) {
    this.whitelist = whitelist;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Geoblock geoblock = (Geoblock) o;
    return Objects.equals(this.countries, geoblock.countries) &&
        Objects.equals(this.createdAt, geoblock.createdAt) &&
        Objects.equals(this.state, geoblock.state) &&
        Objects.equals(this.streamTargetId, geoblock.streamTargetId) &&
        Objects.equals(this.type, geoblock.type) &&
        Objects.equals(this.updatedAt, geoblock.updatedAt) &&
        Objects.equals(this.whitelist, geoblock.whitelist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countries, createdAt, state, streamTargetId, type, updatedAt, whitelist);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Geoblock {\n");
    
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    streamTargetId: ").append(toIndentedString(streamTargetId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    whitelist: ").append(toIndentedString(whitelist)).append("\n");
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

