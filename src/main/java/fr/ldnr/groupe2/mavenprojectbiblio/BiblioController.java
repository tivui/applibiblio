/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ldnr.groupe2.mavenprojectbiblio;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author stag
 */
@RestController
public class BiblioController {

    public static final Logger logger = LoggerFactory.getLogger(BiblioController.class);

    //branchement automatique à la session Hibernate
    @Autowired
    public SessionFactory sessionFactory;

    //Contrôleur qui relie la page html emprunt.html avec l'url /emprunt
    @Controller
    public class HtmlPageController {

        @GetMapping("/emprunt")
        public String getTestPage() {
            return "emprunt.html";
        }
    }

}
