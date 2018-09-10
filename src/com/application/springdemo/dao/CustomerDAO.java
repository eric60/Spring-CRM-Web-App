package com.application.springdemo.dao;

import java.util.List;

import com.application.springdemo.entity.Customer;

public interface CustomerDAO {
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);
	 
}
