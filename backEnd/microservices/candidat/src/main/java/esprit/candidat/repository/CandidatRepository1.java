package esprit.candidat.repository;

import esprit.candidat.entity.Candidat1;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CandidatRepository1 extends JpaRepository<Candidat1, Long> {

    List<Candidat1> findByNom(String nom);
}