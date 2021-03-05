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
public class InvestimentoComIR extends Investidor{
    
    public InvestimentoComIR(double valorInicial, double jurosMensal) {
        super(valorInicial, jurosMensal);
    }
    
        @Override
    public double calcularLucro(int meses){
        super.calcularLucro(meses);
        if(meses < 6){
            return super.calcularLucro(meses) - (super.calcularLucro(meses)*1.22);
        }
        if(meses >= 6 && meses <12){
            return super.calcularLucro(meses) - (super.calcularLucro(meses)*1.20);
        }
        if(meses >= 12 && meses < 24){
            return super.calcularLucro(meses) - (super.calcularLucro(meses)*1.17);
        }
        if(meses >= 24){
            return super.calcularLucro(meses) - (super.calcularLucro(meses)*1.15);
        }
        
        return 0;
    }
    
}
