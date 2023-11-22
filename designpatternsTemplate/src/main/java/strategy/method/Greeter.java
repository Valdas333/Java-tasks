package strategy.method;

public class Greeter {


    private GreeterLanguageStrategy greeterLanguageStrategy;
    public void setGreet(GreeterLanguageStrategy greeterLanguageStrategy){
        this.greeterLanguageStrategy = greeterLanguageStrategy;
    }

    public void greet(String firstName, String lastName){
        System.out.println(greeterLanguageStrategy.getGreetingString(firstName, lastName));
    }

}



