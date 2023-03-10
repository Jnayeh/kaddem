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
public class Universite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUniv", nullable = false)
    private Integer idUnive;
    private String nomUniversite;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Department> departments;

}