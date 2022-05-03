package com.matrix.shopping.service;

import com.matrix.shopping.dao.entity.DetailsEntity;
import com.matrix.shopping.dao.entity.ProductEntity;
import com.matrix.shopping.model.Product;

import java.util.List;

public interface MainService {
    List<ProductEntity> getProducts();

    //List<Product> getProducts();
    Product getProductById(int id);

    void saveProduct(Product product);

    void edit(Product product, int id);

    void delete(int id);

    //    ProductEntity getProductByName(String name);
    ProductEntity getProductByNameAndById(String name, Integer id);

}
