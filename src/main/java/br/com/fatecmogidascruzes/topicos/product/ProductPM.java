package br.com.fatecmogidascruzes.topicos.product;

import java.math.BigDecimal;

public class ProductPM {
    private String id;
    private String name;
    private String description;
    private String unitPrice;
    private String quantity;
    private Boolean perishable;

    public ProductPM(Product product){
        setId(product.getId().toString());
        setName(product.getName());
        setDescription(product.getDescription());
        setUnitPrice(product.getUnitPrice().toPlainString());
        setQuantity(product.getQuantity().toString());
        setPerishable(product.getPerishable());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Boolean getPerishable() {
        return perishable;
    }

    public void setPerishable(Boolean perishable) {
        this.perishable = perishable;
    }
}