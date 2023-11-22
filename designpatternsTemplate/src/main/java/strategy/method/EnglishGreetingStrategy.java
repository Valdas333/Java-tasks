package strategy.method;

public class EnglishGreetingStrategy implements GreeterLanguageStrategy{

    @Override
    public String getGreetingString(String firstName, String lastName) {
        return "Hello " + firstName + " " +lastName;
    }
}
