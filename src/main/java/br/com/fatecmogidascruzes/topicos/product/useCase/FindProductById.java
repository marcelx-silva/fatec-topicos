package br.com.fatecmogidascruzes.topicos.product.useCase;

import br.com.fatecmogidascruzes.topicos.product.ProductPM;
import br.com.fatecmogidascruzes.topicos.product.ProductRepository;

public class FindProductById {
    private ProductRepository productRepository;

    public FindProductById(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public ProductPM execute(Long id){
        return productRepository.findById(id).map(ProductPM::new).orElse(null);
    }
}
