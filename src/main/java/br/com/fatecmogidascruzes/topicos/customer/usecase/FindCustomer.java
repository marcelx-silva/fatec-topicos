package br.com.fatecmogidascruzes.topicos.customer.usecase;

import br.com.fatecmogidascruzes.topicos.customer.Customer;
import br.com.fatecmogidascruzes.topicos.customer.CustomerRepository;

import java.util.Optional;

public class FindCustomer {

    private CustomerRepository customerRepository;

    public FindCustomer(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Optional<Customer> execute(String itin) {
        return customerRepository.findByItin(itin);
    }

}
