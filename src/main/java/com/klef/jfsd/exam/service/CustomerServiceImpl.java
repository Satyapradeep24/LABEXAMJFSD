package com.klef.jfsd.exam.service;

import com.klef.jfsd.exam.model.Customer;
import com.klef.jfsd.exam.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;
    
    

    public Customer updateCustomer(Long id, String name, String address) {
        Optional<Customer> optionalCustomer = customerRepository.findById(id);

        if (optionalCustomer.isPresent()) {
            Customer customer = optionalCustomer.get();
            customer.setName(name);
            customer.setAddress(address);
            return customerRepository.save(customer);
        } else {
            throw new RuntimeException("Customer not found with ID: " + id);
        }
    }



	@Override
	public Customer saveCustomer(Customer customer) {
		return customerRepository.save(customer);
		
	}
}
