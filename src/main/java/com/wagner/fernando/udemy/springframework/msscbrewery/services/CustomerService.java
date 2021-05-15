package com.wagner.fernando.udemy.springframework.msscbrewery.services;

import java.util.UUID;

import com.wagner.fernando.udemy.springframework.msscbrewery.web.model.CustomerDto;

public interface CustomerService {

	CustomerDto getCustomerById(UUID customerId);

	CustomerDto saveNewCustomer(CustomerDto customerDto);

	void updateCustomerById(UUID customerId, CustomerDto customerDto);

	void deleteCustomerById(UUID customerId);

}
