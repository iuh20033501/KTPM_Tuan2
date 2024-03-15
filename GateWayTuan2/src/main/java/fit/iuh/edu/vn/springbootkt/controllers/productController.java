package fit.iuh.edu.vn.springbootkt.controllers;

import fit.iuh.edu.vn.springbootkt.entities.Product;
import fit.iuh.edu.vn.springbootkt.repositories.ProductRepositories;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/product")
public class productController {
    private final ProductRepositories productRepository;

    public productController(ProductRepositories productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/")
    public Iterable<Product> getProducts() {
        return productRepository.findAll();
    }

    @PostMapping("/")
    public Product createProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }
}