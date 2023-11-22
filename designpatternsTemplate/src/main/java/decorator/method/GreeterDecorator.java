package decorator.method;

public abstract class GreeterDecorator implements Greeter{

    private Greeter greeter;

    public GreeterDecorator(Greeter greeter){
        this.greeter = greeter;
    }

    @Override
    public String greet(String firstName, String lastName) {
        return greeter.greet(firstName, lastName);
    }
}
