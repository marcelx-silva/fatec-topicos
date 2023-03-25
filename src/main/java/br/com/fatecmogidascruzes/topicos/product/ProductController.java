package br.com.fatecmogidascruzes.topicos.product;

import br.com.fatecmogidascruzes.topicos.product.useCase.*;
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
    public List<ProductPM> getAll(){
        return new FindAllProduct(productRepository).execute();
    }

    @GetMapping("/{id}")
    public ProductPM getById(@PathVariable Long id){
        return new FindProductById(productRepository).execute(id);
    }

    @GetMapping("/name")
    public ProductPM getByName(@RequestParam String name){
        return new FindProductByName(productRepository).execute(name);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        new DeleteProductById(productRepository).execute(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody Product product){
        new UpdateProduct(productRepository).execute(product,id);

    }
}
