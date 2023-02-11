package com.esprit.alternance.kaddem.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DetailEquipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detail_equipe", nullable = false)
    private Long idDetailEquipe;

    private String salle;
    private String thematique;

    @OneToOne (mappedBy = "detailEquipe")
    private Equipe equipe;
}