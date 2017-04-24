/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5612;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.ejb.EJB;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author martin
 */
@ManagedBean
@RequestScoped
public class BeanContato implements Serializable {

    @EJB
    protected AgendaEJBLocal agenda;

    protected String nome;
    protected String telefone;
    protected String endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String numero) {
        this.telefone = numero;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String gravar() {
        //implementar
    }

    public String buscar() {                
        //implemementar
    }
    
    public String modificar(){
        //implementar
    }
}
