package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.PokemonStats;

public interface IPokemonRepository extends JpaRepository<PokemonStats, Long> {

	@Query( value = "SELECT TOP 5 * FROM pokemon_stats ORDER BY base_experience DESC",
			nativeQuery = true)
	List<PokemonStats> getBaseExperience();

	@Query( value = "SELECT TOP 5 * FROM pokemon_stats ORDER BY height DESC",
			nativeQuery = true)
	List<PokemonStats> getHeight();

	@Query( value = "SELECT TOP 5 * FROM pokemon_stats ORDER BY weight DESC",
			nativeQuery = true)
	List<PokemonStats> getWeight();

}
