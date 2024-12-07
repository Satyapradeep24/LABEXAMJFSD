package com.klef.jfsd.exam.service;

import com.klef.jfsd.exam.model.Customer;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {

	public Customer saveCustomer(Customer customer); 
    public Customer updateCustomer(Long id, String name, String address) ;
}
