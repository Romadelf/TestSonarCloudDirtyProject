package be.technifutur.jasa.rdf.testsonarclouddirtyproject.controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class PersonEntity {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Integer id;
    @Column(name = "firstName") String prenom;
    String nomDeFamille;
    int age;
    public String getPrenom() {
        return prenom;
    }
    public String getNOMFAMILLE() {
        return nomDeFamille;
    }
    public int getAge() {
        return age;
    }
    
    

}
