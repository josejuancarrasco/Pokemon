package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.PokemonStats;
import com.example.demo.repository.IPokemonRepository;


@Service
public class PokemonService implements IPokemonService{
	
	@Autowired
	private IPokemonRepository pokemonRepository;
	
	@Override
	public void addPokemonStats(PokemonStats pokemonStats) {
		this.pokemonRepository.save(pokemonStats);	
	}

	@Override
	public List<PokemonStats> getMoreBaseExperiencePokemon() {
		return this.pokemonRepository.getBaseExperience();
	}

	@Override
	public List<PokemonStats> getHeaviestPokemon() {
		return this.pokemonRepository.getWeight();
	}

	@Override
	public List<PokemonStats> getHighestPokemon() {
		return this.pokemonRepository.getHeight();
	}



}
