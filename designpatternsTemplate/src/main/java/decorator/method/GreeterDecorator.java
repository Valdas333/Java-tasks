package decorator.method;

public abstract class GreeterDecorator implements Greeter{
    protected Greeter greeter;

    public GreeterDecorator(Greeter greeter){
        this.greeter = greeter;
    }
}
