package com.vegas.swaggercodegen.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SpritesDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-19T13:46:04.768737100-03:00[America/Sao_Paulo]")


public class SpritesDto   {
  @JsonProperty("back_default")
  private String backDefault = null;

  @JsonProperty("front_default")
  private String frontDefault = null;

  public SpritesDto backDefault(String backDefault) {
    this.backDefault = backDefault;
    return this;
  }

  /**
   * Get backDefault
   * @return backDefault
   **/
  @Schema(description = "")
  
    public String getBackDefault() {
    return backDefault;
  }

  public void setBackDefault(String backDefault) {
    this.backDefault = backDefault;
  }

  public SpritesDto frontDefault(String frontDefault) {
    this.frontDefault = frontDefault;
    return this;
  }

  /**
   * Get frontDefault
   * @return frontDefault
   **/
  @Schema(description = "")
  
    public String getFrontDefault() {
    return frontDefault;
  }

  public void setFrontDefault(String frontDefault) {
    this.frontDefault = frontDefault;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpritesDto spritesDto = (SpritesDto) o;
    return Objects.equals(this.backDefault, spritesDto.backDefault) &&
        Objects.equals(this.frontDefault, spritesDto.frontDefault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backDefault, frontDefault);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpritesDto {\n");
    
    sb.append("    backDefault: ").append(toIndentedString(backDefault)).append("\n");
    sb.append("    frontDefault: ").append(toIndentedString(frontDefault)).append("\n");
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
