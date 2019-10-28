package be.technifutur.jasa.rdf.TestSonarCloudDirtyProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping(value = "name")
public class ControllerName {
    
    @Autowired MainRepository repo;

    @GetMapping(value = "init")
    ResponseEntity<String> init() {
	repo.init();
	return ResponseEntity.ok("intilisation succeeedded");
    }
    
    @GetMapping(value = "all", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<List<PersonEntity>> all() {
	List<PersonEntity> payload = repo.getEveryOne();
	int size = payload.size();
	System.out.println(size);
	System.out.println(size == 0 ? "quedal" : payload.get(size -1).NOMFAMILLE);
	return ResponseEntity.ok(payload);
    }
    
}
