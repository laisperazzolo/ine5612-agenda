/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5612;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class AgendaEJB implements AgendaEJBLocal {

    @PersistenceContext
    private EntityManager em;
 
    @Override
    public void gravar(Usuario contato){
        this.em.persist(contato);
    }
    
    @Override
    public Usuario buscar(String nome){
        return this.em.find(Usuario.class, nome);
    }
}
