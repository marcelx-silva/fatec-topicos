package br.com.fatecmogidascruzes.topicos.product;

import br.com.fatecmogidascruzes.topicos.product.useCase.CreateProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;


    @PostMapping
    public void create(@RequestBody Product product){
        new CreateProduct(productRepository).execute(product);
    }

    @GetMapping
    public List<Product> getAll(){
        return productRepository.findAll();
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable Long id){
        return productRepository.findById(id)
                .orElse(new Product());
    }

    @GetMapping("/name")
    public Product getByName(@RequestParam String name){
        return productRepository.findAll()
                .stream()
                .filter(product -> product.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(new Product());
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        Optional<Product> productOptional = productRepository.findById(id);

        productOptional.ifPresent(product -> {
            productRepository.delete(product);
        });
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody Product product){
        Optional<Product> productOptional = productRepository.findById(id);

        productOptional.ifPresent(prod -> {
            Product productDatabase = productOptional.get();

            productRepository.save(new Product(productDatabase.getId(),
                    product.getName(),product.getDescription(),
                    product.getUnitPrice(), product.getQuantity(),
                    product.getPerishable()));
        });

    }
}
