package com.java10x.CadastroDeNinjas.Missions;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_missions")
public class MissionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String dificulty;

    public MissionModel() {
    }

    public MissionModel(long id, String name, String dificulty) {
        this.id = id;
        this.name = name;
        this.dificulty = dificulty;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDificulty() {
        return dificulty;
    }

    public void setDificulty(String dificulty) {
        this.dificulty = dificulty;
    }
}
