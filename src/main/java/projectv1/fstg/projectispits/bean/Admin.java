package projectv1.fstg.projectispits.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

@Entity
public class Admin {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        private String prenom;
        private String nom;
        private String cin;
        private String codeEmploye;
        @JsonFormat(pattern="dd-MM-yyyy")
        private Date dateEmbauche;
        @JsonFormat(pattern="dd-MM-yyyy")
        private Date dateNaissance;


        public Long getId() {
        return id;
    }

        public void setId(Long id) {
        this.id = id;
    }

        public String getPrenom() {
        return prenom;
    }

        public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

        public String getNom() {
        return nom;
    }

        public void setNom(String nom) {
        this.nom = nom;
    }

        public String getCin() {
        return cin;
    }

        public void setCin(String cin) {
        this.cin = cin;
    }

        public String getCodeEmploye() {
        return codeEmploye;
    }

        public void setCodeEmploye(String codeEmploye) {
        this.codeEmploye = codeEmploye;
    }

        public Date getDateEmbauche() {
        return dateEmbauche;
    }

        public void setDateEmbauche(Date dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

        public Date getDateNaissance() {
        return dateNaissance;
    }

        public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }



}
