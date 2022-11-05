package com.martinachov.hexagonalV2.infra.inputport;

import java.util.List;

import com.martinachov.hexagonalV2.domain.Customer;

public interface CustomerInputPort {
    
    public Customer createCustomer(String name, String country);

    public Customer getById(String customerId);

    public List<Customer> getAll();
    
}
