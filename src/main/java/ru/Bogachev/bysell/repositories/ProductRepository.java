package ru.Bogachev.bysell.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.Bogachev.bysell.models.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByTitle (String title);
}
