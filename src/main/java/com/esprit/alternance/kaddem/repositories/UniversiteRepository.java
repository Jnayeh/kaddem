package com.esprit.alternance.kaddem.repositories;

import com.esprit.alternance.kaddem.models.Universite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversiteRepository extends JpaRepository<Universite, Integer> {
/*    @Query("select e from Entreprise e, Equipe eq where e.id=eq.entreprise.id and eq.specialite = :spec ")
    List<Universite> getEntreprisesByEquipe(@Param("spec") String s);

    @Query("select p from Projjet p, ProjetDetail pd where p.id=pd.projet.id and pd.technologie = :tech and pd.cout_provisoire> :cout ")
    List<Universite> getProjetsByCoutSup(@Param("cout") Long c,@Param("tech") String t);

    @Query("select p from Projjet p, ProjetDetail pd where p.id=pd.projet.id and pd.technologie = :tech and pd.cout_provisoire> :cout ")
    List<Universite> getProjetsByEquipe(@Param("cout") Long c,@Param("tech") String t);*/
}
