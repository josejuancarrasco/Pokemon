package com.example.demo.services;

import java.util.List;

import com.example.demo.entity.PokemonStats;

public interface IPokemonService {
	void addPokemonStats(PokemonStats pokemonStats);

	List<PokemonStats> getMoreBaseExperiencePokemon();

	List<PokemonStats> getHeaviestPokemon();

	List<PokemonStats> getHighestPokemon();
}
