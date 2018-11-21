package com.example.myproject;

import com.example.myproject.service.CustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyprojectApplicationTests {

    @Autowired
    private CustomerService customerService;

    @Test
    public void contextLoads() {
    }


    @Test
    public void testCustomer() {
        customerService.printCustomer();
        System.out.println(customerService.getCustomer());
    }
}
