package com.example.CRUD.model;

import jakarta.persistence.*;

@Entity
@Table(name = "consultations")
public class CConsultation  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String title;
    private String description;
    public CConsultation(){

    }

    public CConsultation (int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
