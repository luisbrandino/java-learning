package factorialgame;

public class Factorial {    
    public static String factText(int num) {
        String text = String.format("%s", num);
        int factExpression = num;
        
        for (int i = --num; i > 0; i--) {
            text += String.format(" x %s", i);
            factExpression *= i;
        }
        
        text += String.format(" = %s", factExpression);
        
        return text;
    }
}
