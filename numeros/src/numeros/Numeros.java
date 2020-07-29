/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, s = 0;
        String resp;
        Scanner teclado = new Scanner(System.in);
       
        do {
            System.out.println("Digite um número: ");
            n = teclado.nextInt();
            s += n;
            System.out.print("Quer continuar? [S/N] ");
            resp = teclado.next();
        } while (resp.equalsIgnoreCase("S"));
        
        System.out.println("A soma de todos os valores é " + s);
    }
    
}
