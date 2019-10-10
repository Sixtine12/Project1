package AutoGenerate;

import javax.ejb.EJB;
import javax.inject.Named;
import java.util.List;

@Named
public class LicorneCtrl {

    @EJB
    private LicorneDao dao;

    public List<Licorne> tous(){
        return dao.findAll();
    }
}

