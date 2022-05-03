package com.matrix.shopping.service;

import com.matrix.shopping.dao.entity.DetailsEntity;
import com.matrix.shopping.dao.entity.ProductEntity;
import com.matrix.shopping.dao.repository.DetailsRepository;
import com.matrix.shopping.dao.repository.ProductRepository;
//import com.matrix.shopping.mapping.ProductMapper;
import com.matrix.shopping.mapping.ProductMapper;
import com.matrix.shopping.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MainServiceImpl implements MainService {
    private ProductRepository productRepository;
    private DetailsRepository detailsRepository;

    public MainServiceImpl(ProductRepository productRepository, DetailsRepository detailsRepository) {
        this.productRepository = productRepository;
        this.detailsRepository = detailsRepository;
    }

    @Override
    public List<ProductEntity> getProducts() {
//        List<Product> productList = new ArrayList<>();
//        Product product1 = new Product("tshirt", 20,"addax");
//        Product product2 = new Product("jeans", 30,"prada");
//        productList.add(product1);
//        productList.add(product2);
        List<ProductEntity> productList = (List<ProductEntity>) productRepository.findAll();
        return productList;
    }

    public Product getProductById(int id) {
         ProductEntity productEntity= productRepository.findById(id).orElse(new ProductEntity());
//         return null;

        return ProductMapper.INSTANCE.entityToDto(productEntity);
    }

    @Override
    public void saveProduct(Product product) {

    }

    @Override
    public void edit(Product product, int id) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public ProductEntity getProductByNameAndById(String name, Integer id) {
        Optional<ProductEntity> optionalProductEntity = productRepository.selectByNameJpql(name, id);
        if (!optionalProductEntity.isPresent()) {
            throw new RuntimeException();
        }
        return optionalProductEntity.get();
    }


//    public ProductEntity getProductByName(String name) {
//        ProductEntity productEntity=productRepository.findByName(name);
//        return productEntity;
//    }
}
