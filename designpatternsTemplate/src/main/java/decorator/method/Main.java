package decorator.method;

public class Main {

    public static void main(String[] args) {
        Greeter greeter = new GreaterExclamationMarkDecorator(new GreeterImpl());
        System.out.println(greeter.greet("Jonas","Baranauskas"));

        Greeter greeterUpper = new GreeterUpperCaseDecorator(new GreeterImpl());
        System.out.println(greeterUpper.greet("jonas","baranauskas"));
    }

}
