public class CustomTacoBox implements TacoBox{

    int tacos;

    public CustomTacoBox(int tacos) {
        this.tacos = tacos;
    }

    @Override
    public int tacosRemaining() {
        return this.tacos;
    }

    @Override
    public void eat() {
        if (tacos >= 1){tacos --;}

    }
}
