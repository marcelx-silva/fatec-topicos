package br.com.fatecmogidascruzes.topicos.product.useCase;

import br.com.fatecmogidascruzes.topicos.product.Product;
import br.com.fatecmogidascruzes.topicos.product.ProductRepository;

import java.util.List;

public class FindAllProduct {
    private ProductRepository productRepository;

    public FindAllProduct(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public List<Product> execute(){
        return productRepository.findAll();
    }


}
