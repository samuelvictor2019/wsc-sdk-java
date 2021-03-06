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
import java.time.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")
public class IndexRecordings {
  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("reason")
  private String reason = null;

  /**
   * The state of the recording.
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    UPLOADING("uploading"),
    
    CONVERTING("converting"),
    
    REMOVING("removing"),
    
    COMPLETED("completed"),
    
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

  @SerializedName("transcoder_id")
  private String transcoderId = null;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  public IndexRecordings createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time that the recording was created.
   * @return createdAt
  **/
  @ApiModelProperty(example = "", value = "The date and time that the recording was created.")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public IndexRecordings id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique alphanumeric string that identifies the recording.
   * @return id
  **/
  @ApiModelProperty(example = "", value = "The unique alphanumeric string that identifies the recording.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public IndexRecordings reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * The reason that a recording has the state &lt;strong&gt;failed&lt;/strong&gt;.
   * @return reason
  **/
  @ApiModelProperty(example = "", value = "The reason that a recording has the state <strong>failed</strong>.")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public IndexRecordings state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * The state of the recording.
   * @return state
  **/
  @ApiModelProperty(example = "", value = "The state of the recording.")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public IndexRecordings transcoderId(String transcoderId) {
    this.transcoderId = transcoderId;
    return this;
  }

   /**
   * The unique alphanumeric string that identifies the transcoder that was recorded.
   * @return transcoderId
  **/
  @ApiModelProperty(example = "", value = "The unique alphanumeric string that identifies the transcoder that was recorded.")
  public String getTranscoderId() {
    return transcoderId;
  }

  public void setTranscoderId(String transcoderId) {
    this.transcoderId = transcoderId;
  }

  public IndexRecordings updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The date and time that the recording was updated.
   * @return updatedAt
  **/
  @ApiModelProperty(example = "", value = "The date and time that the recording was updated.")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndexRecordings indexRecordings = (IndexRecordings) o;
    return Objects.equals(this.createdAt, indexRecordings.createdAt) &&
        Objects.equals(this.id, indexRecordings.id) &&
        Objects.equals(this.reason, indexRecordings.reason) &&
        Objects.equals(this.state, indexRecordings.state) &&
        Objects.equals(this.transcoderId, indexRecordings.transcoderId) &&
        Objects.equals(this.updatedAt, indexRecordings.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, id, reason, state, transcoderId, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndexRecordings {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    transcoderId: ").append(toIndentedString(transcoderId)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

