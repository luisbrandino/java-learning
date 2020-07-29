/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor03;

import java.util.Arrays;

/**
 *
 * @author Administrator
 */
public class Vetor03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double v[] = {3.5, 2.7, 1.4, 6.3, 3.2, 1.9, 3};
        
        Arrays.sort(v);
        
        for (double value : v) {
            System.out.println(value);
        }
    }
    
}
