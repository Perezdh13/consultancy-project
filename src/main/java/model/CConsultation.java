package model;

import jakarta.persistence.*;
import org.springframework.data.repository.CrudRepository;
@Entity
@Table(name = "consultations")
public class CConsultation  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String tittle;
    private String description;
    public CConsultation(){

    }

    public CConsultation(int id, String tittle, String description) {
        this.id = id;
        this.tittle = tittle;
        this.description = description;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
