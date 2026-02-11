package esprit.candidat.service;


import esprit.candidat.entity.Candidat1;
import esprit.candidat.repository.CandidatRepository1;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CandidatService1 {

    private final CandidatRepository1 repository;

    public List<Candidat1> getAll() {
        return repository.findAll();
    }

    public Candidat1 getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Candidat not found"));
    }

    public Candidat1 save(Candidat1 candidat) {
        return repository.save(candidat);
    }

    public Candidat1 update(Long id, Candidat1 candidat) {
        Candidat1 existing = getById(id);
        existing.setNom(candidat.getNom());
        existing.setPrenom(candidat.getPrenom());
        existing.setEmail(candidat.getEmail());
        return repository.save(existing);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public List<Candidat1> searchByNom(String nom) {
        return repository.findByNom(nom);
    }
}
