package decorator.method;

public class GreaterExclamationMarkDecorator extends GreeterDecorator{

    public GreaterExclamationMarkDecorator(Greeter greeter){
        super(greeter);
    }

    public String greetWithExclamationMark() {
        return " !";
    }

    @Override
    public String greet(String firstName, String lastName) {
        return super.greet(firstName, lastName) + greetWithExclamationMark();
    }
}
