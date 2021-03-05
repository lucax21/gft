/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gftexer3;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class GftExer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        int mul, ini, fim;
        
        do{
            System.out.print("Multiplicando");
            mul = sc.nextInt();
            System.out.print("Inicio do interlavo");
            ini = sc.nextInt();
            System.out.print("Intervalo");
            fim = sc.nextInt();
            

        }while(validaInput(mul) && validaInput(ini) && validaInput(fim));
        
        if(fim-ini > 10){
            System.out.println("Intervalo invalido");
            
        }else{
            if(ini > fim){
            System.out.println("Inicio nao pode ser maior que fim");
            }else{
                for(; ini<=fim;ini++){
                    System.out.println(mul + " * " + ini + " = " + mul*ini);
                }
            }
        }

        
        sc.close();
    }
         static boolean validaInput(int input){
            
            return input >= 0 && input < 5000 ? true : false;
        }
}
