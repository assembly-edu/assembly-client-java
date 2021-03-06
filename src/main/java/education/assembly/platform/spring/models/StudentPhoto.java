/*
 * assembly-client-java 1.2.475
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
 * The student&#39;s photo
 */
@ApiModel(description = "The student's photo")

public class StudentPhoto implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("object")
  private String object = "photo";

  @JsonProperty("url")
  private String url = ;

  @JsonProperty("hash")
  private String hash = ;

  public StudentPhoto object(String object) {
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

  public StudentPhoto url(String url) {
    this.url = url;
    return this;
  }

   /**
   * A URL for downloading the photo, expires after one hour
   * @return url
  **/
  @ApiModelProperty(value = "A URL for downloading the photo, expires after one hour")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public StudentPhoto hash(String hash) {
    this.hash = hash;
    return this;
  }

   /**
   * An indication of photo change between syncs, it is not necessarily a checksum of the photo
   * @return hash
  **/
  @ApiModelProperty(value = "An indication of photo change between syncs, it is not necessarily a checksum of the photo")
  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudentPhoto studentPhoto = (StudentPhoto) o;
    return Objects.equals(this.object, studentPhoto.object) &&
        Objects.equals(this.url, studentPhoto.url) &&
        Objects.equals(this.hash, studentPhoto.hash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, url, hash);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentPhoto {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
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

