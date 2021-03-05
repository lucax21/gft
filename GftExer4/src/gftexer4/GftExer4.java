/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gftexer4;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class GftExer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int sum=0;
         do{
             System.out.print("Digite um número:");
             int n = sc.nextInt();
             
             if(n >= 0){
                sum +=n;
             }else{
                 System.out.print("Numeros negativos não são permitidos");
             }
             
//             System.out.print(sum);
             
         }while (sum <= 157);
        
         System.out.print("O somatório foi:" + sum);
         
        sc.close();
    }
    
}
