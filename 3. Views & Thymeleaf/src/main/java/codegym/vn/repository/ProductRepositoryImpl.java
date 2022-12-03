package codegym.vn.repository;
import codegym.vn.bean.Product;
import org.springframework.stereotype.Repository;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
    private static ArrayList<Product> productArrayList;

    static {
        productArrayList = new ArrayList<>();
        productArrayList.add(new Product("SP01","Máy tính",50,30000,"Sản phẩm đẹp"));
        productArrayList.add(new Product("SP01","Máy tính",50,30000,"Sản phẩm đẹp"));
        productArrayList.add(new Product("SP02","Iphone 14",50,340000,"Sản phẩm đẹp"));
        productArrayList.add(new Product("SP03","Iphone 6",5,20000,"Sản phẩm xấu nghí"));
        productArrayList.add(new Product("SP04","SamSung",500,320000,"Sản phẩm đẹp"));
        productArrayList.add(new Product("SP06","Iphone 12",508,308000,"Sản phẩm xịn"));
    }

    @Override
    public List<Product> findAll() {
        return productArrayList;
    }

    @Override
    public void addProduct(Product product) {
        productArrayList.add(product);
    }

    @Override
    public void createOrUpdate(Product s) {
        productArrayList.add(s);
    }

    @Override
    public Product findById(String id) {
        for (int i = 0; i <productArrayList.size() ; i++) {
            if (productArrayList.get(i).getId().equalsIgnoreCase(id)){
                return productArrayList.get(i);
            }
        }
        return null;
    }

    @Override
    public void deleteById(String id) {
        for (int i = 0; i <productArrayList.size(); i++) {
            if (productArrayList.get(i).getId().equalsIgnoreCase(id)){
                productArrayList.remove(productArrayList.get(i));
                break;
            }
        }
    }

    @Override
    public List<Product> searchProduct(String name) {
        List<Product> products = new ArrayList<>();
        if (name.equals("a")){
            return findAll();
        }else {
            for (int i = 0; i <productArrayList.size() ; i++) {
                if (productArrayList.get(i).getName().equalsIgnoreCase(name)){
                    products.add(productArrayList.get(i));
                }
            }
        }
        return products;
    }
}
