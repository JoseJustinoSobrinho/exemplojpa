
package br.senac.rn.dao;

import br.senac.com.model.Sexo;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


public class SexoDAO {
    private EntityManager manager;  // gerenciador de entidades. 
    private EntityManagerFactory factory;  // precisa dedes dois para o hibernete, fábrica de gerenciador de entidades

    public SexoDAO() {  // usar o construtor
        factory = Persistence.createEntityManagerFactory("ConexaoDB");  // peguei da unidade de persistencia
        manager = factory.createEntityManager();
    }
    
    public void inserir (Sexo sexo){
        manager.getTransaction().begin();
        manager.persist(sexo);   // inserir
        manager.getTransaction().commit();
    }
            
    public void excluir(Sexo sexo){
        manager.getTransaction().begin();
        manager.remove(sexo);   // apagar ou excluir
        manager.getTransaction().commit();                        
    }
    
    public void atualizar(Sexo sexo){
        manager.getTransaction().begin();
        manager.merge(sexo);   // atualizar
        manager.getTransaction().commit();
}
    
    public List<Sexo> buscarTodos(){
        TypedQuery<Sexo> consulta = manager.createQuery("SELECT s FROM Sexo s", Sexo.class);
        return consulta.getResultList();
    }
    
    public Sexo buscarPorId(int id){
//        Sexo s = manager.find(Sexo.class, id);
//        return s;
        
        return manager.find(Sexo.class, id); // diminuindo
      
    }
}
