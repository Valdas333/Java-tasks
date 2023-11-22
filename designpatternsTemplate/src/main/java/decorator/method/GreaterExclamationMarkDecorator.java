package decorator.method;

public class GreaterExclamationMarkDecorator extends GreeterDecorator{

    public GreaterExclamationMarkDecorator(Greeter greeter){
        super(greeter);
    }
    @Override
    public String greet(String firstName, String lastName) {
        return greeter.greet(firstName, lastName) + " !";
    }
}
