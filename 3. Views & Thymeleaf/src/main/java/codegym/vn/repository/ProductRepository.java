package codegym.vn.repository;

import codegym.vn.bean.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> findAll();
    void addProduct(Product product);
    void createOrUpdate(Product s);
    Product findById(String id);
    void deleteById(String id);
    List<Product> searchProduct(String name);
}
