package com.vegas.swaggercodegen.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vegas.swaggercodegen.model.StatDto;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StatsDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-19T13:46:04.768737100-03:00[America/Sao_Paulo]")


public class StatsDto   {
  @JsonProperty("base_stat")
  private Integer baseStat = null;

  @JsonProperty("effort")
  private Integer effort = null;

  @JsonProperty("stat")
  private StatDto stat = null;

  public StatsDto baseStat(Integer baseStat) {
    this.baseStat = baseStat;
    return this;
  }

  /**
   * Get baseStat
   * @return baseStat
   **/
  @Schema(description = "")
  
    public Integer getBaseStat() {
    return baseStat;
  }

  public void setBaseStat(Integer baseStat) {
    this.baseStat = baseStat;
  }

  public StatsDto effort(Integer effort) {
    this.effort = effort;
    return this;
  }

  /**
   * Get effort
   * @return effort
   **/
  @Schema(description = "")
  
    public Integer getEffort() {
    return effort;
  }

  public void setEffort(Integer effort) {
    this.effort = effort;
  }

  public StatsDto stat(StatDto stat) {
    this.stat = stat;
    return this;
  }

  /**
   * Get stat
   * @return stat
   **/
  @Schema(description = "")
  
    @Valid
    public StatDto getStat() {
    return stat;
  }

  public void setStat(StatDto stat) {
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
    StatsDto statsDto = (StatsDto) o;
    return Objects.equals(this.baseStat, statsDto.baseStat) &&
        Objects.equals(this.effort, statsDto.effort) &&
        Objects.equals(this.stat, statsDto.stat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseStat, effort, stat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsDto {\n");
    
    sb.append("    baseStat: ").append(toIndentedString(baseStat)).append("\n");
    sb.append("    effort: ").append(toIndentedString(effort)).append("\n");
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
