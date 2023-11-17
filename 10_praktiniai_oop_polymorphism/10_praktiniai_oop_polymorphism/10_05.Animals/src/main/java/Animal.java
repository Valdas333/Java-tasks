abstract class Animal{

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("Animal eats");
    }

    public void sleep(){
        System.out.println("Animal sleeping");
    }
}
