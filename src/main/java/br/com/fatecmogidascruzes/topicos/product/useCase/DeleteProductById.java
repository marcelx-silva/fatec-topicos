package br.com.fatecmogidascruzes.topicos.product.useCase;

import br.com.fatecmogidascruzes.topicos.product.Product;
import br.com.fatecmogidascruzes.topicos.product.ProductRepository;

import java.util.Optional;

public class DeleteProductById {
    private ProductRepository productRepository;

    public DeleteProductById(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public void execute(Long id){
        Optional<Product> productOptional = productRepository.findById(id);

        productOptional.ifPresent(product -> {
            productRepository.delete(product);
        });
    }
}
