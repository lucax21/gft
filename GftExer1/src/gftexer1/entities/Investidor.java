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
public class Investidor {
    private double valorInicial;
    private double jurosMensal;

    public Investidor(double valorInicial, double jurosMensal) {
        this.valorInicial = valorInicial;
        this.jurosMensal = jurosMensal;
    }

    public double getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
    }

    public double getJurosMensal() {
        return jurosMensal;
    }

    public void setJurosMensal(double jurosMensal) {
        this.jurosMensal = jurosMensal;
    }
    
    public double calcularLucro(int meses){
        
        return (valorInicial * Math.pow(1.0 + jurosMensal ,meses) - valorInicial);
    }
}
