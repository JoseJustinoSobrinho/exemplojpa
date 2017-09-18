
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
        TypedQuery<Cliente> consulta = manager.createQuery("SELECT s FROM Cliente s", Cliente.class);
        return consulta.getResultList();
    }
       
          
    public Cliente buscarPorId(int id){
//        Sexo s = manager.find(Sexo.class, id);
//        return s;        
        return manager.find(Cliente.class, id); // diminuindo      
             
    }
    
    public Cliente buscarPorCpf(String cpf){
        String jpql = "SELECT c FROM tb_cliente c WHERE c.cpf = :cpfCliente";
        TypedQuery<Cliente> consulta = manager.createQuery(jpql, Cliente.class);
        consulta.setParameter("cpfCliente", cpf);
        return consulta.getSingleResult();
        
//        return null;
    }

   public List<Cliente> buscarPorParteCpf(String cpf){
        String jpql = "SELECT c FROM tb_cliente c WHERE c.cpf like :cpf";
        TypedQuery<Cliente> consulta = manager.createQuery(jpql, Cliente.class);
        consulta.setParameter("cpf", "%" + cpf + "%");
        return consulta.getResultList();
        
//        return null;
    }
          
}
