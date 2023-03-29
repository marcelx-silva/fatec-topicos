package br.com.fatecmogidascruzes.topicos.customer.usecase;

import br.com.fatecmogidascruzes.topicos.customer.CustomerPM;
import br.com.fatecmogidascruzes.topicos.customer.CustomerRepository;

import java.util.List;

public class ListCustomer {

    private CustomerRepository customerRepository;

    public ListCustomer(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<CustomerPM> execute() {
        return customerRepository.findAll().stream().map(CustomerPM::new).toList();
    }

}
