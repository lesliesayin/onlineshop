package com.onlineshop.repository;

import com.onlineshop.domain.Customer;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by training on 8/4/16.
 */
@Repository
public class CustomerRepository {
    private JdbcTemplate jdbcTemplate;

    public List<Customer> getCustomers() {
        final String SQL = "select * from customers";
        return jdbcTemplate.query(SQL, ((rs, rowNum) -> {
            Customer customer = new Customer();
            customer.setCustomerUuid(rs.getString("customer_uuid"));
            customer.setName(rs.getString("customer_name"));
            return customer;
        }));
    }
}
