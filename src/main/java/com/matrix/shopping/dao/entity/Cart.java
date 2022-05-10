package com.matrix.shopping.dao.entity;

public class Cart {
    private ClothesEntity clothesEntity;
    private int quantity;
    private Cart[] carts;

    public Cart(ClothesEntity clothesEntity, int quantity) {

        this.clothesEntity = clothesEntity;
        this.quantity = quantity;
        this.carts = carts;
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

    public Cart[] getCarts() {
        return carts;
    }

    public void setCarts(Cart[] carts) {
        this.carts = carts;
    }
}
