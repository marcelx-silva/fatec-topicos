package br.com.fatecmogidascruzes.topicos.customer.usecase;

import br.com.fatecmogidascruzes.topicos.customer.Customer;
import br.com.fatecmogidascruzes.topicos.customer.CustomerRepository;

import java.util.Optional;

public class DeleteCustomer {

    private CustomerRepository customerRepository;

    public DeleteCustomer(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void execute(String itin) {
        Optional<Customer> customer = customerRepository.findByItin(itin);
        customer.ifPresent(value -> customerRepository.delete(value));
    }

}
