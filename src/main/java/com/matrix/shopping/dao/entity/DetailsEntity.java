package com.matrix.shopping.dao.entity;

import javax.persistence.*;

@Entity
@Table(name = "details")
public class ProductDetailsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String material;
    @OneToOne(mappedBy = "productDetailsEntity")
    private ProductEntity productEntity;
    public ProductDetailsEntity() {

    }

    public ProductDetailsEntity(Integer id, String material, ProductEntity productEntity) {
        this.id = id;
        this.material = material;
        this.productEntity = productEntity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public ProductEntity getProductEntity() {
        return productEntity;
    }

    public void setProductEntity(ProductEntity productEntity) {
        this.productEntity = productEntity;
    }

    @Override
    public String toString() {
        return "ProductDetailsEntity{" +
                "id=" + id +
                ", material='" + material + '\'' +
                ", productEntity=" + productEntity +
                '}';
    }
}
