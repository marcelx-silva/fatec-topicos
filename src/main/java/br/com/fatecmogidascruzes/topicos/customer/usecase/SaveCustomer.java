package br.com.fatecmogidascruzes.topicos.customer.usecase;

import br.com.fatecmogidascruzes.topicos.customer.Customer;
import br.com.fatecmogidascruzes.topicos.customer.CustomerRepository;

public class SaveCustomer {

    private CustomerRepository customerRepository;

    public SaveCustomer(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void execute(Customer customer) {
        customerRepository.save(customer);
    }

}
