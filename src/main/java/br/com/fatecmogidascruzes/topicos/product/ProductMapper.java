package br.com.fatecmogidascruzes.topicos.product;

import br.com.fatecmogidascruzes.topicos.utils.mapper.ObjectMapper;

import java.util.Objects;

public class ProductMapper implements ProductMapperInterface {
    @Override
    public Product toObject(ProductDTO dto) {
        if (Objects.isNull(dto))
            return null;

        return new Product(dto.id(), dto.name(), dto.description(), dto.unitPrice(), dto.quantity(),dto.perishable());
    }

    @Override
    public ProductDTO toDTO(Product object) {
        if (Objects.isNull(object))
            return null;

        return new ProductDTO(object.getId(),object.getName(),object.getDescription(),object.getQuantity(),object.getUnitPrice(),object.getPerishable());
    }
}
