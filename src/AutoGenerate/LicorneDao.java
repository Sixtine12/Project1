package AutoGenerate;

import javax.ejb.Stateless;
import javax.persistence.*;
import java.util.List;

@Stateless
public class LicorneDao {

    @PersistenceContext(unitName = "NewPersistenceUnit")
    private EntityManager em;

    public List<Licorne> findAll(){
        Query requete = em.createQuery("select p from Licorne p where p.vendu= 0");
        return requete.getResultList();
    }

    public List<Licorne> proprioLicorne(int proprio){
        Query requete2 = em.createQuery("select l from Licorne l where l.proprietaire = :proprio and l.vendu=0")
                .setParameter("proprio", proprio);
        return requete2.getResultList();
    }
    public void add(Licorne lili){
        em.persist(lili);
    }

}
