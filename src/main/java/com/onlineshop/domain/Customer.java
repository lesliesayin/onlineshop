package com.onlineshop.domain;

/**
 * Created by training on 8/4/16.
 */
public class Customer {
    private String customerUuid;
    private String customerName;

    public String getCustomerUuid() {
        return customerUuid;
    }

    public void setCustomerUuid(String customerUuid) {
        this.customerUuid = customerUuid;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerUuid='" + customerUuid + '\'' +
                ", customerName='" + customerName + '\'' +
                '}';
    }
}
