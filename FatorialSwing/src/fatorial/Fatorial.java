package fatorial;

public class Fatorial {
    
    public static int fact(int num) {
        int result = num;
        
        while (num > 1) {
            num--;
            result *= num;
        }
        
        return result;
    }
}
