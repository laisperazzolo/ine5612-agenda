/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5612;

import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class BeanReserva implements Serializable {

    @EJB
    protected AgendaEJBLocal agenda;

    private Long Id;
    private Usuario usuario;
    private Viagem viagem;

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Viagem getViagem() {
        return viagem;
    }

    public void setViagem(Viagem viagem) {
        this.viagem = viagem;
    }

    public String gravar() {
        Reserva reserva = new Reserva();
        reserva.setId(this.Id);
        reserva.setUsuario(this.usuario);
        reserva.setViagem(this.viagem);
        this.agenda.gravar(reserva);
        return "telaUsuario.xhtml";//
    }    
}
