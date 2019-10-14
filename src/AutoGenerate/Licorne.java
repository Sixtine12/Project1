package AutoGenerate;

import javax.inject.Named;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Named
@Entity
public class Licorne {
    private int idLicorne;
    private String nom;
    private String race;
    private String robe;
    private int age;
    private int sexe;
    private int vendu;
    private String photo;
    private int proprietaire;

    @Id
    @Column(name = "IdLicorne")
    public int getIdLicorne() {
        return idLicorne;
    }

    public void setIdLicorne(int idLicorne) {
        this.idLicorne = idLicorne;
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
    @Column(name = "Race")
    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    @Basic
    @Column(name = "Robe")
    public String getRobe() {
        return robe;
    }

    public void setRobe(String robe) {
        this.robe = robe;
    }

    @Basic
    @Column(name = "Age")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Basic
    @Column(name = "Sexe")
    public int getSexe() {
        return sexe;
    }

    public void setSexe(int sexe) {
        this.sexe = sexe;
    }

    @Basic
    @Column(name = "Vendu")
    public int getVendu() {
        return vendu;
    }

    public void setVendu(int vendu) {
        this.vendu = vendu;
    }

    @Basic
    @Column(name = "Photo")
    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Licorne licorne = (Licorne) o;
        return idLicorne == licorne.idLicorne &&
                age == licorne.age &&
                sexe == licorne.sexe &&
                vendu == licorne.vendu &&
                Objects.equals(nom, licorne.nom) &&
                Objects.equals(race, licorne.race) &&
                Objects.equals(robe, licorne.robe) &&
                Objects.equals(photo, licorne.photo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idLicorne, nom, race, robe, age, sexe, vendu, photo);
    }

    public int getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(int proprietaire) {
        this.proprietaire = proprietaire;
    }
}
