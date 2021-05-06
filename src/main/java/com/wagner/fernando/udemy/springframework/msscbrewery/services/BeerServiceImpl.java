package com.wagner.fernando.udemy.springframework.msscbrewery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.wagner.fernando.udemy.springframework.msscbrewery.web.model.BeerDto;

@Service
public class BeerServiceImpl implements BeerService {

	@Override
	public BeerDto getBeerById(UUID beerId) {
		return BeerDto.builder().beerId(UUID.randomUUID())
				.beerName("DojaCat")
				.beerStyle("IPA")
				.build();
	}

}
