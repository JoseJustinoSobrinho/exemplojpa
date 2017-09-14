
package br.senac.rn.dao;

import br.senac.com.model.Categoria;
import br.senac.com.model.Sexo;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


public class CategoriaDAO {
    private EntityManager manager;  // gerenciador de entidades. 
    private EntityManagerFactory factory;  // precisa dedes dois para o hibernete, fábrica de gerenciador de entidades
    
      public CategoriaDAO() {  // usar o construtor
        factory = Persistence.createEntityManagerFactory("ConexaoDB");  // peguei da unidade de persistencia
        manager = factory.createEntityManager();
    }
    
    public void inserir (Categoria categoria){
        manager.getTransaction().begin();
        manager.persist(categoria);   // inserir
        manager.getTransaction().commit();
    }
    
     public void excluir(Categoria categoria){
        manager.getTransaction().begin();
        manager.remove(categoria);   // apagar ou excluir
        manager.getTransaction().commit();                        
    }
     
      public void atualizar(Categoria categoria){
        manager.getTransaction().begin();
        manager.merge(categoria);   // atualizar
        manager.getTransaction().commit();
      }
      
      
         public List<Categoria> buscarTodos(){
        TypedQuery<Categoria> consulta = manager.createQuery("SELECT s FROM Sexo s", Categoria.class);
        return consulta.getResultList();
    }

  public Categoria buscarPorId(int id){
//        Sexo s = manager.find(Sexo.class, id);
//        return s;
        
        return manager.find(Categoria.class, id); // diminuindo      
    }
  
}
