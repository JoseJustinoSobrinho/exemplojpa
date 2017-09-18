
package br.senac.com.model;

import java.util.Calendar;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Vendas {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)  /// auto incremento // INCREMENTA UM NA CHAVE PRIMARIA
    private int id;
    @ManyToOne
    private Cliente cliente; 
    private float valor;
    @ManyToMany  // um produto tem somente uma categoria, e uma categoria tem vários produtos.
    private List<Produto> produtos;
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar data;

    public Vendas() {
    }

    public Vendas(int id, Cliente cliente, float valor, List<Produto> produtos, Calendar data) {
        this.id = id;
        this.cliente = cliente;
        this.valor = valor;
        this.produtos = produtos;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vendas other = (Vendas) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Vendas{" + "id=" + id + ", cliente=" + cliente + ", valor=" + valor + ", produtos=" + produtos + ", data=" + data + '}';
    }

   
   
    
}
