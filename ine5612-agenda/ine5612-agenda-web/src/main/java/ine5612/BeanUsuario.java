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
public class BeanUsuario implements Serializable {

    @EJB
    protected AgendaEJBLocal agenda;

    protected String nome;
    protected String email;
    protected String senha;
    protected String tipoDeUsuario;

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAgenda(AgendaEJBLocal agenda) {
        this.agenda = agenda;
    }

    public String getTipoDeUsuario() {
        return tipoDeUsuario;
    }

    public void setTipoDeUsuario(String tipoDeUsuario) {
        this.tipoDeUsuario = tipoDeUsuario;
    }

    public String gravar() {
        Usuario usuario = new Usuario();
        usuario.setNome(this.nome);
        usuario.setEmail(this.email);
        usuario.setSenha(this.senha);
        usuario.setTipoDeUsuario(this.tipoDeUsuario);
        this.agenda.gravar(usuario);
        return "teste.xhtml";
    }
    public String autenticar (){
        return "telaFuncionario.xhtml";
    }
    public String cadastrarUsuario (){
        Usuario usuario = new Usuario();
        usuario.setNome(this.nome);
        usuario.setEmail(this.email);
        usuario.setSenha(this.senha);
        usuario.setTipoDeUsuario(this.tipoDeUsuario);
        this.agenda.gravar(usuario);
        System.out.println("é noix");
        return "telaCadastrarUsuario.xhtml";
    }
    //public String voltarParaIndex (){
      //  return "index.xhtml";
        /*
        solucionar problema de voltar
        se colocar return "index.xhtml";
        da erro nao entendir porque ainda
        */
    //}
    
    /*
    public String buscar() {                
        Usuario usuario = this.agenda.buscar(this.nome);
        if (usuario != null) {
            this.endereco = usuario.getEndereco();
            this.telefone = usuario.getTelefone();
        }
        else
            this.nome = null;
            
        return "buscar.xhtml";
    }
    */
}
