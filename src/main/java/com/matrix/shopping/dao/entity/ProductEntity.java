package com.matrix.shopping.dao.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "products", schema = "public")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private Integer price;
    @Column(name = "description")
    private String description;

    //    @OneToOne
//    @JoinColumn(name = "details_id")
//    private DetailsEntity detailsEntity;
//
    @ManyToMany
    @JoinTable(
            name = "product_details",
            joinColumns = {@JoinColumn(name = "products_id")},
            inverseJoinColumns = {@JoinColumn(name = "details_id")}

    )
    private List<DetailsEntity> details;
    public List<DetailsEntity> getDetails(){
        return details;

    }
    public ProductEntity() {

    }

    public ProductEntity(Integer id, String name, Integer price, String description, List<DetailsEntity> details) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.details = details;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDetails(List<DetailsEntity> details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "ProductEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", details=" + details +
                '}';
    }
}
