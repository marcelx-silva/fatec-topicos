package br.com.fatecmogidascruzes.topicos.product;

import br.com.fatecmogidascruzes.topicos.product.useCase.*;
import br.com.fatecmogidascruzes.topicos.utils.mapper.ServiceLocator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;
    private final ProductMapperInterface productMapper;

    public ProductController() {
        this.productMapper = ServiceLocator.productMapper();
    }


    @PostMapping
    public void create(@RequestBody ProductDTO productDTO){
        Product product = productMapper.toObject(productDTO);
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
    public void update(@PathVariable Long id, @RequestBody ProductDTO productDTO){
        Product product = productMapper.toObject(productDTO);
        new UpdateProduct(productRepository).execute(product,id);

    }
}
