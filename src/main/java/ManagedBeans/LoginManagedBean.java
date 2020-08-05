/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagedBeans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
  
import DAO.UserDAO;
import Model.User;
  
@ManagedBean(name = "LoginMB")
@ViewScoped
public class LoginManagedBean {
  
  private UserDAO usuarioDAO = new UserDAO();
  private User usuario = new User();
   
  public String envia() {
         
    usuario = usuarioDAO.getUsuario(usuario.getEmail(), usuario.getSenha());
    if (usuario == null) {
      usuario = new User();
      FacesContext.getCurrentInstance().addMessage(
         null,
         new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuário não encontrado!",
           "Erro no Login!"));
      return null;
    } else {
          return "/faces/comentarios/Create.xhtml";
    }
         
         
  }
 
  public User getUsuario() {
    return usuario;
  }
 
  public void setUsuario(User usuario) {
    this.usuario = usuario;
  }
}
