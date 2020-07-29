/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor04;

import java.util.Arrays;

/**
 *
 * @author Administrator
 */
public class Vetor04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vet[] = {3, 7, 6, 1, 9, 4, 2};
        for (int v : vet) {
            System.out.print(v + " ");
        }
        int p = Arrays.binarySearch(vet, 1);
        
        System.out.println("Encontrei " + p);
    }
    
}
