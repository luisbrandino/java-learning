package programapernas;

import java.util.Scanner;

public class ProgramaPernas {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        String tipo;
        
        System.out.println("Quantas pernas?");
        
        int qtnPernas = keyboard.nextInt();
        
        System.out.println("Isso é um(a) ");
        switch (qtnPernas) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
        }
        
        System.out.println(tipo);
    }
    
}
