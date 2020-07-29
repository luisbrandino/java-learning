package programamedia;

import java.util.Scanner;

public class ProgramaMedia {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        float nota1 = keyboard.nextFloat();
        float nota2 = keyboard.nextFloat();
        float media = (nota1+nota2)/2;
        
        System.out.println("Sua média foi " + media);
        
        if (media > 9) {
            System.out.println("Parabéns");
        }
    }
    
}
