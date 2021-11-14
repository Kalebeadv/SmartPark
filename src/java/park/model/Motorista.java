/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package park.model;

/**
 *
 * @author kaleb
 */
public class Motorista implements java.io.Serializable{
    private String nome;
    private Integer telefone;

    public Motorista() {
    }

    
    public Motorista(String nome, Integer telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }
    
    
    
}
