package com.example.demo.controller;

import com.example.demo.database.ScamBase;
import com.example.demo.model.Customers;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
public class CustomersController {

    @Autowired
    private ScamBase scamBase;

    @GetMapping(value = "/customers")

    public List<Customers> getCustomers() {


        return scamBase.getCustomers();
    }


    @GetMapping(value = "/customers/{id}")

    public Customers getCustomersById(@PathVariable("id") int id) {

        return scamBase.getCustomersById(id);

    }

    @PostMapping(value = "/addcustomer")

    public Customers addCustomer(@RequestBody Customers customers) {

        return scamBase.addCustomer(customers);
    }


    @DeleteMapping(value = "/deletecustomer/{id}")
    public Customers deleteCustomer(@PathVariable("id") int id) {

        return scamBase.deleteCustomer(id);

    }




}
