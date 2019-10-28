package be.technifutur.jasa.rdf.TestSonarCloudDirtyProject.controller;

import org.springframework.stereotype.Component;

@Component
public class MainRepository {
    
    NameRepository nameRepo;

    public void init() {
	// TODO Auto-generated method stub
	PersonEntity pers1 = new PersonEntity();
	PersonEntity pers2 = new PersonEntity();
	PersonEntity pers3 = new PersonEntity();
	pers1.NOMFAMILLE = "FREDY";
	pers1.Prenom = "Coco";
	pers1.age = 52;
	nameRepo.save(pers1);
	pers2.NOMFAMILLE = "OUIL";
	pers2.Prenom = "Pierre";
	pers2.age = 45;
	nameRepo.save(pers2);
	pers3.NOMFAMILLE = "DEFAVERS";
	pers3.Prenom = "Piedur";
	pers3.age = 25;
	nameRepo.save(pers3);
    }

}
