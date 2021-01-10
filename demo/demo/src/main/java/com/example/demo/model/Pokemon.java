
package com.example.demo.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "name", "names", "pokemon_species" })
public class Pokemon {

	@JsonProperty("id")
	private Integer id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("names")
	private List<Name> names = null;
	@JsonProperty("pokemon_species")
	private List<PokemonSpecy> pokemonSpecies = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(Integer id) {
		this.id = id;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("names")
	public List<Name> getNames() {
		return names;
	}

	@JsonProperty("names")
	public void setNames(List<Name> names) {
		this.names = names;
	}

	@JsonProperty("pokemon_species")
	public List<PokemonSpecy> getPokemonSpecies() {
		return pokemonSpecies;
	}

	@JsonProperty("pokemon_species")
	public void setPokemonSpecies(List<PokemonSpecy> pokemonSpecies) {
		this.pokemonSpecies = pokemonSpecies;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
