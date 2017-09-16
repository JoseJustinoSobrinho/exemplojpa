
package br.senac.rn.dao;

import br.senac.com.model.Vendas;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class VendasDAO {
        private EntityManager manager;  // gerenciador de entidades. 
    private EntityManagerFactory factory;  // precisa dedes dois para o hibernete, fábrica de gerenciador de entidades

     public VendasDAO() {  // usar o construtor
        factory = Persistence.createEntityManagerFactory("ConexaoDB");  // peguei da unidade de persistencia
        manager = factory.createEntityManager();
    }
    
       public void inserir (Vendas vendas){
        manager.getTransaction().begin();
        manager.persist(vendas);   // inserir
        manager.getTransaction().commit();
    }
    
    
}
