package com.wagner.fernando.udemy.springframework.msscbrewery.web.model;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
	
	private UUID beerId;
	private String beerName;
	private String beerStyle;
	private String upc;

}
