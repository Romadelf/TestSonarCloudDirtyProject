package be.technifutur.jasa.rdf.testsonarclouddirtyproject.controller;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NameRepository extends JpaRepository<PersonEntity, Integer> {

}
