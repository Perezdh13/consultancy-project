package com.example.CRUD.model;

import jakarta.persistence.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name = "consultation")
public class CConsultation  {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
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
