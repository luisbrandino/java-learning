/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor08;

import java.util.Arrays;

/**
 *
 * @author Administrator
 */
public class Vetor08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int v[] = new int[20];
        Arrays.fill(v, 0);
        for (int valor : v) {
            System.out.println(valor);
        }
    }
    
}
