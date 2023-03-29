package br.com.fatecmogidascruzes.topicos.customer.usecase;

import br.com.fatecmogidascruzes.topicos.customer.Customer;
import br.com.fatecmogidascruzes.topicos.customer.CustomerRepository;

import java.util.Optional;

public class UpdateCustomer {

    private CustomerRepository customerRepository;

    public UpdateCustomer(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void execute(Customer customer) {
        Optional<Customer> opDatabaseCustomer = customerRepository.findByItin(customer.getItin());
        if(opDatabaseCustomer.isPresent()) {
            Customer databaseCustomer = opDatabaseCustomer.get();
            databaseCustomer.setName(customer.getName());
            databaseCustomer.setEmail(customer.getEmail());
            databaseCustomer.setPhone(customer.getPhone());
            customerRepository.save(databaseCustomer);
        }
    }

}
