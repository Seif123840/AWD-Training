package esprit.candidat.controller;


import esprit.candidat.entity.Candidat1;
import esprit.candidat.service.CandidatService1;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/candidats")
@RequiredArgsConstructor
public class CandidatController {

    private final CandidatService1 service;

    @GetMapping
    public List<Candidat1> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Candidat1 getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public Candidat1 create(@RequestBody Candidat1 candidat) {
        return service.save(candidat);
    }

    @PutMapping("/{id}")
    public Candidat1 update(@PathVariable Long id, @RequestBody Candidat1 candidat) {
        return service.update(id, candidat);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @GetMapping("/search")
    public List<Candidat1> search(@RequestParam String nom) {
        return service.searchByNom(nom);
    }
}
