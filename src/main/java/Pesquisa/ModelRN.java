/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pesquisa;



import Controller.util.DAOFactory;
import Model.Model;
import java.util.List;
import org.hibernate.Query;

/**
 *
 * @author 1513 FOX
 */
public class ModelRN {
    
 private ModelDAO gastosDAO;

	public ModelRN() {
		this.gastosDAO = DAOFactory.criarModelDAO();
	}

	public void salvar(Model gastos) {
		
			this.gastosDAO.salvar(gastos);
		
	}

	public void excluir(Model gastos) {
		this.gastosDAO.excluir(gastos);
	}

	public List<Model> listar() {
		return this.gastosDAO.listar();
	}
         
        public long buscaTotalEstado(String estado) {
        return  this.gastosDAO.buscaTotalEstado(estado);
    }

    
    public long buscaTotalCidade(String cidade) {
        return this.gastosDAO.buscaTotalCidade(cidade);
    }
    /*
     public float buscaPorId(int id) {
        return  this.gastosDAO.buscarPorId(id).getValor();
    }
*/
}



