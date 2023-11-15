package lt.techin.oop;

public class Bird extends Animal {

    public Bird() {
        super("Blue", 2, true);
    }

    @Override
    public String getDescription() {
        return "This animal is mostly blue. It has 2 paws and no fur. Moreover, it has 2 wings and can fly.";
    }
}
