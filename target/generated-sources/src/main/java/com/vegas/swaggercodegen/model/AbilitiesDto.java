package com.vegas.swaggercodegen.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vegas.swaggercodegen.model.AbilityDto;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AbilitiesDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-19T13:46:04.768737100-03:00[America/Sao_Paulo]")


public class AbilitiesDto   {
  @JsonProperty("ability")
  private AbilityDto ability = null;

  @JsonProperty("is_hidden")
  private Boolean isHidden = false;

  @JsonProperty("slot")
  private Integer slot = null;

  public AbilitiesDto ability(AbilityDto ability) {
    this.ability = ability;
    return this;
  }

  /**
   * Get ability
   * @return ability
   **/
  @Schema(description = "")
  
    @Valid
    public AbilityDto getAbility() {
    return ability;
  }

  public void setAbility(AbilityDto ability) {
    this.ability = ability;
  }

  public AbilitiesDto isHidden(Boolean isHidden) {
    this.isHidden = isHidden;
    return this;
  }

  /**
   * Get isHidden
   * @return isHidden
   **/
  @Schema(description = "")
  
    public Boolean isIsHidden() {
    return isHidden;
  }

  public void setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
  }

  public AbilitiesDto slot(Integer slot) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbilitiesDto abilitiesDto = (AbilitiesDto) o;
    return Objects.equals(this.ability, abilitiesDto.ability) &&
        Objects.equals(this.isHidden, abilitiesDto.isHidden) &&
        Objects.equals(this.slot, abilitiesDto.slot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ability, isHidden, slot);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbilitiesDto {\n");
    
    sb.append("    ability: ").append(toIndentedString(ability)).append("\n");
    sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
    sb.append("    slot: ").append(toIndentedString(slot)).append("\n");
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
