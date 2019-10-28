package be.technifutur.jasa.rdf.testsonarclouddirtyproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@Controller
public class ControllerTest {

    @GetMapping(value = "test", produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> test() {
	return ResponseEntity.ok("Ca marche");
    }
    
}
