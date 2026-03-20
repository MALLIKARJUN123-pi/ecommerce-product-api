package com.rock.ecommerceProductAPI.service;


import com.rock.ecommerceProductAPI.entity.Product;
import com.rock.ecommerceProductAPI.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    public List<Product> getProductsByCategory(String category) {
        return productRepository.findByProductCategory(category);
    }

    public Product updateProduct(Long id, Product updated) {
        Product existing = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found: " + id));
        existing.setProductName(updated.getProductName());
        existing.setProductCategory(updated.getProductCategory());
        existing.setProductPrice(updated.getProductPrice());
        existing.setProductStock(updated.getProductStock());
        existing.setProductDescription(updated.getProductDescription());
        return productRepository.save(existing);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
