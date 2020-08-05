package Controller.util;

import Sismob.SismobDAO;
import Sismob.SismobDAOHibernate;

public class DAOFactory {

    public static SismobDAO criarSismobDAO() {
        
        SismobDAOHibernate sismobDAO = new SismobDAOHibernate();
                sismobDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
                return sismobDAO;
    }

}
