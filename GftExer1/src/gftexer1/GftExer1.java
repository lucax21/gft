/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gftexer1;

import gftexer1.entities.Investidor;
import gftexer1.entities.InvestimentoComIR;
import gftexer1.entities.InvestimentoSemIR;

/**
 *
 * @author lucas
 */
public class GftExer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Investidor i1 = new InvestimentoSemIR(123.2,2.2);
        
        Investidor i2 = new InvestimentoComIR(123.2,2.2);
        
        System.out.print(i1.calcularLucro(17));
        System.out.print(i2.calcularLucro(10));
        
    }
    
}
