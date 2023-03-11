package br.com.fatecmogidascruzes.topicos.product;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true)
    private String name;
    private String description;
    private BigDecimal unitPrice;
    private Integer quantity;
    private Boolean perishable;

    public Product(String name, String description, BigDecimal unitPrice, Integer quantity, Boolean perishable) {
        this.name = name;
        this.description = description;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.perishable = perishable;
    }

    public Product(Long id, String name, String description, BigDecimal unitPrice, Integer quantity, Boolean perishable) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.perishable = perishable;
    }

    public Product(){}

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Boolean getPerishable() {
        return perishable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id.equals(product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
