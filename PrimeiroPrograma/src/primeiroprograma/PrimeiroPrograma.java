package primeiroprograma;

import cachorro.Cachorro;

public class PrimeiroPrograma {
    public static String concat(String text1, String text2) {
        return text1 + text2;
    }
    
    public void main(String[] args) {
        Cachorro rex;
        rex = new Cachorro("Bobby");
        
        rex.latir("Olá mundo!");
    }
}
