package codegym.vn.service;

import codegym.vn.bean.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    void addProduct(Product product);
    void createOrUpdate(Product s);
    Product findById(String id);
    void deleteById(String id);
    List<Product> searchProduct(String name);
}
