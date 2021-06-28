/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ldnr.groupe2.mavenprojectbiblio;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author stag
 */
@SpringBootApplication
public class BiblioMain {
    
    public static final Logger logger = LoggerFactory.getLogger(BiblioMain.class);
      
    public static void main(String[] args) {
        SpringApplication.run(BiblioMain.class, args);
	logger.info("Lancement de l'application Biblio !!!");
    }
    
}
