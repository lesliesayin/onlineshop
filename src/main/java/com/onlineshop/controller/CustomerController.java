package com.onlineshop.controller;

import com.onlineshop.domain.Customer;
import com.onlineshop.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by training on 8/4/16.
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/getCustomers", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public @ResponseBody
    List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    @RequestMapping(value = "/getCustomer", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public @ResponseBody Customer getCustomer(@RequestBody Customer customer) {
        return customerService.getCustomer(customer);
    }



}
