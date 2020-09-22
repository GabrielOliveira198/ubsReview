package Controller.util;

import Sismob.SismobDAO;
import Sismob.SismobDAOHibernate;
import Pesquisa.ModelDAO;
import Pesquisa.ModelDAOHibernate;

public class DAOFactory {

    public static SismobDAO criarSismobDAO() {
        
        SismobDAOHibernate sismobDAO = new SismobDAOHibernate();
                sismobDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
                return sismobDAO;
    }
        public static ModelDAO criarModelDAO() {
       ModelDAOHibernate gastosDAO = new ModelDAOHibernate();
		gastosDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());   
		return gastosDAO;
    }

}
