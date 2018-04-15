/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.teste;

import br.edu.ifsul.servicos.DadosCompra;
import br.edu.ifsul.servicos.ServicoDadosCompraService;
import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 *
 * @author V_M_FT
 */
public class TestaServicoDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws DatatypeConfigurationException {
        ServicoDadosCompraService compra = new ServicoDadosCompraService();
        DadosCompra dados = new DadosCompra();
        dados.setId(10);
        dados.setCliente("Teste1");
        dados.setCepOrigem(95985000);
        dados.setCepDestino(5555555);
        dados.setEndereco("Rua: Não sei ");
        dados.setValorCompra(500.00);
        dados.setValorFrete(10.00);
            XMLGregorianCalendar data =
                DatatypeFactory.newInstance().newXMLGregorianCalendar(
        new GregorianCalendar());
        dados.setDataEntrega(data);
        compra.getServicoDadosCompraPort().inserir(dados);
      
        
    }
    
}
