package staticmethods;

public class StaticMethods {
    public static void main(String[] args) {
        Person alice = new Person("Alice");
        Person bob = new Person("Bob");
        
        System.out.println(alice.doGreetins(alice));
        
    }
}