/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cachorro;

/**
 *
 * @author Administrator
 */
public class Cachorro {
    private String name = "Rex"; // default
    
    /**
     *
     * @param inputName
     */
    public Cachorro(String inputName) {
        name = inputName;
    }
    
    private static String concat(String a, String b) {
        return a + b;
    }
    
    public void latir(String message) {
        System.out.println(concat("Au au au! ", concat(name, concat(" says: ", message))));
    }
}
