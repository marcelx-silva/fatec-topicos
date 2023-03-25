package br.com.fatecmogidascruzes.topicos.product.useCase;

import br.com.fatecmogidascruzes.topicos.product.Product;
import br.com.fatecmogidascruzes.topicos.product.ProductRepository;

public class CreateProduct {
    private ProductRepository productRepository;

    public CreateProduct(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public void execute(Product product){
        productRepository.save(product);
    }
}
