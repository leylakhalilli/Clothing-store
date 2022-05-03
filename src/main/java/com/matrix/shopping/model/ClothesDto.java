package com.matrix.shopping.model;

import com.matrix.shopping.enums.ClothesCategory;

public class ClothesDto {
    private Integer id;
    private String clothesName;
    private String clothesImg;
    private Double clothesPrice;
    private ClothesCategory clothesCategory;
    private String description;

    public ClothesDto() {

    }

    public ClothesDto(Integer id, String clothesName, String clothesImg, Double clothesPrice, ClothesCategory clothesCategory, String description) {
        this.id = id;
        this.clothesName = clothesName;
        this.clothesImg = clothesImg;
        this.clothesPrice = clothesPrice;
        this.clothesCategory = clothesCategory;
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

    public ClothesCategory getClothesCategory() {
        return ClothesCategory.valueOf(String.valueOf(clothesCategory));
    }

    public void setClothesCategory(ClothesCategory clothesCategory) {
        this.clothesCategory = clothesCategory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
