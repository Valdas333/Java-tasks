package strategy.method;

public class EndOfSentenceTripleExclamtionStrategy implements GreeterLanguageStrategy{
    private GreeterLanguageStrategy baseStrategy;
    public EndOfSentenceTripleExclamtionStrategy(GreeterLanguageStrategy baseStrategy){
        this.baseStrategy = baseStrategy;
    }
    @Override
    public String getGreetingString(String firstName, String lastName) {
        return baseStrategy.getGreetingString(firstName,lastName) + "!!!";
    }
}
