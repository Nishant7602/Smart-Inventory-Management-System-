package com.smartinventory.dao;

import java.util.List;
import com.smartinventory.entity.Product;

public interface ProductDAO {

    void saveProduct(Product product);

    void updateProduct(Product product);

    void deleteProduct(long id);

    Product getProductById(Long id);

    List<Product> getAllProducts();
long getProductCount();
long getLowStockCount();

}