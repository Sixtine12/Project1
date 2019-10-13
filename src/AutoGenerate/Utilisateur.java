package AutoGenerate;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.servlet.http.HttpSession;
import java.util.Objects;

@Entity
@Named
@RequestScoped
public class Utilisateur {
    private int idUtilisateur;
    private boolean vendeur;
    private int nom;
    private int prénom;
    private int telephone;
    private int adresse;
    private String login;
    private String mdp;

    @Id
    @Column(name = "IdUtilisateur")
    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    @Basic
    @Column(name = "Nom")
    public int getNom() {
        return nom;
    }

    public void setNom(int nom) {
        this.nom = nom;
    }

    @Basic
    @Column(name = "Prénom")
    public int getPrénom() {
        return prénom;
    }

    public void setPrénom(int prénom) {
        this.prénom = prénom;
    }

    @Basic
    @Column(name = "Telephone")
    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    @Basic
    @Column(name = "Adresse")
    public int getAdresse() {
        return adresse;
    }

    public void setAdresse(int adresse) {
        this.adresse = adresse;
    }

    public boolean isVendeur() {
        return vendeur;
    }

    public void setVendeur(boolean vendeur) {
        this.vendeur = vendeur;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Utilisateur that = (Utilisateur) o;
        return idUtilisateur == that.idUtilisateur &&
                vendeur == that.vendeur &&
                nom == that.nom &&
                prénom == that.prénom &&
                telephone == that.telephone &&
                adresse == that.adresse;
    }


    @Override
    public int hashCode() {
        return Objects.hash(idUtilisateur, vendeur, nom, prénom, telephone, adresse);
    }
}
