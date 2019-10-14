package AutoGenerate;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

@Stateless
public class LicorneDao {
    public List<Licorne> findAll(){
        EntityManagerFactory f = Persistence.createEntityManagerFactory("NewPersistenceUnit");
        EntityManager em = f.createEntityManager();
        Query requete = em.createQuery("select p.idLicorne, p.nom from Licorne p");
        return requete.getResultList();
    }

    public List<Licorne> proprioLicorne(int proprio){
        EntityManagerFactory f = Persistence.createEntityManagerFactory("NewPersistenceUnit");
        EntityManager em = f.createEntityManager();
        Query requete2 = em.createQuery("select l from Licorne l where l.proprietaire = :proprio")
                .setParameter("proprio", proprio);
        return requete2.getResultList();
    }
}
