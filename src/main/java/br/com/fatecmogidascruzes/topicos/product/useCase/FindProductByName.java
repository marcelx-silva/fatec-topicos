package br.com.fatecmogidascruzes.topicos.product.useCase;

import br.com.fatecmogidascruzes.topicos.product.ProductPM;
import br.com.fatecmogidascruzes.topicos.product.ProductRepository;

public class FindProductByName {
    private ProductRepository productRepository;

    public FindProductByName(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public ProductPM execute(String name){
        return productRepository.findAll()
                .stream()
                .filter(product -> product.getName().equalsIgnoreCase(name))
                .findFirst()
                .map(ProductPM::new)
                .orElse(null);
    }
}
