
package br.senac.rn.dao;

import br.senac.com.model.Produto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


public class ProdutoDAO {
     private EntityManager manager;  // gerenciador de entidades. 
    private EntityManagerFactory factory;  // precisa dedes dois para o hibernete, fábrica de gerenciador de entidades

     public ProdutoDAO() {  // usar o construtor
        factory = Persistence.createEntityManagerFactory("ConexaoDB");  // peguei da unidade de persistencia
        manager = factory.createEntityManager();
    }
          
      public void inserir (Produto produto){
        manager.getTransaction().begin();
        manager.persist(produto);   // inserir
        manager.getTransaction().commit();
    }
     
      
        public void excluir(Produto produto){
        manager.getTransaction().begin();
        manager.remove(produto);   // apagar ou excluir
        manager.getTransaction().commit();                        
    }
    
    public void atualizar(Produto produto){
        manager.getTransaction().begin();
        manager.merge(produto);   // atualizar
        manager.getTransaction().commit();
}
    
     public List<Produto> buscarTodos(){
        TypedQuery<Produto> consulta = manager.createQuery("SELECT s FROM Sexo s", Produto.class);
        return consulta.getResultList();
    }
    
    
    public Produto buscarPorId(int id){
//        Sexo s = manager.find(Sexo.class, id);
//        return s;
        
        return manager.find(Produto.class, id); // diminuindo
      
    }
    
}

