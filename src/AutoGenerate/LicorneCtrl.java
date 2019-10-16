package AutoGenerate;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class LicorneCtrl implements Serializable {
    private Licorne lili = new Licorne();

    @EJB
    private LicorneDao dao;

    public List<Licorne> tous(){
        return dao.findAll();
    }

    public List<Licorne> proprioLicorne(int proprio){
        List<Licorne> test = dao.proprioLicorne(proprio);
        System.out.println(test.get(0).getNom());
        return test;
    }

    public Licorne getLili() {
        return lili;
    }

    public void setLili(Licorne lili) {
        this.lili = lili;
    }

    public String ajout(Utilisateur userCo){
        lili.setVendu(0);
        lili.setPhoto("resources/images/charlie.jpg");
        lili.setProprietaire(userCo.getIdUtilisateur());
        dao.add(lili);
        return "listUnicorn";
    }

    public String info(Licorne liSelect){
        lili = liSelect;
        return "infoLicorne";
    }
}

