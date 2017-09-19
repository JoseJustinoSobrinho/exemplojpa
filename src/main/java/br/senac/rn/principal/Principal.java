
package br.senac.rn.principal;

import br.senac.com.model.Categoria;
import br.senac.com.model.Cliente;
import br.senac.com.model.Produto;
import br.senac.com.model.Sexo;
import br.senac.com.model.Vendas;
import br.senac.rn.dao.CategoriaDAO;
import br.senac.rn.dao.ClienteDAO;
import br.senac.rn.dao.ProdutoDAO;
import br.senac.rn.dao.SexoDAO;
import br.senac.rn.dao.VendasDAO;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.naming.ldap.ManageReferralControl;

public class Principal {
    public static void main(String[] args) {
//        /////////// SEXO  >>>>>>>>>>>>>>>>
//        SexoDAO dao = new SexoDAO();
////        System.out.println(dao.buscarTodos().toString());  /// lista lateral
////        System.exit(0);   
//        
//        for(Sexo s : dao.buscarTodos()){
//            System.out.println(s); /// lista em pé
//        }
////        System.out.println(dao.buscarPorId(3).toString());  /// buscar por seleção , passando dados
////        dao.buscarTodos().stream().forEach((s) -> {System.out.println(s);}); /// expressão lambida
//
//  
//        
////       Sexo s1 = new Sexo(3, "Indefinido", 'I'); ind não automatica
//
////////////       Sexo s1 = new Sexo();     // construir automatico
////////////       s1.setNome("Outros");
////////////       s1.setSigla('O');
//////////////////       
//////////////       SexoDAO dao = new SexoDAO();
////////////       dao.inserir(s1); 
//        
////        Sexo s1 = new Sexo();
////        
////        s1.setId(2);
////        s1.setNome("Outros");
////        s1.setSigla('O');
////                
////        System.out.println(s1.toString());
////        
////        Sexo s2 = new Sexo(2, "Outros", 'O');
////        
////        System.out.println(s2.toString());
////        
////        if(s1== s2){
////                    System.out.println("iguais");
////        } else {
////             System.out.println("diferentes");
////        }
////        
////        if(s1.equals(s2)){
////                    System.out.println("1iguais");
////        } else {
////             System.out.println("!diferentes");
////        }
////    }
//            
//     Categoria s1 = new Categoria();
//        
//        s1.setId(2);
//        s1.setNome("contribuinte");
//        s1.setDescricao("c");
////                
////        System.out.println(s1.toString());
////        
////        Sexo s2 = new Sexo(2, "Outros", 'O');
////        
////        System.out.println(s2.toString());
////        
////        if(s1== s2){
////                    System.out.println("iguais");
////        } else {
////             System.out.println("diferentes");
////        }
////        
////        if(s1.equals(s2)){
////                    System.out.println("1iguais");
////        } else {
////             System.out.println("!diferentes");
////        }
//
//        System.exit(0);
//
//    }
    
    
     /////////// categoria  >>>>>>>>>>>>>>>>
//        CategoriaDAO dao = new CategoriaDAO();
//        System.out.println(dao.buscarTodos().toString());  /// lista lateral
//        System.exit(0);   
        
//        for(Categoria s : dao.buscarTodos()){
//            System.out.println(s); /// lista em pé
//        }
//        System.out.println(dao.buscarPorId(3).toString());  /// buscar por seleção , passando dados
//        dao.buscarTodos().stream().forEach((s) -> {System.out.println(s);}); /// expressão lambida

  
        
//       Sexo s1 = new Sexo(3, "Indefinido", 'I'); ind não automatica

//       Categoria s1 = new Categoria();     // construir automatico
//       s1.setNome("Contribuinte");
//       s1.setDescricao("C");     
//       CategoriaDAO dao = new CategoriaDAO();  obs:  rolbach() é interessante quando não foi concluida a transação..
//       dao.inserir(s1); 
//       
//        Categoria s1 = new Categoria();     // construir automatico
//       s1.setNome("Dependente");
//       s1.setDescricao("D");     
//       CategoriaDAO dao = new CategoriaDAO();
//       dao.inserir(s1); 
////        
////////////////       
////////////       SexoDAO dao = new SexoDAO();
//////////       dao.inserir(s1); 
//             Sexo s1 = new Sexo();     // construir automatico
//       s1.setNome("Outros");
//       s1.setSigla('O');
//        Sexo s1 = new Sexo();
//        
//        s1.setId(2);
//        s1.setNome("Outros");
//        s1.setSigla('O');
//                
//        System.out.println(s1.toString());
//        
//        Sexo s2 = new Sexo(2, "Outros", 'O');
//        
//        System.out.println(s2.toString());
//        
//        if(s1== s2){
//                    System.out.println("iguais");
//        } else {
//             System.out.println("diferentes");
//        }
//        
//        if(s1.equals(s2)){
//                    System.out.println("1iguais");
//        } else {
//             System.out.println("!diferentes");
//        }
//    }
            
//     Sexo s1 = new Sexo();
//        
//        s1.setId(2);
//        s1.setNome("masculino");
//        s1.setSigla('M');
//                
//        System.out.println(s1.toString());
//        
//        Sexo s2 = new Sexo(2, "Outros", 'O');
//        
//        System.out.println(s2.toString());
//        
//        if(s1== s2){
//                    System.out.println("iguais");
//        } else {
//             System.out.println("diferentes");
//        }
//        
//        if(s1.equals(s2)){
//                    System.out.println("1iguais");
//        } else {
//             System.out.println("!diferentes");
//        }

//       Produto s1 = new Produto();     // construir automatico
//       s1.setNome("Cereais");
//       s1.setDescricao("R");
//       s1.setPreco(20);  // float
//       s1.setCategoria(new CategoriaDAO().buscarPorId(1));
//       ProdutoDAO dao = new ProdutoDAO();
//       dao.inserir(s1); 
//        System.exit(0);

//Cliente s1 = new Cliente();     // construir automatico
//       s1.setNome("José Justino Sobrinho");
//       s1.setCpf("91253799415");
//       s1.setSexo(new SexoDAO().buscarPorId(1));
//       ClienteDAO dao = new ClienteDAO();
//       dao.inserir(s1); 
//        System.exit(0);
        
//        Cliente s1 = new Cliente();     // construir automatico   // esse deu erro
//       s1.setNome("Ana Lúcia Soares");
//       s1.setCpf("83747761453");
//       s1.setSexo(new SexoDAO().buscarPorId(2));
//       ClienteDAO dao = new ClienteDAO();
//       dao.inserir(s1); 
//        System.exit(0);
    

// new ClienteDAO().inserir(new Cliente("Ulinha", "14344432", new SexoDAO().buscarPorId(2)));  //ok
 
 
//////// Vendas s1 = new Vendas();     // construir automatico
////////       s1.setCliente(new ClienteDAO().buscarPorId(2));
////////       s1.setData(Calendar.getInstance());
////////       List<Produto> produtos = new ArrayList();
////////       
////////       produtos.add(new ProdutoDAO().buscarPorId(4));
////////       produtos.add(new ProdutoDAO().buscarPorId(4));
////////       produtos.add(new ProdutoDAO().buscarPorId(4));
////////       produtos.add(new ProdutoDAO().buscarPorId(2));
////////       
////////       s1.setProdutos(produtos);
////////       float valor = 0;
////////       for(Produto p : produtos){
////////           valor += p.getPreco();
////////       }
////////       s1.setValor(valor);       
////////       new VendasDAO().inserir(s1);
//
//        new VendasDAO().inserir(new Vendas(new ClienteDAO().buscarPorId(2), 33, ));  //ok
     
////        new ClienteDAO().inserir(new Cliente(new ClienteDAO().buscarPorId(2), 33, ));  //ok
////      System.exit(0);



//
//        new VendasDAO().inserir(new Vendas(new ClienteDAO().buscarPorId(2), 33, ));  //ok
     
//      System.exit(0);

//        System.out.println(new ClienteDAO().buscarPorCpf("91253799415"));  /// lista lateral
//        System.exit(0);   


//        System.out.println(new ClienteDAO().buscarPorParteCpf("37"));  /// lista lateral
//        System.exit(0);   


     new SexoDAO().inserir(new Sexo(0, "Masculino", 'M'));  //ok
      System.exit(0);
    }
    
}
