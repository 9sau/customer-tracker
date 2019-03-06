package com.saurabh.springdemo.dao;

import java.util.List;

import com.saurabh.springdemo.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomerList();

	public void saveCustomer(Customer customer);
}
