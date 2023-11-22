package decorator.method.inheritance;

public class Main {
    public static void main(String[] args) {
        Greeter greeter = new GreeterExclamationMark();
        System.out.println(greeter.greet("Petras","Petrauskas"));

        Greeter greeter1 = new GreaterUpperCase();
        System.out.println(greeter1.greet("Jonas", "Jonauskas"));
    }
}
