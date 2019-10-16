package AutoGenerate;

import javax.ejb.Stateless;
import javax.persistence.*;

@Stateless
public class UtilisateurDAO {

    @PersistenceContext(unitName = "NewPersistenceUnit")
    private EntityManager em;

    public Utilisateur validate(String login, String mdp){
        Query requete = em.createQuery("select u from Utilisateur u where u.login like :loginGiven and u.mdp like :mdpGiven")
                .setParameter("loginGiven", login)
                .setParameter("mdpGiven", mdp);
        if(requete.getResultList().isEmpty()){
            return null;
        }
        else{
            return (Utilisateur) requete.getSingleResult();
        }
    }

    public void vente(Licorne lili){
        Query requete = em.createQuery("select l from Licorne l where l.idLicorne = :id")
                .setParameter("id", lili.getIdLicorne());
        Licorne l = (Licorne) requete.getSingleResult();
        //supprimer cette licorne
        //ajouter dans archive

    }
}
