package template.method;

public class Main {
    public static void main(String[] args) {
        LithuanianGreeter greeterLT = new LithuanianGreeter();
        greeterLT.greet("Jonas", "Petraitis");
        EnglishGreeter greeterEN = new EnglishGreeter();
        greeterEN.greet("John","Wick");
    }

}
