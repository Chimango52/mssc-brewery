package com.wagner.fernando.udemy.springframework.msscbrewery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.wagner.fernando.udemy.springframework.msscbrewery.web.model.CustomerDto;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {

	@Override
	public CustomerDto getCustomerById(UUID customerId) {
		return CustomerDto.builder().custId(UUID.randomUUID())
				.customerName("John")
				.build();
	}

	@Override
	public CustomerDto saveNewCustomer(CustomerDto customerDto) {
		return CustomerDto.builder()
				.custId(UUID.randomUUID())
				.build();
	}

	@Override
	public void updateCustomerById(UUID customerId, CustomerDto customerDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCustomerById(UUID customerId) {
		log.debug("Deleting Beer by Id");
		
	}

}
