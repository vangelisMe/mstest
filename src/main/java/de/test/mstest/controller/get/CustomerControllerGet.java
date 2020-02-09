package de.test.mstest.controller.get;

import de.test.mstest.domain.Customer;
import de.test.mstest.exception.ApiRequestException;
import de.test.mstest.exception.ExError;
import de.test.mstest.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@RestController
public class CustomerControllerGet {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/customers/{id}")
    public Customer getCustomer(@PathVariable Integer id) {
        String hello = "Customer ID: " + id;

        if (id < 2) {
            throw new ApiRequestException(ExError.TOO_BIG_NUMBER);
        }

        Customer customer = customerRepository.getOne(id);
        if (customer.getFirstname() == null) {
            throw new EntityNotFoundException("Cannot find Customer with ID: " + id);
        }
//        try {
//            customer = customerRepository.getOne(id);
//            if (customer.getFirstname() == null || customer.getId() == null) {
//                throw new EntityNotFoundException("Connector template: " + id);
//            }
//
//            System.out.println("Melisses");
//        } catch (EntityNotFoundException e) {
//            throw new ApiRequestException("Not Found " + e.getMessage());
//        }

        return customer;
    }


    @GetMapping("/customers")
    public List<Customer> getAllCustomers() {
        String hello = "Customer Customers";
        List<Customer> customers = customerRepository.findAll();
        if (customers.size() < 5) {
            throw new ApiRequestException(ExError.TOO_BIG_NUMBER);
        }
        System.out.println("--- LENGTH: " + customers.size());
        return customerRepository.findAll();
    }
}
