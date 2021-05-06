package com.wagner.fernando.udemy.springframework.msscbrewery.services;

import java.util.UUID;

import com.wagner.fernando.udemy.springframework.msscbrewery.web.model.BeerDto;

public interface BeerService {

	BeerDto getBeerById(UUID beerId);

}
