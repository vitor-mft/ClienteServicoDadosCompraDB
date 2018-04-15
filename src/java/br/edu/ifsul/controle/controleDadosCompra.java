/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.controle;


import br.edu.ifsul.dao.DadosCompraDAO;
import br.edu.ifsul.servicos.DadosCompra;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;

import javax.inject.Named;

/**
 *
 * @author V_M_FT
 */
@Named (value = "controleDadosCompra")
@SessionScoped
public class controleDadosCompra implements Serializable{
    
    private DadosCompra objeto;
   
    @EJB
    private DadosCompraDAO dao;

    
    
    public controleDadosCompra(){
        
    }
    
    public String novo(){
        objeto = new DadosCompra();
        objeto.setId(0);
        return "form?faces-redirect=true";
    }
    
    public String alterar(DadosCompra obj){
        objeto = obj;
        return "form?faces-redirect=true";
    }
    
    public String salvar(){
        if (objeto.getId() == 0){
            dao.inserir(objeto);
        }else{
            dao.alterar(objeto);
        }
        return "index?faces-redirect=true";
    }
    
    public void remover (Integer id){
        dao.remover(id);
    }
    
    public DadosCompra getObjeto() {
        return objeto;
    }

    public void setObjeto(DadosCompra objeto) {
        this.objeto = objeto;
    }

    public DadosCompraDAO getDao() {
        return dao;
    }

    public void setDao(DadosCompraDAO dao) {
        this.dao = dao;
    }
    
    
    
}
