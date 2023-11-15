package lt.techin.oop;

public class Dog extends Animal{

    public Dog() {
        super("Brown", 4, true);
    }

    @Override
    public String getDescription() {
        return "This animal is mostly brown. It has 4 paws and a fur.";
    }
}
