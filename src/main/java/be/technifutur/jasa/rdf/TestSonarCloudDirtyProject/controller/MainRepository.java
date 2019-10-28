package be.technifutur.jasa.rdf.testsonarclouddirtyproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MainRepository {
    
    @Autowired NameRepository nameRepo;

    public void init() {
	PersonEntity pers1 = new PersonEntity();
	PersonEntity pers2 = new PersonEntity();
	PersonEntity pers3 = new PersonEntity();
	pers1.nomDeFamille = "FREDY";
	pers1.prenom = "Coco";
	pers1.age = 52;
	nameRepo.save(pers1);
	pers2.nomDeFamille = "OUIL";
	pers2.prenom = "Pierre";
	pers2.age = 45;
	nameRepo.save(pers2);
	pers3.nomDeFamille = "DEFAVERS";
	pers3.prenom = "Piedur";
	pers3.age = 25;
	nameRepo.save(pers3);
    }

    public List<PersonEntity> getEveryOne() {
	return nameRepo.findAll();
    }

}
