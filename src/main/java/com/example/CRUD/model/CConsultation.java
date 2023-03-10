package com.example.CRUD.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CurrentTimestamp;

@Entity
@Table(name = "consultations")
public class CConsultation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String surname;
    private String title;
    private String description;
    private String date;
    private int price;

    public CConsultation() {
    }
    public CConsultation(int id, String name, String surname, String title, String description, String date, int price) {
        super ();
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.title = title;
        this.description = description;
        this.date = date;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
