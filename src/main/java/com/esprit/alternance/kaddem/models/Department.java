package com.esprit.alternance.kaddem.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDepartment", nullable = false)
    private Integer idDepartment;

    private String nameDepartment;

    @OneToMany(mappedBy = "department")
    //@JsonBackReference
    private List<Etudiant> etudiants;
    //@ManyToOne
    //@JsonIgnore
    //private Universite university;
}