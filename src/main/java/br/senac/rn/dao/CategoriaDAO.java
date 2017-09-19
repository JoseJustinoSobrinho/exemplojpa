
package br.senac.rn.dao;

import br.senac.com.model.Categoria;
import br.senac.com.model.Sexo;
import br.senac.rn.util.GenericDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


public class CategoriaDAO extends GenericDAO<Categoria>{
     @Override
    public Class<Categoria> getClassType() {
     return Categoria.class;
    }
    
    
////////    private EntityManager manager;  // gerenciador de entidades. 
////////    private EntityManagerFactory factory;  // precisa dedes dois para o hibernete, fábrica de gerenciador de entidades
////////    
////////      public CategoriaDAO() {  // usar o construtor
////////        factory = Persistence.createEntityManagerFactory("ConexaoDB");  // peguei da unidade de persistencia  // factory é conecsão o banco
////////        manager = factory.createEntityManager();     // GERENCIADOR DE ENTIDADES manager
////////    }
////////    
////////    public void inserir (Categoria categoria){
////////        manager.getTransaction().begin();
////////        manager.persist(categoria);   // inserir
////////        manager.getTransaction().commit();
////////    }
////////    
////////     public void excluir(Categoria categoria){
////////        manager.getTransaction().begin();
////////        manager.remove(categoria);   // apagar ou excluir
////////        manager.getTransaction().commit();                        
////////    }
////////     
////////      public void atualizar(Categoria categoria){
////////        manager.getTransaction().begin();
////////        manager.merge(categoria);   // atualizar
////////        manager.getTransaction().commit();
////////      }
////////      
////////      
////////         public List<Categoria> buscarTodos(){
////////        TypedQuery<Categoria> consulta = manager.createQuery("SELECT s FROM Caterogia s", Categoria.class);
////////        return consulta.getResultList();
////////    }
////////
////////  public Categoria buscarPorId(int id){
////////        Categoria s = manager.find(Categoria.class, id);
////////        return s;
////////        
//////////        return manager.find(Categoria.class, id); // diminuindo      
////////    }
////////  

   
}
