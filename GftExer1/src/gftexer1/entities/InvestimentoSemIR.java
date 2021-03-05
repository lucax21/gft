/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gftexer1.entities;

/**
 *
 * @author lucas
 */
public class InvestimentoSemIR extends Investidor{
    
    public InvestimentoSemIR(double valorInicial, double jurosMensal) {
        super(valorInicial, jurosMensal);
    }
    
@Override
public double calcularLucro(int meses){
    
    if(super.calcularLucro(meses) < 1000.0){
        System.out.println("“O valor Inicial não pode ser menor que R$1000”");
            return 0;
    }
    return 0;
}


}
