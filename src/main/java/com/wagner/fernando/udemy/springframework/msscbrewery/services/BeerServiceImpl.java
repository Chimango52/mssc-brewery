package com.wagner.fernando.udemy.springframework.msscbrewery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.wagner.fernando.udemy.springframework.msscbrewery.web.model.BeerDto;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class BeerServiceImpl implements BeerService {

	@Override
	public BeerDto getBeerById(UUID beerId) {
		return BeerDto.builder().beerId(UUID.randomUUID())
				.beerName("DojaCat")
				.beerStyle("IPA")
				.build();
	}
	
	

	@Override
	public void updateBeerById(UUID beerId, BeerDto beerDto) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public BeerDto saveNewBeer(BeerDto beerDto) {
		return BeerDto.builder()
				.beerId(UUID.randomUUID())
				.build();
	}



	@Override
	public void deleteBeerById(UUID beerId) {
		log.debug("Deleting Beer by Id");
		
	}

}
