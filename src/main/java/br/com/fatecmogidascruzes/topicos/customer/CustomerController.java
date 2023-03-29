package br.com.fatecmogidascruzes.topicos.customer;

import br.com.fatecmogidascruzes.topicos.customer.usecase.DeleteCustomer;
import br.com.fatecmogidascruzes.topicos.customer.usecase.FindCustomer;
import br.com.fatecmogidascruzes.topicos.customer.usecase.ListCustomer;
import br.com.fatecmogidascruzes.topicos.customer.usecase.UpdateCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping
    public void create(@RequestBody Customer customer) {
        customerRepository.save(customer);
    }

    @GetMapping
    public List<CustomerPM> getAll() {
        return new ListCustomer(customerRepository).execute();
    }

    @GetMapping("/{itin}")
    public Optional<CustomerPM> getByItin(@PathVariable String itin) {
       return new FindCustomer(customerRepository).execute(itin);
    }

    @DeleteMapping("/{itin}")
    public void deleteByItin(@PathVariable String itin) {
        new DeleteCustomer(customerRepository).execute(itin);
    }

    @PutMapping("/{itin}")
    public void updateByItin(@PathVariable String itin,
                             @RequestBody Customer customer) {
        new UpdateCustomer(customerRepository).execute(customer);
    }

}
