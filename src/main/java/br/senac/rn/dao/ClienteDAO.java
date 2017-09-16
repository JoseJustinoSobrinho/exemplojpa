
package br.senac.rn.dao;

import br.senac.com.model.Cliente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


public class ClienteDAO {
     private EntityManager manager;  // gerenciador de entidades. 
     private EntityManagerFactory factory;  // precisa dedes dois para o hibernete, fábrica de gerenciador de entidades

   public ClienteDAO() {  // usar o construtor
        factory = Persistence.createEntityManagerFactory("ConexaoDB");  // peguei da unidade de persistencia
        manager = factory.createEntityManager();
    }

    public void inserir (Cliente cliente){
        manager.getTransaction().begin();
        manager.persist(cliente);   // inserir
        manager.getTransaction().commit();
    }
 
         public void excluir(Cliente cliente){
        manager.getTransaction().begin();
        manager.remove(cliente);   // apagar ou excluir
        manager.getTransaction().commit();                        
    }
         
          public void atualizar(Cliente cliente){
        manager.getTransaction().begin();
        manager.merge(cliente);   // atualizar
        manager.getTransaction().commit();
}   
      public List<Cliente> buscarTodos(){
        TypedQuery<Cliente> consulta = manager.createQuery("SELECT s FROM Clientes s", Cliente.class);
        return consulta.getResultList();
    }
       
          
    public Cliente buscarPorId(int id){
//        Sexo s = manager.find(Sexo.class, id);
//        return s;        
        return manager.find(Cliente.class, id); // diminuindo      
    }
    
    
          
}
