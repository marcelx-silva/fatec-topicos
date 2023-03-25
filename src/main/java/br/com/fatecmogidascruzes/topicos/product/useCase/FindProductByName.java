package br.com.fatecmogidascruzes.topicos.product.useCase;

import br.com.fatecmogidascruzes.topicos.product.Product;
import br.com.fatecmogidascruzes.topicos.product.ProductRepository;

public class FindProductByName {
    private ProductRepository productRepository;

    public FindProductByName(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public Product execute(String name){
        return productRepository.findAll()
                .stream()
                .filter(product -> product.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }
}
