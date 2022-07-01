package com.matrix.shopping.dao.entity;

import javax.persistence.*;

@Entity
@Table(name="about")
public class AboutEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "title")
    private String title;
    @Column(name="text")
    private String text;

    public AboutEntity(Integer id, String title, String text) {
        this.id = id;
        this.title = title;
        this.text = text;
    }
    public AboutEntity() {

    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
