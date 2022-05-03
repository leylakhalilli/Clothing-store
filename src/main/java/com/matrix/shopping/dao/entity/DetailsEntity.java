package com.matrix.shopping.dao.entity;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "details")
public class DetailsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String material;

    //    @OneToOne(mappedBy = "detailsEntity")
//    private ProductEntity productEntity;


    public DetailsEntity() {

    }

    public DetailsEntity(Integer id, String material) {
        this.id = id;
        this.material = material;
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

    @Override
    public String toString() {
        return "DetailsEntity{" +
                "id=" + id +
                ", material='" + material + '\'' +
                '}';
    }
}

