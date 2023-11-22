package decorator.method;

public class GreeterUpperCaseDecorator extends GreeterDecorator{

    public GreeterUpperCaseDecorator(Greeter greeter) {
        super(greeter);
    }

    @Override
    public String greet(String firstName, String lastName) {
        return super.greet(firstName, lastName).toUpperCase();
    }
}
