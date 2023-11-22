package strategy.method;

public class EndOfSentenceExclamationStrategy implements GreeterLanguageStrategy{

    private GreeterLanguageStrategy baseStrategy;
    public EndOfSentenceExclamationStrategy(GreeterLanguageStrategy baseStrategy){
        this.baseStrategy = baseStrategy;
    }
    @Override
    public String getGreetingString(String firstName, String lastName) {
        return baseStrategy.getGreetingString(firstName,lastName) + "!";
    }
}
