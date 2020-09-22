/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagedBeans;

import Model.Model;
import Pesquisa.ModelRN;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.swing.JOptionPane;

/**
 *
 * @author 1513 FOX
 */

    
@ManagedBean(name = "pesquisaBean")
@RequestScoped
public class pesquisaBean {
    
   	private Model gastos = new Model();
        private List<Model> lista;
        private List<Model> listaestado;
        private List<Model> gastosPorEstado; /*Gastos por estado*/
         private List<String> listacidade;
        private List<SelectItem> estados;
        private List<SelectItem> cidades;
        private String estado;
        private String cidade;

   

    public void setListaestado(List<Model> listaestado) {
        this.listaestado = listaestado;
    }

    public void setListacidade(List<String> listacidade) {
        this.listacidade = listacidade;
    }

    public void setEstados(List<SelectItem> estados) {
        this.estados = estados;
    }

    public void setCidades(List<SelectItem> cidades) {
        this.cidades = cidades;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<Model> getGastosPorEstado() {
        return gastosPorEstado;
    }

    public void setGastosPorEstado(List<Model> gastosSelecionados) {
        this.gastosPorEstado = gastosSelecionados;
    }
     
    public void listaGastosEstado()           
    {       listaestado = this.getLista();
            gastosPorEstado=new ArrayList<>();
            for(Model g: listaestado)
            {
                if(g.getDscCidade().equals(estado))
                    gastosPorEstado.add(g);
            }
    }

    /*retorna a lista de cidades para o estado atual*/
    /*
    public List<String> getListacidade(){
        listacidade = new ArrayList<String>();
        for(Model g:listaestado)
        {
            if (g.getDscCidade().equals(estado))
                listacidade.add(g.getDscCidade());
        }
        return listacidade;
    }
    */
   
    public List<Model> getListaestado(){
        //Set<Gastos> estados = new HashSet<Gastos>(listaestado);
        //listaestado = new ArrayList<Gastos>(estados);
        return listaestado;
    }
  
     public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
        

        public List<SelectItem> getEstados () {
		SelectItem item = null;
                lista = new ModelRN().listar();
                estados = new ArrayList<>();
                
		if (lista != null) {
			for (Model gasto : lista) {
				item = new SelectItem(gasto, gasto.getDscCidade());
				//item.setEscape(false);
				estados.add(item);                                
			}
		}
                return estados;
	}
        /*
        public List<SelectItem> getCidades() {
		SelectItem item = null;
                lista = new ModelRN().listar();
                cidades = new ArrayList<SelectItem>();
		if (lista != null) {
			for (Model gasto : lista) {
				item = new SelectItem(gasto, gasto.getDscCidade());
				item.setEscape(false);
				cidades.add(item);				
			}
		}
                    return cidades;
	}*/
	

	public String novoE() {
		this.gastos = new Model();
                this.lista=new ModelRN().listar();
		return "teste.xhtml";
	}

    public Model getGastos() {
        return gastos;
    }

    public void setGastos(Model gastos) {
        this.gastos = gastos;
    }

    public List<Model> getLista() {
        return new ModelRN().listar();
    }

    public void setLista(List<Model> lista) {
        this.lista = lista;
    }
                    
        /*public int buscarLocal(){
            GastosRN estado = new GastosRN();
                gastos.setCodigo(codigo);
                Gastos e = estado.buscarPorCodigo(this.gastos.getCodigo());
		FacesContext context = FacesContext.getCurrentInstance();
                FacesMessage facesMessage = new FacesMessage(Integer.toString(e.getPopulacao()));
		context.addMessage(null, facesMessage);
                return e.getPopulacao();
	}*/
        
         public List<Model> buscarEstado(String est){
                List<Model> e = new ModelRN().listar();
                for(Model g:e)
                {
                    if(est.equals(g.getDscCidade()))
                        this.listaestado.add(g);
                }
		FacesContext context = FacesContext.getCurrentInstance();
                FacesMessage facesMessage = new FacesMessage(e.toString());
		context.addMessage(null, facesMessage);
                return listaestado;
	}
         
            public String buscarGastosEstado(String codigo){
                ModelRN gastorn = new ModelRN();
                gastos = new Model();
                
                FacesContext context = FacesContext.getCurrentInstance();
                //gastos.getPopulacao()));
		
                return codigo;
      
	
	}
            public List<Model> listar()
            {
                ModelRN gastosrn = new ModelRN();
                this.lista = gastosrn.listar();
                return gastosrn.listar();
            }
}

