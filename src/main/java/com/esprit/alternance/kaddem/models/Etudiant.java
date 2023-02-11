package com.esprit.alternance.kaddem.models;

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
@Table(name = "Etudiant")
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEtudiant")
    private Integer idEtudiant;
    private String prenomE;
    private String nomE;
    @Enumerated(EnumType.STRING)
    private Option op;

    @OneToMany(mappedBy = "etudiant")
    private List<Contrat> contrats;
    @ManyToOne
    private Department department;
    @ManyToMany(mappedBy = "etudiants")
    private List<Equipe> equipes;
}