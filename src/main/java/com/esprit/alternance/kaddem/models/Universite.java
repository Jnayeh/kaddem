package com.esprit.alternance.kaddem.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUniv", nullable = false)
    private Long idUnive;
    private String nomUniversite;


    @OneToMany(mappedBy = "university")
    private List<Department> departments;

}