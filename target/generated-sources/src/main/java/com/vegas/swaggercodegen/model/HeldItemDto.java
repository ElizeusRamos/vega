package com.vegas.swaggercodegen.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vegas.swaggercodegen.model.ItemDto;
import com.vegas.swaggercodegen.model.VersionDetailsDto;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HeldItemDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-19T13:46:04.768737100-03:00[America/Sao_Paulo]")


public class HeldItemDto   {
  @JsonProperty("item")
  private ItemDto item = null;

  @JsonProperty("version_details")
  @Valid
  private List<VersionDetailsDto> versionDetails = null;

  public HeldItemDto item(ItemDto item) {
    this.item = item;
    return this;
  }

  /**
   * Get item
   * @return item
   **/
  @Schema(description = "")
  
    @Valid
    public ItemDto getItem() {
    return item;
  }

  public void setItem(ItemDto item) {
    this.item = item;
  }

  public HeldItemDto versionDetails(List<VersionDetailsDto> versionDetails) {
    this.versionDetails = versionDetails;
    return this;
  }

  public HeldItemDto addVersionDetailsItem(VersionDetailsDto versionDetailsItem) {
    if (this.versionDetails == null) {
      this.versionDetails = new ArrayList<VersionDetailsDto>();
    }
    this.versionDetails.add(versionDetailsItem);
    return this;
  }

  /**
   * Get versionDetails
   * @return versionDetails
   **/
  @Schema(description = "")
      @Valid
    public List<VersionDetailsDto> getVersionDetails() {
    return versionDetails;
  }

  public void setVersionDetails(List<VersionDetailsDto> versionDetails) {
    this.versionDetails = versionDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeldItemDto heldItemDto = (HeldItemDto) o;
    return Objects.equals(this.item, heldItemDto.item) &&
        Objects.equals(this.versionDetails, heldItemDto.versionDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(item, versionDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeldItemDto {\n");
    
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    versionDetails: ").append(toIndentedString(versionDetails)).append("\n");
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
