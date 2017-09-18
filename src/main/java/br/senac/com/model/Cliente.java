
package br.senac.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity (name = "tb_cliente")  // desta forma escolher o nome da tabela se não vai o nome da Classe
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)  /// auto incremento // INCREMENTA UM NA CHAVE PRIMARIA
    private int id;
    private String nome;
    @Column(unique = true)  // não repetir cpf
    private String cpf;
    @ManyToOne  // clase interna to classe de fora    o outro seria ManyToMany
    private Sexo sexo;

    public Cliente() {
    }

    public Cliente(int id, String nome, String cpf, Sexo sexo) {   
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id;
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
        final Cliente other = (Cliente) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", sexo=" + sexo + '}';
    }
    
    
    
}
