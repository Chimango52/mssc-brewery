package com.wagner.fernando.udemy.springframework.msscbrewery.services;

import java.util.UUID;

import com.wagner.fernando.udemy.springframework.msscbrewery.web.model.CustomerDto;

public class CustoemrServiceImpl implements CustomerService {

	@Override
	public CustomerDto getCustomerById(UUID customerId) {
		return CustomerDto.builder().custId(UUID.randomUUID())
				.customerName("John")
				.build();
	}

}
