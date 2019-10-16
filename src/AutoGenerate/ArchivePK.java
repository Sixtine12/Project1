package AutoGenerate;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class ArchivePK implements Serializable {
    private int idLicorne;
    private int idUtilisateur;

    @Column(name = "IdLicorne")
    @Id
    public int getIdLicorne() {
        return idLicorne;
    }

    public void setIdLicorne(int idLicorne) {
        this.idLicorne = idLicorne;
    }

    @Column(name = "IdUtilisateur")
    @Id
    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArchivePK archivePK = (ArchivePK) o;
        return idLicorne == archivePK.idLicorne &&
                idUtilisateur == archivePK.idUtilisateur;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idLicorne, idUtilisateur);
    }
}
