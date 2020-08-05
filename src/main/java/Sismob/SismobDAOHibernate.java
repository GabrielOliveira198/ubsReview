/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sismob;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
/**
 *
 * @author olive
 */
public class SismobDAOHibernate implements SismobDAO{

    private Session session;
    
    public void setSession(Session session) {
		this.session = session;
	}

        @Override
	public void salvar(Sismob sismob) {
   		this.session.save(sismob);
               
	}

        @Override
	public void atualizar(Sismob sismob) {
		this.session.update(sismob);
	}

        @Override
	public void excluir(Sismob sismob) {
		this.session.delete(sismob);
	}

        @Override
	public Sismob carregar(Integer id) {
		return (Sismob) this.session.get(Sismob.class, id);
	}

        @Override
	public List<Sismob> listar() {
		return this.session.createCriteria(Sismob.class).list();
	}

    @Override
    public Sismob buscarPorCoor(float lat, float lng) {
        String hql = "select u from Sismob u where u.VlrLatitude = :VlrLatitude and u.VlrLongitude = :VlrLongitude";
		Query consulta = this.session.createQuery(hql);
		consulta.setFloat("VlrLatitude", lat);
                consulta.setFloat("VlrLongitude", lng);
		return (Sismob) consulta.uniqueResult();
    }
}