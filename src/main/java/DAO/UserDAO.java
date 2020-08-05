package DAO;
  
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
  
import Model.User;
  
public class UserDAO {
  
    private EntityManagerFactory factory = Persistence
                .createEntityManagerFactory("com.mycompany_ubsReview_war_1.0-SNAPSHOTPU");
    private EntityManager em = factory.createEntityManager();
 
    public User getUsuario(String email, String senha) {
 
      try {
        User usuario = (User) em
         .createQuery(
             "SELECT u from User u where u.email = :name and u.senha = :senha")
         .setParameter("name", email)
         .setParameter("senha", senha).getSingleResult();
 
        return usuario;
      } catch (NoResultException e) {
            return null;
      }
    }
 
  public boolean inserirUsuario(User usuario) {
          try {
                em.persist(usuario);
                return true;
          } catch (Exception e) {
                e.printStackTrace();
                return false;
          }
    }
     
    public boolean deletarUsuario(User usuario) {
          try {
                em.remove(usuario);
                return true;
          } catch (Exception e) {
                e.printStackTrace();
                return false;
          }
    }
  
}