package strategy.method;

public class Main {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        greeter.setGreet(new EndOfSentenceExclamationStrategy(new LithuanianGreetingStrategy()));
        greeter.greet("Jonas", "Baranauskas");

        greeter.setGreet(new EndOfSentenceTripleExclamtionStrategy(new EnglishGreetingStrategy()));
        greeter.greet("Ace","Ventura");

        greeter.setGreet(new EndOfSentenceTripleExclamtionStrategy(new LithuanianGreetingStrategy()));
        greeter.greet("Ace","Ventura");

    }
}
