package fit.iuh.edu.vn.springbootkt.repositories;

import fit.iuh.edu.vn.springbootkt.entities.Product;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface ProductRepositories extends JpaRepository<Product, String> {
}
