/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5612;

import javax.ejb.EJB;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Mirian
 */
public class BeanViagem {
    
    @EJB
    protected AgendaEJBLocal passagem;

    protected String data;
    protected String horario;
    protected String cidadeOrigem;
    protected String cidadedestino;
    protected String valorDaPassagem;
    protected String numMaxDeAcento;

    /*public String cadastrarViagem (){
        Viagem viagem = new Viagem();
        viagem.setData(this.data);
        viagem.setHorario(this.horario);
        viagem.setSenha(this.cidadeOrigem);
        viagem.setTipoDeUsuario(this.cidadedestino);
        this.agenda.gravar(viagem);
        return "telaCadastrarUsuario.xhtml";
    }*/
    
    public void setPassagem(AgendaEJBLocal passagem) {
        this.passagem = passagem;
    }

    public AgendaEJBLocal getPassagem() {
        return passagem;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getCidadeOrigem() {
        return cidadeOrigem;
    }

    public void setCidadeOrigem(String cidadeOrigem) {
        this.cidadeOrigem = cidadeOrigem;
    }

    public String getCidadedestino() {
        return cidadedestino;
    }

    public void setCidadedestino(String cidadedestino) {
        this.cidadedestino = cidadedestino;
    }

    public String getValorDaPassagem() {
        return valorDaPassagem;
    }

    public void setValorDaPassagem(String valorDaPassagem) {
        this.valorDaPassagem = valorDaPassagem;
    }

    public String getNumMaxDeAcento() {
        return numMaxDeAcento;
    }

    public void setNumMaxDeAcento(String numMaxDeAcento) {
        this.numMaxDeAcento = numMaxDeAcento;
    }
    
    
}
