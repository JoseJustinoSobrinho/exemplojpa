/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.rn.util;

import javax.persistence.EntityManager;

/**
 *
 * @author a9122116
 */
public abstract class GenericDAO <T>{
    protected static EntityManager manager;
    
    public abstract Class<T> getClassType();
    
    public EntityManager getEm(){
        if(manager == null) {
            manager = DataBase.getInstance().getEm();
        }
        return manager;
    }
    
    public void insert (T t){
        try{
        getEm().getTransaction().begin();
        getEm().persist(t);
        getEm().getTransaction().commit();
    } catch(Exception e){
        System.out.println("Erro:" + e);
    }
    }
}
