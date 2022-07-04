package com.matrix.shopping.dao.entity;

import com.matrix.shopping.enums.ClothesCategory;

import javax.persistence.*;

@Entity
@Table(name = "clothes")
public class ClothesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "clothes_name")
    private String clothesName;

    @Column(name = "clothes_img")
    private String clothesImg;

    @Column(name = "clothes_price")
    private Double clothesPrice;

    @Enumerated(EnumType.STRING)
    @Column(name = "clothes_category")
    private ClothesCategory category;

    @Column(name = "description")
    private String description;

    public ClothesEntity() {

    }

    public ClothesEntity(Integer id, String clothesName, String clothesImg, Double clothesPrice, ClothesCategory category, String description) {
        this.id = id;
        this.clothesName = clothesName;
        this.clothesImg = clothesImg;
        this.clothesPrice = clothesPrice;
        this.category = category;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClothesName() {
        return clothesName;
    }

    public void setClothesName(String clothesName) {
        this.clothesName = clothesName;
    }

    public String getClothesImg() {
        return clothesImg;
    }

    public void setClothesImg(String clothesImg) {
        this.clothesImg = clothesImg;
    }

    public Double getClothesPrice() {
        return clothesPrice;
    }

    public void setClothesPrice(Double clothesPrice) {
        this.clothesPrice = clothesPrice;
    }

    public ClothesCategory getCategory() {
        return category;
    }

    public void setCategory(ClothesCategory category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
