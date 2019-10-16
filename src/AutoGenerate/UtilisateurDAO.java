package AutoGenerate;

import javax.ejb.Stateless;
import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;


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

    public void vente(Licorne lili, Utilisateur userCo){
        lili.setVendu(1);
        //lili.setProprietaire(-1);
        //supprimer cette licorne
        em.merge(lili);
//        em.remove(lili);
        //ajouter dans archive

        //Date d = Date.valueOf(LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        LocalDate todayLocalDate = LocalDate.now();
        java.sql.Date sqlDate = java.sql.Date.valueOf( todayLocalDate );

        Archive a = new Archive();
        a.setDate(sqlDate);
        a.setIdLicorne(lili.getIdLicorne());
        a.setIdUtilisateur(userCo.getIdUtilisateur());
        em.persist(a);
    }
}
