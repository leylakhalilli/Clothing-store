package com.matrix.shopping.dao.entity;

public class Cart {
    private ClothesEntity clothesEntity;
    private int quantity;
    private Cart[] carts;

    public Cart(ClothesEntity clothesEntity, int quantity) {
        this.clothesEntity = clothesEntity;
        this.quantity = quantity;
    }

    public ClothesEntity getClothesEntity() {
        return clothesEntity;
    }

    public void setClothesEntity(ClothesEntity clothesEntity) {
        this.clothesEntity = clothesEntity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
