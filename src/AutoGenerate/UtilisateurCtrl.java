package AutoGenerate;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class UtilisateurCtrl {

    private String pageNext;

    @EJB
    private UtilisateurDAO daoUser;

    public String validate(Utilisateur user){
        String login = user.getLogin();
        String mdp = user.getMdp();
        System.out.println("null" + login);
        if(daoUser.validate(login, mdp)){
            pageNext = "Bon login";
        }
        else{
            pageNext = "Pas bon login";
        }
        System.out.println(pageNext);
        return "login";
    }

    public String getPageNext() {
        return pageNext;
    }

    public void setPageNext(String pageNext) {
        this.pageNext = pageNext;
    }
}
