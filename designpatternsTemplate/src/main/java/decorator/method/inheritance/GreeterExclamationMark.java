package decorator.method.inheritance;

public class GreeterExclamationMark extends GreeterImpl {
    @Override
    public String greet(String firstName, String lastName) {
        return super.greet(firstName, lastName) + " !";
    }
}
