package br.com.fatecmogidascruzes.topicos.utils.mapper;

import br.com.fatecmogidascruzes.topicos.product.ProductMapper;
import br.com.fatecmogidascruzes.topicos.product.ProductMapperInterface;

public class ServiceLocator {
    public static ProductMapperInterface productMapper(){
        return new ProductMapper();
    }
}
