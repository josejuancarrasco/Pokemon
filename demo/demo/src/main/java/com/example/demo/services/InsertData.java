package com.example.demo.services;

import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.DemoApplication;
import com.example.demo.entity.PokemonStats;
import com.example.demo.model.Pokemon;
import com.example.demo.model.PokemonSpecy;
import com.example.demo.model.Stats;

@Service
public class InsertData {

	private static Logger LOG = LoggerFactory.getLogger(DemoApplication.class);

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	IPokemonService pokemonService;

	@PostConstruct
	void insertIntoDataBase() {

		String uriList = "https://pokeapi.co/api/v2/pokemon-color/red";
		String uriStats = "https://pokeapi.co/api/v2/pokemon/";

		ResponseEntity<Pokemon> responsePokemon;
		ResponseEntity<Stats> responseStats;
		Pokemon pokemon = null;
		Stats stats = null;
		PokemonStats pokemonStats;

		try {
			responsePokemon = restTemplate.getForEntity(uriList, Pokemon.class);
			pokemon = responsePokemon.getBody();

			List<PokemonSpecy> pokeList = pokemon.getPokemonSpecies();

			for (PokemonSpecy name : pokeList) {

				try {
					responseStats = restTemplate.getForEntity(uriStats + name.getName(), Stats.class);
					stats = responseStats.getBody();

					LOG.info(name.getName());
					LOG.info(stats.getBase_experience().toString());

					pokemonStats = new PokemonStats(name.getName(), stats.getBase_experience(), stats.getHeight(),
							stats.getWeight());
					this.pokemonService.addPokemonStats(pokemonStats);

				} catch (Exception e) {
					LOG.info(e.getMessage());
				}

			}

		} catch (Exception ex) {
			LOG.info(ex.getMessage());
		}

	}
}
