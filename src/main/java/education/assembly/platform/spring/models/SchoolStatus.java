/*
 * assembly-client-java 1.2.368
 *
 * Copyright (c) 2018 Assembly
 * http://assembly.education
 * help@assembly.education
 *
 * Licensed under MIT (https://spdx.org/licenses/MIT.html)
 *
 * NOTE: This class has been automatically generated, do not edit manually.
 */

package education.assembly.platform.spring.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import java.io.Serializable;

/**
 * Details the last time a school&#39;s data was synced, and when it last changed.
 */
@ApiModel(description = "Details the last time a school's data was synced, and when it last changed.")

public class SchoolStatus implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = "school_status";

  @JsonProperty("last_changes_at")
  private OffsetDateTime lastChangesAt = ;

  @JsonProperty("last_sync_at")
  private OffsetDateTime lastSyncAt = ;

  @JsonProperty("last_sync_status")
  private String lastSyncStatus = ;

  public SchoolStatus object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Descriminator
   * @return object
  **/
  @ApiModelProperty(value = "Descriminator")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public SchoolStatus lastChangesAt(OffsetDateTime lastChangesAt) {
    this.lastChangesAt = lastChangesAt;
    return this;
  }

   /**
   * When the data in the Platform was last changed, this may be recent or several days in the past as it depends  on how regularly the school update their MIS records
   * @return lastChangesAt
  **/
  @ApiModelProperty(value = "When the data in the Platform was last changed, this may be recent or several days in the past as it depends  on how regularly the school update their MIS records")
  public OffsetDateTime getLastChangesAt() {
    return lastChangesAt;
  }

  public void setLastChangesAt(OffsetDateTime lastChangesAt) {
    this.lastChangesAt = lastChangesAt;
  }

  public SchoolStatus lastSyncAt(OffsetDateTime lastSyncAt) {
    this.lastSyncAt = lastSyncAt;
    return this;
  }

   /**
   * The last time data has been collected (synced) from the source MIS, typically within the last 24 hours.
   * @return lastSyncAt
  **/
  @ApiModelProperty(value = "The last time data has been collected (synced) from the source MIS, typically within the last 24 hours.")
  public OffsetDateTime getLastSyncAt() {
    return lastSyncAt;
  }

  public void setLastSyncAt(OffsetDateTime lastSyncAt) {
    this.lastSyncAt = lastSyncAt;
  }

  public SchoolStatus lastSyncStatus(String lastSyncStatus) {
    this.lastSyncStatus = lastSyncStatus;
    return this;
  }

   /**
   * Whether the last sync was a &#x60;success&#x60;, &#x60;failure&#x60;, or that there were &#x60;no_changes&#x60;
   * @return lastSyncStatus
  **/
  @ApiModelProperty(value = "Whether the last sync was a `success`, `failure`, or that there were `no_changes`")
  public String getLastSyncStatus() {
    return lastSyncStatus;
  }

  public void setLastSyncStatus(String lastSyncStatus) {
    this.lastSyncStatus = lastSyncStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchoolStatus schoolStatus = (SchoolStatus) o;
    return Objects.equals(this.object, schoolStatus.object) &&
        Objects.equals(this.lastChangesAt, schoolStatus.lastChangesAt) &&
        Objects.equals(this.lastSyncAt, schoolStatus.lastSyncAt) &&
        Objects.equals(this.lastSyncStatus, schoolStatus.lastSyncStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, lastChangesAt, lastSyncAt, lastSyncStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchoolStatus {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    lastChangesAt: ").append(toIndentedString(lastChangesAt)).append("\n");
    sb.append("    lastSyncAt: ").append(toIndentedString(lastSyncAt)).append("\n");
    sb.append("    lastSyncStatus: ").append(toIndentedString(lastSyncStatus)).append("\n");
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

