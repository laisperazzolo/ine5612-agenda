/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5612;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Mirian
 */
@Entity
@Table(name = "VIAGEM")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Viagem.findAll", query = "SELECT v FROM Viagem v")
    , @NamedQuery(name = "Viagem.findByIdViagem", query = "SELECT v FROM Viagem v WHERE v.idViagem = :idViagem")
    , @NamedQuery(name = "Viagem.findByData", query = "SELECT v FROM Viagem v WHERE v.data = :data")
    , @NamedQuery(name = "Viagem.findByHorario", query = "SELECT v FROM Viagem v WHERE v.horario = :horario")
    , @NamedQuery(name = "Viagem.findByCidadeOrigem", query = "SELECT v FROM Viagem v WHERE v.cidadeOrigem = :cidadeOrigem")
    , @NamedQuery(name = "Viagem.findByCidadeDestino", query = "SELECT v FROM Viagem v WHERE v.cidadeDestino = :cidadeDestino")
    , @NamedQuery(name = "Viagem.findByValorPassagem", query = "SELECT v FROM Viagem v WHERE v.valorPassagem = :valorPassagem")
    , @NamedQuery(name = "Viagem.findByMaxAcentos", query = "SELECT v FROM Viagem v WHERE v.maxAcentos = :maxAcentos")})
public class Viagem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_VIAGEM")
    private Integer idViagem;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATA")
    @Temporal(TemporalType.DATE)
    private Date data;
    @Basic(optional = false)
    @NotNull
    @Column(name = "HORARIO")
    @Temporal(TemporalType.TIME)
    private Date horario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CIDADE_ORIGEM")
    private String cidadeOrigem;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CIDADE_DESTINO")
    private String cidadeDestino;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VALOR_PASSAGEM")
    private double valorPassagem;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MAX_ACENTOS")
    private int maxAcentos;

    public Viagem() {
    }

    public Viagem(Integer idViagem) {
        this.idViagem = idViagem;
    }

    public Viagem(Integer idViagem, Date data, Date horario, String cidadeOrigem, String cidadeDestino, double valorPassagem, int maxAcentos) {
        this.idViagem = idViagem;
        this.data = data;
        this.horario = horario;
        this.cidadeOrigem = cidadeOrigem;
        this.cidadeDestino = cidadeDestino;
        this.valorPassagem = valorPassagem;
        this.maxAcentos = maxAcentos;
    }

    public Integer getIdViagem() {
        return idViagem;
    }

    public void setIdViagem(Integer idViagem) {
        this.idViagem = idViagem;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public String getCidadeOrigem() {
        return cidadeOrigem;
    }

    public void setCidadeOrigem(String cidadeOrigem) {
        this.cidadeOrigem = cidadeOrigem;
    }

    public String getCidadeDestino() {
        return cidadeDestino;
    }

    public void setCidadeDestino(String cidadeDestino) {
        this.cidadeDestino = cidadeDestino;
    }

    public double getValorPassagem() {
        return valorPassagem;
    }

    public void setValorPassagem(double valorPassagem) {
        this.valorPassagem = valorPassagem;
    }

    public int getMaxAcentos() {
        return maxAcentos;
    }

    public void setMaxAcentos(int maxAcentos) {
        this.maxAcentos = maxAcentos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idViagem != null ? idViagem.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Viagem)) {
            return false;
        }
        Viagem other = (Viagem) object;
        if ((this.idViagem == null && other.idViagem != null) || (this.idViagem != null && !this.idViagem.equals(other.idViagem))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ine5612.Viagem[ idViagem=" + idViagem + " ]";
    }
    
}
