/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogorepeticao;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class JogoRepeticao {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int n;
        int totalVal,totalPares, totalImpares, acimaCem, somaTotal;
        totalVal = totalPares = totalImpares = acimaCem = somaTotal = 0;
        double media;
        
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número:\n(0 interrompe) "));
            
            if (n == 0) break;
            
            totalVal++;
            somaTotal += n;
            
            if (n % 2 == 0) totalPares++;
            if (n > 100) acimaCem++;
                
        } while (n != 0);
        
        totalImpares = totalVal - totalPares;
        media = (double) (somaTotal /totalVal);
        
        String message;
        
        message = String.format("Resultado:\n----------------\nTotal valores: %s\nTotal pares: %s\nTotal ímpares: %s\nAcima de 100: %s\nMédia dos valores: %s", totalVal, totalPares, totalImpares, acimaCem, media);
        JOptionPane.showMessageDialog(null, message);
    }
    
}
