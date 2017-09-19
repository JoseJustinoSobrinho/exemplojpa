/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.rn.util;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author a9122116
 */
public abstract class GenericDAO <T>{
    protected static EntityManager manager;
    
    public abstract Class<T> getClassType();
    
    public EntityManager getEm(){
        if(manager == null || !manager.isOpen()) {
            manager = DataBase.getInstance().getEm();
        }
        return manager;
    }
    
//    public void insert (T t){    // /primeiro modelo
//        try{
//        getEm().getTransaction().begin();
//        getEm().persist(t);
//        getEm().getTransaction().commit();
//    } catch(Exception e){
//        System.out.println("Erro:" + e);
//    }
//    }
    
    
    public T insert (T t){    // outro modelo
      EntityManager em = getEm();
        try{
        em.getTransaction().begin();
        em.persist(t);
        em.getTransaction().commit();
    } catch(Exception error){
        error.printStackTrace();
        em.getTransaction().rollback();
    }
        return t;
    }
    
    
     public T delete (T t){    // outro modelo
      EntityManager em = getEm();
        try{
        em.getTransaction().begin();
        em.remove(t);
        em.getTransaction().commit();
    } catch(Exception error){
        error.printStackTrace();
        em.getTransaction().rollback();
    }
        return t;
    }
     
     
      public T update (T t){    // outro modelo
      EntityManager em = getEm();
        try{
        em.getTransaction().begin();
        em.merge(t);
        em.getTransaction().commit();
    } catch(Exception error){
        error.printStackTrace();
        em.getTransaction().rollback();
    }
        return t;
    }
      
      
      public T selectById(int id){
          EntityManager em = getEm();
          return em.find(getClassType(), id);
      }
      
    public List<T> selectAll(){
        EntityManager em  = getEm();
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<T> query = builder.createQuery(getClassType());
        String jpql = "SELECT t FROM T t";
        TypedQuery<T> typedQuery = em.createQuery(query.select(query.from(getClassType())));
        return typedQuery.getResultList();        
    }
}
