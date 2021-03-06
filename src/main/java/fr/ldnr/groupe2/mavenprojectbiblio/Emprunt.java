/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ldnr.groupe2.mavenprojectbiblio;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author stag
 */
@Entity
@Table
public class Emprunt implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private int idEmprunt;
    private Date date;
    private String nomEmprunteur;
    private Livre livre ;
    private boolean estEmprunte;

    public Emprunt() {
    }

    public Emprunt(Date date, String nomEmprunteur, Livre livre) {
        this.date = date;
        this.nomEmprunteur = nomEmprunteur;
        this.livre = livre;
        this.estEmprunte = true;
    }

    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public int getIdEmprunt() {
        return idEmprunt;
    }

    public void setIdEmprunt(int idEmprunt) {
        this.idEmprunt = idEmprunt;
    }

    @Column(nullable = false)
    @Temporal(TemporalType.TIME)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Column(nullable = false)
    public String getNomEmprunteur() {
        return nomEmprunteur;
    }

    public void setNomEmprunteur(String nomEmprunteur) {
        this.nomEmprunteur = nomEmprunteur;
    }

    @Column(nullable = false)
    public Livre getLivre() {
        return livre;
    }

    public void setLivre(Livre livre) {
        this.livre = livre;
    }

    @Column(nullable = false)
    public boolean isEstEmprunte() {
        return estEmprunte;
    }

    public void setEstEmprunte(boolean estEmprunte) {
        this.estEmprunte = estEmprunte;
    }
    
    
    
    
}
