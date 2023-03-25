package br.com.fatecmogidascruzes.topicos.product.useCase;

import br.com.fatecmogidascruzes.topicos.product.Product;
import br.com.fatecmogidascruzes.topicos.product.ProductRepository;

import java.util.Optional;

public class UpdateProduct {
    private ProductRepository productRepository;

    public UpdateProduct(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public void execute(Product product, Long id){
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
