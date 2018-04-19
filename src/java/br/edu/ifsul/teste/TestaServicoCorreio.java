/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.teste;

import java.math.BigDecimal;
import java.util.List;
import org.tempuri.CResultado;
import org.tempuri.CServico;
import org.tempuri.CalcPrecoPrazoWS;

/**
 *
 * @author V_M_FT
 */
public class TestaServicoCorreio {

    public static void main(String[] args) {
        CalcPrecoPrazoWS servico = new CalcPrecoPrazoWS();

        CResultado resultado = servico.getCalcPrecoPrazoWSSoap().calcPrecoPrazo(null, null, "40010", "99150000", "99030050", "0.4", 1, new BigDecimal(50.0), new BigDecimal(50.0), new BigDecimal(50.0), new BigDecimal(50.0), "n", new BigDecimal(50.0), "n");

        List<CServico> list = resultado.getServicos().getCServico();

        try {

            for (CServico c : list) {

                System.out.println("" + c.getValor());

            }
        } catch (Exception e) {
            System.out.println("erro" + e);
        }
    }
    
}
