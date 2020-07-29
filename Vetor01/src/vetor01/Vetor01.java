/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor01;

/**
 *
 * @author Administrator
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n[] = {3, 2, 8, 7, 5, 4};
        
        System.out.println("Total de casas de N " + n.length);
        
        for (int i = 0; i < n.length; i++) {
            System.out.println(String.format("Na casa %s, temos o valor %s", i, n[i]));
        }
    }
    
}
