package br.com.fatecmogidascruzes.topicos.product.useCase;

import br.com.fatecmogidascruzes.topicos.product.Product;
import br.com.fatecmogidascruzes.topicos.product.ProductRepository;

import java.util.Optional;

public class FindProductById {
    private ProductRepository productRepository;

    public FindProductById(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public Product execute(Long id){
        return productRepository.findById(id).orElse(null);
    }
}
