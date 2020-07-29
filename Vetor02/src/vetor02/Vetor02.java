/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor02;

import java.util.Calendar;

/**
 *
 * @author Administrator
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Maio", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int totalDias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        
        for (int i = 0; i < mes.length; i++) {
            if (mes[i] == "Fev") {
                if (anoAtual % 4 == 0) totalDias[i] = 29;
            }
            
            System.out.println(String.format("O mês %s possui %s dias.", mes[i], totalDias[i]));
        }
    }
    
}
