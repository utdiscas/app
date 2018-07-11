package com.quejboard.app.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Swiezak {
    @Id
    @GeneratedValue
    private int id;

    private String swiezakNaDzis;

    public Swiezak(String swiezakNaDzis) {
        this.swiezakNaDzis = swiezakNaDzis;
    }
    public String getSwiezakNaDzis() {
        return swiezakNaDzis;
    }

    public void setSwiezakNaDzis(String swiezakNaDzis) {
        this.swiezakNaDzis = swiezakNaDzis;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private Swiezak() {
    }

    @Override
    public String toString() {
        return "Swiezak{" +
                "id=" + id +
                ", swiezakNaDzis='" + swiezakNaDzis + '\'' +
                '}';
    }
}
