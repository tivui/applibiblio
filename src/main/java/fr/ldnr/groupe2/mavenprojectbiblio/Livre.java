/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ldnr.groupe2.mavenprojectbiblio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author stag
 */

@Entity 
@Table
public class Livre implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private int idLivre;
    private String annee;
    private String titre;
    private String nomAuteur ;
    private String prenomAuteur;
    private String editeur;

    public Livre() {
    }

    public Livre(String annee, String titre, String nomAuteur, String prenomAuteur, String editeur) {
        this.annee = annee;
        this.titre = titre;
        this.nomAuteur = nomAuteur;
        this.prenomAuteur = prenomAuteur;
        this.editeur = editeur;
    }

    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public int getIdLivre() {
        return idLivre;
    }

    public void setIdLivre(int idLivre) {
        this.idLivre = idLivre;
    }

    @Column(nullable = false)
    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    @Column(nullable = false)
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    @Column(nullable = false)
    public String getNomAuteur() {
        return nomAuteur;
    }

    public void setNomAuteur(String nomAuteur) {
        this.nomAuteur = nomAuteur;
    }

    @Column(nullable = false)
    public String getPrenomAuteur() {
        return prenomAuteur;
    }

    public void setPrenomAuteur(String prenomAuteur) {
        this.prenomAuteur = prenomAuteur;
    }

    @Column(nullable = false)
    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }
    
    
}
