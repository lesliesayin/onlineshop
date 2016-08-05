package com.onlineshop.service;

import com.onlineshop.domain.Customer;
import com.onlineshop.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Created by training on 8/4/16.
 */
@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getCustomers() {
        return customerRepository.getCustomers();
    }

    public Customer getCustomer(final Customer customer) {
        return customerRepository.getCustomer(customer);
    }

    public void createCustomer(final Customer customer) {
        customer.setCustomerUuid(UUID.randomUUID().toString());
        customerRepository.createCustomer(customer);
    }
}
