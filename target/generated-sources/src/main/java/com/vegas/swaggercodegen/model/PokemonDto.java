package com.vegas.swaggercodegen.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vegas.swaggercodegen.model.AbilitiesDto;
import com.vegas.swaggercodegen.model.FormsDto;
import com.vegas.swaggercodegen.model.GameIndiceDto;
import com.vegas.swaggercodegen.model.HeldItemDto;
import com.vegas.swaggercodegen.model.MoveDto;
import com.vegas.swaggercodegen.model.SpeciesDto;
import com.vegas.swaggercodegen.model.SpritesDto;
import com.vegas.swaggercodegen.model.StatsDto;
import com.vegas.swaggercodegen.model.TypesDto;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PokemonDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-19T15:53:04.101028600-03:00[America/Sao_Paulo]")


public class PokemonDto   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("id_default")
  private Boolean idDefault = false;

  @JsonProperty("order")
  private Integer order = null;

  @JsonProperty("location_area_encounters")
  private String locationAreaEncounters = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("weight")
  private Integer weight = null;

  @JsonProperty("base_experience")
  private Integer baseExperience = null;

  @JsonProperty("species")
  private SpeciesDto species = null;

  @JsonProperty("sprites")
  private SpritesDto sprites = null;

  @JsonProperty("abilities")
  @Valid
  private List<AbilitiesDto> abilities = null;

  @JsonProperty("forms")
  @Valid
  private List<FormsDto> forms = null;

  @JsonProperty("game_indices")
  @Valid
  private List<GameIndiceDto> gameIndices = null;

  @JsonProperty("held_items")
  @Valid
  private List<HeldItemDto> heldItems = null;

  @JsonProperty("moves")
  @Valid
  private List<MoveDto> moves = null;

  @JsonProperty("stats")
  @Valid
  private List<StatsDto> stats = null;

  @JsonProperty("types")
  @Valid
  private List<TypesDto> types = null;

  public PokemonDto id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(description = "")
  
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public PokemonDto idDefault(Boolean idDefault) {
    this.idDefault = idDefault;
    return this;
  }

  /**
   * Get idDefault
   * @return idDefault
   **/
  @Schema(description = "")
  
    public Boolean isIdDefault() {
    return idDefault;
  }

  public void setIdDefault(Boolean idDefault) {
    this.idDefault = idDefault;
  }

  public PokemonDto order(Integer order) {
    this.order = order;
    return this;
  }

  /**
   * Get order
   * @return order
   **/
  @Schema(description = "")
  
    public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public PokemonDto locationAreaEncounters(String locationAreaEncounters) {
    this.locationAreaEncounters = locationAreaEncounters;
    return this;
  }

  /**
   * Get locationAreaEncounters
   * @return locationAreaEncounters
   **/
  @Schema(description = "")
  
    public String getLocationAreaEncounters() {
    return locationAreaEncounters;
  }

  public void setLocationAreaEncounters(String locationAreaEncounters) {
    this.locationAreaEncounters = locationAreaEncounters;
  }

  public PokemonDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(description = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PokemonDto weight(Integer weight) {
    this.weight = weight;
    return this;
  }

  /**
   * Get weight
   * @return weight
   **/
  @Schema(description = "")
  
    public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  public PokemonDto baseExperience(Integer baseExperience) {
    this.baseExperience = baseExperience;
    return this;
  }

  /**
   * Get baseExperience
   * @return baseExperience
   **/
  @Schema(description = "")
  
    public Integer getBaseExperience() {
    return baseExperience;
  }

  public void setBaseExperience(Integer baseExperience) {
    this.baseExperience = baseExperience;
  }

  public PokemonDto species(SpeciesDto species) {
    this.species = species;
    return this;
  }

  /**
   * Get species
   * @return species
   **/
  @Schema(description = "")
  
    @Valid
    public SpeciesDto getSpecies() {
    return species;
  }

  public void setSpecies(SpeciesDto species) {
    this.species = species;
  }

  public PokemonDto sprites(SpritesDto sprites) {
    this.sprites = sprites;
    return this;
  }

  /**
   * Get sprites
   * @return sprites
   **/
  @Schema(description = "")
  
    @Valid
    public SpritesDto getSprites() {
    return sprites;
  }

  public void setSprites(SpritesDto sprites) {
    this.sprites = sprites;
  }

  public PokemonDto abilities(List<AbilitiesDto> abilities) {
    this.abilities = abilities;
    return this;
  }

  public PokemonDto addAbilitiesItem(AbilitiesDto abilitiesItem) {
    if (this.abilities == null) {
      this.abilities = new ArrayList<AbilitiesDto>();
    }
    this.abilities.add(abilitiesItem);
    return this;
  }

  /**
   * Get abilities
   * @return abilities
   **/
  @Schema(description = "")
      @Valid
    public List<AbilitiesDto> getAbilities() {
    return abilities;
  }

  public void setAbilities(List<AbilitiesDto> abilities) {
    this.abilities = abilities;
  }

  public PokemonDto forms(List<FormsDto> forms) {
    this.forms = forms;
    return this;
  }

  public PokemonDto addFormsItem(FormsDto formsItem) {
    if (this.forms == null) {
      this.forms = new ArrayList<FormsDto>();
    }
    this.forms.add(formsItem);
    return this;
  }

  /**
   * Get forms
   * @return forms
   **/
  @Schema(description = "")
      @Valid
    public List<FormsDto> getForms() {
    return forms;
  }

  public void setForms(List<FormsDto> forms) {
    this.forms = forms;
  }

  public PokemonDto gameIndices(List<GameIndiceDto> gameIndices) {
    this.gameIndices = gameIndices;
    return this;
  }

  public PokemonDto addGameIndicesItem(GameIndiceDto gameIndicesItem) {
    if (this.gameIndices == null) {
      this.gameIndices = new ArrayList<GameIndiceDto>();
    }
    this.gameIndices.add(gameIndicesItem);
    return this;
  }

  /**
   * Get gameIndices
   * @return gameIndices
   **/
  @Schema(description = "")
      @Valid
    public List<GameIndiceDto> getGameIndices() {
    return gameIndices;
  }

  public void setGameIndices(List<GameIndiceDto> gameIndices) {
    this.gameIndices = gameIndices;
  }

  public PokemonDto heldItems(List<HeldItemDto> heldItems) {
    this.heldItems = heldItems;
    return this;
  }

  public PokemonDto addHeldItemsItem(HeldItemDto heldItemsItem) {
    if (this.heldItems == null) {
      this.heldItems = new ArrayList<HeldItemDto>();
    }
    this.heldItems.add(heldItemsItem);
    return this;
  }

  /**
   * Get heldItems
   * @return heldItems
   **/
  @Schema(description = "")
      @Valid
    public List<HeldItemDto> getHeldItems() {
    return heldItems;
  }

  public void setHeldItems(List<HeldItemDto> heldItems) {
    this.heldItems = heldItems;
  }

  public PokemonDto moves(List<MoveDto> moves) {
    this.moves = moves;
    return this;
  }

  public PokemonDto addMovesItem(MoveDto movesItem) {
    if (this.moves == null) {
      this.moves = new ArrayList<MoveDto>();
    }
    this.moves.add(movesItem);
    return this;
  }

  /**
   * Get moves
   * @return moves
   **/
  @Schema(description = "")
      @Valid
    public List<MoveDto> getMoves() {
    return moves;
  }

  public void setMoves(List<MoveDto> moves) {
    this.moves = moves;
  }

  public PokemonDto stats(List<StatsDto> stats) {
    this.stats = stats;
    return this;
  }

  public PokemonDto addStatsItem(StatsDto statsItem) {
    if (this.stats == null) {
      this.stats = new ArrayList<StatsDto>();
    }
    this.stats.add(statsItem);
    return this;
  }

  /**
   * Get stats
   * @return stats
   **/
  @Schema(description = "")
      @Valid
    public List<StatsDto> getStats() {
    return stats;
  }

  public void setStats(List<StatsDto> stats) {
    this.stats = stats;
  }

  public PokemonDto types(List<TypesDto> types) {
    this.types = types;
    return this;
  }

  public PokemonDto addTypesItem(TypesDto typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<TypesDto>();
    }
    this.types.add(typesItem);
    return this;
  }

  /**
   * Get types
   * @return types
   **/
  @Schema(description = "")
      @Valid
    public List<TypesDto> getTypes() {
    return types;
  }

  public void setTypes(List<TypesDto> types) {
    this.types = types;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PokemonDto pokemonDto = (PokemonDto) o;
    return Objects.equals(this.id, pokemonDto.id) &&
        Objects.equals(this.idDefault, pokemonDto.idDefault) &&
        Objects.equals(this.order, pokemonDto.order) &&
        Objects.equals(this.locationAreaEncounters, pokemonDto.locationAreaEncounters) &&
        Objects.equals(this.name, pokemonDto.name) &&
        Objects.equals(this.weight, pokemonDto.weight) &&
        Objects.equals(this.baseExperience, pokemonDto.baseExperience) &&
        Objects.equals(this.species, pokemonDto.species) &&
        Objects.equals(this.sprites, pokemonDto.sprites) &&
        Objects.equals(this.abilities, pokemonDto.abilities) &&
        Objects.equals(this.forms, pokemonDto.forms) &&
        Objects.equals(this.gameIndices, pokemonDto.gameIndices) &&
        Objects.equals(this.heldItems, pokemonDto.heldItems) &&
        Objects.equals(this.moves, pokemonDto.moves) &&
        Objects.equals(this.stats, pokemonDto.stats) &&
        Objects.equals(this.types, pokemonDto.types);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idDefault, order, locationAreaEncounters, name, weight, baseExperience, species, sprites, abilities, forms, gameIndices, heldItems, moves, stats, types);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PokemonDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idDefault: ").append(toIndentedString(idDefault)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    locationAreaEncounters: ").append(toIndentedString(locationAreaEncounters)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    baseExperience: ").append(toIndentedString(baseExperience)).append("\n");
    sb.append("    species: ").append(toIndentedString(species)).append("\n");
    sb.append("    sprites: ").append(toIndentedString(sprites)).append("\n");
    sb.append("    abilities: ").append(toIndentedString(abilities)).append("\n");
    sb.append("    forms: ").append(toIndentedString(forms)).append("\n");
    sb.append("    gameIndices: ").append(toIndentedString(gameIndices)).append("\n");
    sb.append("    heldItems: ").append(toIndentedString(heldItems)).append("\n");
    sb.append("    moves: ").append(toIndentedString(moves)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
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
