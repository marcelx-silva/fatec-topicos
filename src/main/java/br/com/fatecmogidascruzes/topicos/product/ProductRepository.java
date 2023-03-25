package br.com.fatecmogidascruzes.topicos.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
