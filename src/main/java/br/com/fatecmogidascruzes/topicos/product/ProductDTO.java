package br.com.fatecmogidascruzes.topicos.product;

import java.math.BigDecimal;

public record ProductDTO(Long id, String name, String description, Integer quantity, BigDecimal unitPrice, Boolean perishable) {
}
