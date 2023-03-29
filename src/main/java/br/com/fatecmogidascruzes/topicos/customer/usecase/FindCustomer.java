package br.com.fatecmogidascruzes.topicos.customer.usecase;

import br.com.fatecmogidascruzes.topicos.customer.CustomerPM;
import br.com.fatecmogidascruzes.topicos.customer.CustomerRepository;

import java.util.Optional;

public class FindCustomer {

    private CustomerRepository customerRepository;

    public FindCustomer(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Optional<CustomerPM> execute(String itin) {
        return customerRepository.findByItin(itin).map(CustomerPM::new);
    }

}
