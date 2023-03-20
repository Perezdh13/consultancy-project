package com.example.CRUD.model;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.lang.String;

@Entity
@Table(name = "consultation")
public class CConsultation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Column(name = "stack")
    private String stack;
    private String title;
    private String description;
    private LocalDate date;

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
    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }

    public void setDate(LocalDate date) {
        this.date = date;
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

    public LocalDate getDate() {
        return date;
    }

    @PrePersist
    public void setDate() {
        this.date = LocalDate.now();
    }



    public CConsultation() {
        this.id = id;
        this.name = name;
        this.stack = stack;
        this.title = title;
        this.description = description;
        this.date = date;
    }
}







