/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pesquisa;
import Model.Model;
import java.util.List;

/**
 *
 * @author 1513 FOX
 */
public interface ModelDAO {
        public void salvar(Model gastos);

	public void atualizar(Model gastos);

	public void excluir(Model gastos);

	public Model carregar(Integer codigo);

	public Model buscarPorId(Integer id);

	public List<Model> listar(); 
        
        public long buscaTotalEstado(String estado);
        
        public long buscaTotalCidade(String cidade);
}
