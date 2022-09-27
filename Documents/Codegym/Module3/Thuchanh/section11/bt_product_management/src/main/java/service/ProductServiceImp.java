package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImp implements IProductService {

    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Xiaomi Redmi Note 9S", 5990000, "Android 10", "Xiaomi", "Xiaomi Redmi Note 9S.png"));
        products.put(2, new Product(2, "Samsung Galaxy A31", 6490000, "Android 10", "Samsung", "Samsung Galaxy A31.png"));
        products.put(3, new Product(3, "iPhone 11 64GB", 21690000, "iOS 13", "Apple", "iPhone 11 64GB.png"));
        products.put(4, new Product(4, "OPPO Reno2 F", 7490000, "Android 9.0 (Pie)", "OPPO", "OPPO Reno2 F.png"));
        products.put(5, new Product(5, "Realme 6i", 4990000, "Android 10", "Realme", "Realme 6i.png"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public Product findByName(String name) {
        List<Product> products = findAll();
        for (Product product : products) {
            if (name.equals(product.getName())) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void delete(int id) {
        products.remove(id);
    }
}
