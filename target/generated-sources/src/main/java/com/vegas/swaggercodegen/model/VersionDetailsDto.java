package com.vegas.swaggercodegen.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vegas.swaggercodegen.model.VersionDto;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VersionDetailsDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-19T13:46:04.768737100-03:00[America/Sao_Paulo]")


public class VersionDetailsDto   {
  @JsonProperty("rarity")
  private Integer rarity = null;

  @JsonProperty("version")
  private VersionDto version = null;

  public VersionDetailsDto rarity(Integer rarity) {
    this.rarity = rarity;
    return this;
  }

  /**
   * Get rarity
   * @return rarity
   **/
  @Schema(description = "")
  
    public Integer getRarity() {
    return rarity;
  }

  public void setRarity(Integer rarity) {
    this.rarity = rarity;
  }

  public VersionDetailsDto version(VersionDto version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   **/
  @Schema(description = "")
  
    @Valid
    public VersionDto getVersion() {
    return version;
  }

  public void setVersion(VersionDto version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionDetailsDto versionDetailsDto = (VersionDetailsDto) o;
    return Objects.equals(this.rarity, versionDetailsDto.rarity) &&
        Objects.equals(this.version, versionDetailsDto.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rarity, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionDetailsDto {\n");
    
    sb.append("    rarity: ").append(toIndentedString(rarity)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
