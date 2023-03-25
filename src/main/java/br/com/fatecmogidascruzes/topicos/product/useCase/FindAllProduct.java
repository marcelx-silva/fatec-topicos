package br.com.fatecmogidascruzes.topicos.product.useCase;

import br.com.fatecmogidascruzes.topicos.product.ProductPM;
import br.com.fatecmogidascruzes.topicos.product.ProductRepository;

import java.util.List;

public class FindAllProduct {
    private ProductRepository productRepository;

    public FindAllProduct(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public List<ProductPM> execute(){
        return productRepository.findAll()
                .stream()
                .map(ProductPM::new)
                .toList();
    }


}
