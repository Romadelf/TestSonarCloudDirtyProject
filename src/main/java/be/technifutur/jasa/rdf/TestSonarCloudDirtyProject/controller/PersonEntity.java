package be.technifutur.jasa.rdf.TestSonarCloudDirtyProject.controller;

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
    @Column(name = "firstName") String Prenom;
    String NOMFAMILLE;
    int age;
    public String getPrenom() {
        return Prenom;
    }
    public String getNOMFAMILLE() {
        return NOMFAMILLE;
    }
    public int getAge() {
        return age;
    }
    
    

}
