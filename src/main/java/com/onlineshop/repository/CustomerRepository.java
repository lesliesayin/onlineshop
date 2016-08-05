package com.onlineshop.repository;

import com.onlineshop.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by training on 8/4/16.
 */
@Repository
public class CustomerRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Customer> getCustomers() {
        final String SQL = "SELECT * FROM customers";
        return jdbcTemplate.query(SQL, ((rs, rowNum) -> {
            Customer customer = new Customer();
            customer.setCustomerUuid(rs.getString("customer_uuid"));
            customer.setCustomerName(rs.getString("customer_name"));
            return customer;
        }));
    }

    public Customer getCustomer(final Customer customer) {
        final String SQL = "SELECT * FROM customers WHERE customer_uuid = ?";
        return jdbcTemplate.queryForObject(SQL, new Object[]{customer.getCustomerUuid()}, (rs, rowNum) -> {
            customer.setCustomerUuid(rs.getString("customer_uuid"));
            customer.setCustomerName(rs.getString("customer_name"));
            return customer;
        });
    }

    public void createCustomer(final Customer customer) {
        final String SQL = "INSERT INTO customers(customer_uuid, customer_name) VALUES(?, ?)";
        jdbcTemplate.update(SQL, new Object[]{customer.getCustomerUuid(), customer.getCustomerName()});
    }
}
