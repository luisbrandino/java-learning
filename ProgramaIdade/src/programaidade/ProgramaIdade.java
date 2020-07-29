/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaidade;

import java.util.Calendar;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Em que ano você nasceu?");
        int nasc = t.nextInt();
        int idade = Calendar.getInstance().get(Calendar.YEAR) - nasc;
        System.out.println("Você tem " + idade + " anos de idade");
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }
    
}
