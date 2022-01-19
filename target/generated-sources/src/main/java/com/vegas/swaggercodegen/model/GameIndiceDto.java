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
 * GameIndiceDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-19T13:46:04.768737100-03:00[America/Sao_Paulo]")


public class GameIndiceDto   {
  @JsonProperty("game_index")
  private Integer gameIndex = null;

  @JsonProperty("version")
  private VersionDto version = null;

  public GameIndiceDto gameIndex(Integer gameIndex) {
    this.gameIndex = gameIndex;
    return this;
  }

  /**
   * Get gameIndex
   * @return gameIndex
   **/
  @Schema(description = "")
  
    public Integer getGameIndex() {
    return gameIndex;
  }

  public void setGameIndex(Integer gameIndex) {
    this.gameIndex = gameIndex;
  }

  public GameIndiceDto version(VersionDto version) {
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
    GameIndiceDto gameIndiceDto = (GameIndiceDto) o;
    return Objects.equals(this.gameIndex, gameIndiceDto.gameIndex) &&
        Objects.equals(this.version, gameIndiceDto.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gameIndex, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameIndiceDto {\n");
    
    sb.append("    gameIndex: ").append(toIndentedString(gameIndex)).append("\n");
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
