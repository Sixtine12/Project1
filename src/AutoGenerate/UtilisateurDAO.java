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
    public boolean validate(String loginGiven, String mdpGiven){
        EntityManagerFactory f = Persistence.createEntityManagerFactory("NewPersistenceUnit");
        EntityManager em = f.createEntityManager();
        Query requete = em.createQuery("select u.login, u.mdp from Utilisateur u where u.login like :loginGiven")
                .setParameter("loginGiven", loginGiven);
        return !requete.getResultList().isEmpty();
    }
}
