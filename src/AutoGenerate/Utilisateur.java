package AutoGenerate;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.persistence.*;
import javax.servlet.http.HttpSession;
import java.util.Objects;

@Entity
//@Table(name="Utilisateur")
//On peut mettre ici des NamedQueries
//@NamedQueries(
//        @NamedQuery(name="Utilisateur.findAll",value="select u from Utilisateur u")
//)
//Récuperer par createdNamedQuery où on indique la classe d'où vient la NamedQuery

public class Utilisateur {
    private int idUtilisateur;
    private boolean vendeur;
    private String nom;
    private String prénom;
    private int telephone;
    private String adresse;
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
    @Column(name = "Telephone")
    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public boolean isVendeur() {
        return vendeur;
    }

    public void setVendeur(boolean vendeur) {
        this.vendeur = vendeur;
    }

    @Basic
    @Column(name = "Login")
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Basic
    @Column(name = "Mdp")
    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    @Basic
    @Column(name = "Nom")
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Basic
    @Column(name = "Prénom")
    public String getPrénom() {
        return prénom;
    }

    public void setPrénom(String prénom) {
        this.prénom = prénom;
    }

    @Basic
    @Column(name = "Adresse")
    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
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
