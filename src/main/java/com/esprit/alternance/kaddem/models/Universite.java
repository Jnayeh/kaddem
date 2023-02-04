package com.esprit.alternance.kaddem.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUniv", nullable = false)
    private Long idUnive;
private String nomUniversite;



}