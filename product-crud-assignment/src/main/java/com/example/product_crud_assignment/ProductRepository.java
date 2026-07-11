package com.example.product_crud_assignment;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {

    private final List<Product> products = new ArrayList<>();

    public ProductRepository() {
        products.add(new Product("1", "Laptop", "Portable computer", 999.99, 10));
        products.add(new Product("2", "Mouse", "Wireless mouse", 29.99, 25));
    }

    public Product save(Product product) {
        products.add(product);
        return product;
    }

    public List<Product> findAll() {
        return products;
    }

    public Product findById(String id) {
        int index = getProductIndex(id);
        return index == -1 ? null : products.get(index);
    }

    public Product update(String id, Product updatedProduct) {
        int index = getProductIndex(id);

        if (index == -1) {
            return null;
        }

        Product product = products.get(index);
        product.setName(updatedProduct.getName());
        product.setDescription(updatedProduct.getDescription());
        product.setPrice(updatedProduct.getPrice());
        product.setQuantity(updatedProduct.getQuantity());
        return product;
    }

    public void delete(String id) {
        int index = getProductIndex(id);

        if (index != -1) {
            products.remove(index);
        }
    }

    private int getProductIndex(String id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
