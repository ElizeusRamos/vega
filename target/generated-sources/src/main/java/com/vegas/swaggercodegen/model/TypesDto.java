package com.vegas.swaggercodegen.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vegas.swaggercodegen.model.TypeDto;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TypesDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-19T13:46:04.768737100-03:00[America/Sao_Paulo]")


public class TypesDto   {
  @JsonProperty("slot")
  private Integer slot = null;

  @JsonProperty("stat")
  private TypeDto stat = null;

  public TypesDto slot(Integer slot) {
    this.slot = slot;
    return this;
  }

  /**
   * Get slot
   * @return slot
   **/
  @Schema(description = "")
  
    public Integer getSlot() {
    return slot;
  }

  public void setSlot(Integer slot) {
    this.slot = slot;
  }

  public TypesDto stat(TypeDto stat) {
    this.stat = stat;
    return this;
  }

  /**
   * Get stat
   * @return stat
   **/
  @Schema(description = "")
  
    @Valid
    public TypeDto getStat() {
    return stat;
  }

  public void setStat(TypeDto stat) {
    this.stat = stat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypesDto typesDto = (TypesDto) o;
    return Objects.equals(this.slot, typesDto.slot) &&
        Objects.equals(this.stat, typesDto.stat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slot, stat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypesDto {\n");
    
    sb.append("    slot: ").append(toIndentedString(slot)).append("\n");
    sb.append("    stat: ").append(toIndentedString(stat)).append("\n");
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
