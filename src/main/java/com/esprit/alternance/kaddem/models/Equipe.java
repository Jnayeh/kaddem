package com.esprit.alternance.kaddem.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Equipe implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEquipe", nullable = false)
    private Long idEquipe;

    private String nameEquipe;
    @Enumerated(EnumType.STRING)
    private Niveau niveau;

    @OneToOne
    private DetailEquipe detailEquipe;
    @ManyToMany
    private Set<Etudiant> etudiants;
}