package com.example.myproject.service;

import com.example.myproject.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private Customer customer;

    public void printCustomer() {
        System.out.println(customer.getName());
    }

    public Customer getCustomer(){
        return customer;
    }
}
