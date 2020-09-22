/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pesquisa;

import Model.Model;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author 1513 FOX
 */
public class ModelDAOHibernate implements ModelDAO{

    private Session session;
    
    public void setSession(Session session) {
		this.session = session;
	}

    @Override
    public void salvar(Model gastos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizar(Model gastos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(Model gastos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Model carregar(Integer codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public List<Model> listar() {
        return this.session.createCriteria(Model.class).list();
    }

      
	
     @Override
    public long buscaTotalEstado(String estado) {
        String hql = "select * from model g where g.dsc_cidade = :estado";
        Query consulta = this.session.createQuery(hql);
        consulta.setString("estado", estado);
    //    JOptionPane.showConfirmDialog(null,""+consulta.list().get(0)+" "+consulta.list().get(0).getClass());
        return (long) consulta.list().get(0);
    }

    @Override
    public long buscaTotalCidade(String cidade) {
        String hql = "select * from model g where g.dsc_cidade = :cidade";
        Query consulta = this.session.createQuery(hql);
        consulta.setString("cidade", cidade);       
        return (long) consulta.list().get(0);
    }  

    @Override
    public Model buscarPorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
}
