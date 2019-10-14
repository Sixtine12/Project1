package AutoGenerate;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Stateless
public class UtilisateurDAO {
    public Utilisateur validate(String login, String mdp){
        EntityManagerFactory f = Persistence.createEntityManagerFactory("NewPersistenceUnit");
        EntityManager em = f.createEntityManager();
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
}
