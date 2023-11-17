public class Book implements Packable{

    private String authorBook;
    private String nameBook;
    private double weightBook;


    public Book(String authorBook, String nameBook, double weightBook) {
        this.authorBook = authorBook;
        this.nameBook = nameBook;
        this.weightBook = weightBook;
    }

    @Override
    public double weight() {
        return weightBook;
    }

    @Override
    public String toString() {
        return authorBook + ": " + nameBook;
    }
}
