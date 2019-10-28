package be.technifutur.jasa.rdf.TestSonarCloudDirtyProject.controller;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NameRepository extends JpaRepository<PersonEntity, Integer> {

}
