package decorator.method.inheritance;

public class GreaterUpperCase extends GreeterImpl{
    @Override
    public String greet(String firstName, String lastName) {
        return super.greet(firstName, lastName).toUpperCase();
    }
}
