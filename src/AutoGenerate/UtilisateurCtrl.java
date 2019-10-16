package AutoGenerate;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class UtilisateurCtrl implements Serializable {

    private String pageNext;
    private Utilisateur userCo = new Utilisateur();

    @EJB
    private UtilisateurDAO daoUser;

    public String getPageNext() {
        return pageNext;
    }

    public void setPageNext(String pageNext) {
        this.pageNext = pageNext;
    }

    public Utilisateur getUserCo() {
        return userCo;
    }

    public void setUserCo(Utilisateur userCo) {
        this.userCo = userCo;
    }

    public String validate(){
        String login = userCo.getLogin();
        String mdp = userCo.getMdp();
        if(daoUser.validate(login, mdp) != null){
            userCo = daoUser.validate(login, mdp);
            return "listUnicorn";
        }
        else{
            return "index";
        }
    }

    public String deconnexion(){
        this.userCo= new Utilisateur();
        pageNext = "Vous êtes bien déconnecté";
        return "index";
    }

    public String isVendeur(){
        if(userCo.isVendeur()){
            return "Vendeur session";
        }
        else{
            return "Acheteur session";
        }
    }

    public void vendu(Licorne lili){
        daoUser.vente(lili);
    }
}
