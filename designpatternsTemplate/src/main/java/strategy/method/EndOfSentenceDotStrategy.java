package strategy.method;

public class EndOfSentenceDotStrategy implements GreeterLanguageStrategy{
    private GreeterLanguageStrategy baseStrategy;
    public EndOfSentenceDotStrategy(GreeterLanguageStrategy baseStrategy){
        this.baseStrategy = baseStrategy;
    }
    @Override
    public String getGreetingString(String firstName, String lastName) {
        return baseStrategy.getGreetingString(firstName,lastName) + ".";
    }
}
