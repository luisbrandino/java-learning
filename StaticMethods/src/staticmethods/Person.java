package staticmethods;

public class Person {
    private final String name;
    
    public Person(String name) {
        this.name = name;
    }
    
    private String concat(String ... texts) {
        String finalText = "";
        
        for (int i = 0; i < texts.length; i++) {
            String currentText = texts[i];
            
            finalText += currentText;
        }
        
        return finalText;
    }
    
    public String getName() {
        return name;
    }
    
    public String doGreetins(Person personMeeting) {
        if (personMeeting == this) {
            return "You are a little alone, aren't you?";
        }
        
        String personMeetingName = personMeeting.getName();
        
        return concat("Hello ", personMeetingName, "! ", "Nice to meet you, my name is ", name, ".");
    }
}
