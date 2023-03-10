package com.example.CRUD.model;

import jakarta.persistence.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name = "consultation")
public class CConsultation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    private String surname;
    private String title;
    private String description;
    public CConsultation() {
    }

    public CConsultation(int id, String name, String surname, String title, String description) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.title = title;
        this.description = description;
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

    private String user;
    private String title;
    private String description;
    /*private String getDateTime(){
        DateFormat dateFormat = new SimpleDateFormat("yy/MM/dd HH:mm:ss");
        Date date = new Date();
        return  dateFormat.format(date);
    }*/
    public CConsultation(){

    }

    public CConsultation (int id, String user, String title, String description) {
        this.id = id;
        this.user = user;
        this.title = title;
        this.description = description;

    }

}
