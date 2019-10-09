package AutoGenerate;

import javax.ejb.EJB;
import javax.inject.Named;
import java.util.List;

@Named
public class PersonneCtrl {

    @EJB
    private PersonneDao dao;

    public List<Personne> tous(){
        return dao.findAll();
    }
}

