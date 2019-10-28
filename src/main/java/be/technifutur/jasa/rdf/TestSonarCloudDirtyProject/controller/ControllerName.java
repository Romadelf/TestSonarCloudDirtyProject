package be.technifutur.jasa.rdf.testsonarclouddirtyproject.controller;

import java.lang.System.Logger;
import java.util.List;

import org.slf4j.LoggerFactory;
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
    
    private static final org.slf4j.Logger log = LoggerFactory.getLogger(ControllerName.class);

    @GetMapping(value = "init")
    public ResponseEntity<String> init() {
	repo.init();
	return ResponseEntity.ok("intilisation succeeedded");
    }
    
    @GetMapping(value = "all", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<PersonEntity>> all() {
	List<PersonEntity> payload = repo.getEveryOne();
	int size = payload.size();
	log.debug("" + size);
	log.debug(size == 0 ? "quedal" : payload.get(size -1).nomDeFamille);
	// on a aussi log.info(...) qui est popu, puis log.warn(..), log.error(...) et aussi log.trace(...) pour les details
	return ResponseEntity.ok(payload);
    }
    
}
