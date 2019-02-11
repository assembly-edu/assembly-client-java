/*
 * assembly-client-java 1.1.0
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
import java.io.Serializable;

/**
 * SchoolStatus
 */

public class SchoolStatus implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("last_changes_at")
  private String lastChangesAt = ;

  @JsonProperty("last_sync_at")
  private String lastSyncAt = ;

  @JsonProperty("last_sync_status")
  private String lastSyncStatus = ;

  public SchoolStatus lastChangesAt(String lastChangesAt) {
    this.lastChangesAt = lastChangesAt;
    return this;
  }

   /**
   * Get lastChangesAt
   * @return lastChangesAt
  **/
  @ApiModelProperty(value = "")
  public String getLastChangesAt() {
    return lastChangesAt;
  }

  public void setLastChangesAt(String lastChangesAt) {
    this.lastChangesAt = lastChangesAt;
  }

  public SchoolStatus lastSyncAt(String lastSyncAt) {
    this.lastSyncAt = lastSyncAt;
    return this;
  }

   /**
   * Get lastSyncAt
   * @return lastSyncAt
  **/
  @ApiModelProperty(value = "")
  public String getLastSyncAt() {
    return lastSyncAt;
  }

  public void setLastSyncAt(String lastSyncAt) {
    this.lastSyncAt = lastSyncAt;
  }

  public SchoolStatus lastSyncStatus(String lastSyncStatus) {
    this.lastSyncStatus = lastSyncStatus;
    return this;
  }

   /**
   * Get lastSyncStatus
   * @return lastSyncStatus
  **/
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.lastChangesAt, schoolStatus.lastChangesAt) &&
        Objects.equals(this.lastSyncAt, schoolStatus.lastSyncAt) &&
        Objects.equals(this.lastSyncStatus, schoolStatus.lastSyncStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastChangesAt, lastSyncAt, lastSyncStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchoolStatus {\n");
    
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

