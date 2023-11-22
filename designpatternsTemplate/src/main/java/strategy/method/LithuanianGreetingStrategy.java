package strategy.method;

public class LithuanianGreetingStrategy implements GreeterLanguageStrategy{

    @Override
    public String getGreetingString(String firstName, String lastName) {
        return "Labas " + firstName + " " + lastName;
    }
}
