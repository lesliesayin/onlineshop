package com.onlineshop.domain;

/**
 * Created by training on 8/4/16.
 */
public class Customer {
    private String customerUuid;
    private String name;

    public String getCustomerUuid() {
        return customerUuid;
    }

    public void setCustomerUuid(String customerUuid) {
        this.customerUuid = customerUuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerUuid='" + customerUuid + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
