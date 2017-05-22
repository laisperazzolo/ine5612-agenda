/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5612;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import javax.ejb.EJB;
import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
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
    protected int id;
    protected String data;
    protected String horario;
    protected String cidadeOrigem;
    protected String cidadedestino;
    protected Double valorDaPassagem;
    protected int numMaxDeAcento;

    public String cadastrarViagem (){
        Viagem viagem = new Viagem();
        viagem.setData(this.data);
        viagem.setHorario(this.horario);
        viagem.setCidadeOrigem(this.cidadeOrigem);
        viagem.setCidadeDestino(this.cidadedestino);
        viagem.setValorPassagem(this.valorDaPassagem);
        viagem.setMaxAcentos(this.numMaxDeAcento);
        
        this.passagem.gravar(viagem);
        return "telaCadastrarUsuario.xhtml";
    }
    
    public void setPassagem(AgendaEJBLocal passagem) {
        this.passagem = passagem;
    }

    public AgendaEJBLocal getPassagem() {
        return passagem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Double getValorDaPassagem() {
        return valorDaPassagem;
    }

    public void setValorDaPassagem(Double valorDaPassagem) {
        this.valorDaPassagem = valorDaPassagem;
    }

    public int getNumMaxDeAcento() {
        return numMaxDeAcento;
    }

    public void setNumMaxDeAcento(int numMaxDeAcento) {
        this.numMaxDeAcento = numMaxDeAcento;
    }
}
