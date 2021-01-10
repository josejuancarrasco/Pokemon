package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "base_experience" })
public class Stats {

	@JsonProperty("base_experience")
	private Integer base_experience;
	
	@JsonProperty("height")
	private Integer height;
	
	@JsonProperty("weight")
	private Integer weight;
	
	@JsonProperty("base_experience")
	public Integer getBase_experience() {
		return base_experience;
	}

	@JsonProperty("base_experience")
	public void setBase_experience(Integer base_experience) {
		this.base_experience = base_experience;
	}

	@JsonProperty("height")
	public Integer getHeight() {
		return height;
	}

	@JsonProperty("height")
	public void setHeight(Integer height) {
		this.height = height;
	}

	@JsonProperty("weight")
	public Integer getWeight() {
		return weight;
	}
	
	@JsonProperty("weight")
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	
	
}
