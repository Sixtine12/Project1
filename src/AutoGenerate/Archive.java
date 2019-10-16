package AutoGenerate;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@IdClass(ArchivePK.class)
public class Archive {
    private int idLicorne;
    private int idUtilisateur;
    private Date date;

    @Id
    @Column(name = "IdLicorne")
    public int getIdLicorne() {
        return idLicorne;
    }

    public void setIdLicorne(int idLicorne) {
        this.idLicorne = idLicorne;
    }

    @Id
    @Column(name = "IdUtilisateur")
    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    @Basic
    @Column(name = "Date")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Archive archive = (Archive) o;
        return idLicorne == archive.idLicorne &&
                idUtilisateur == archive.idUtilisateur &&
                Objects.equals(date, archive.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idLicorne, idUtilisateur, date);
    }
}
