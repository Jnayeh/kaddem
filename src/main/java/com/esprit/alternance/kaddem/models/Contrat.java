package com.esprit.alternance.kaddem.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Contrat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contract", nullable = false)
    private Long idContract;

  @Temporal(TemporalType.DATE)
    private Date dateDebut;
    @Temporal(TemporalType.DATE)
    private Date dateFin;
    @Enumerated(EnumType.STRING)
    private Specialite specialite;
    private Boolean archive;
    private Integer montantContrat;
    @ManyToOne
    private Etudiant etudiant;
}