package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.PokemonStats;
import com.example.demo.services.IPokemonService;


@RestController
@RequestMapping("/")
public class Controler {

	@Autowired
	private IPokemonService pokemonService;
	
	@GetMapping(value = "/moreBaseExperience")
	public ResponseEntity<List<PokemonStats>> moreBaseExperienceList(){
		return new ResponseEntity<List<PokemonStats>>(this.pokemonService.getMoreBaseExperiencePokemon(),HttpStatus.OK);
	}
	
	@GetMapping(value = "/heaviest")
	public ResponseEntity<List<PokemonStats>> heaviest(){
		return new ResponseEntity<List<PokemonStats>>(this.pokemonService.getHeaviestPokemon(),HttpStatus.OK);
	}
	
	@GetMapping(value = "/highest")
	public ResponseEntity<List<PokemonStats>> highest(){
		return new ResponseEntity<List<PokemonStats>>(this.pokemonService.getHighestPokemon(),HttpStatus.OK);
	}
}
