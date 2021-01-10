package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.services.IPokemonService;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	IPokemonService pokemonService;

	@Test
	public void nuevoArticulo() throws Exception {

		assertThat(this.pokemonService.getHeaviestPokemon().size() == 5);
		assertThat(this.pokemonService.getHighestPokemon().size() == 5);
		assertThat(this.pokemonService.getMoreBaseExperiencePokemon().size() == 5);
		
	}

}
