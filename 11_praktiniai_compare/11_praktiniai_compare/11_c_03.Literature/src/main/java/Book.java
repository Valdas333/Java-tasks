import java.util.ArrayList;

public class Book implements Comparable<Book>{

    private String name;
    private int recommendedAge;

    private ArrayList<Book> books = new ArrayList<>();

    public Book(String name, int recommendedAge) {
        this.name = name;
        this.recommendedAge = recommendedAge;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRecommendedAge(int recommendedAge) {
        this.recommendedAge = recommendedAge;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public String getName() {
        return name;
    }

    public int getRecommendedAge() {
        return recommendedAge;
    }

    @Override
    public String toString() {
        return this.name + " (recommended for" + this.recommendedAge + "year-olds or older)";
    }

    public void printBooks(){
        System.out.println("Books:");
        for (Book book: books) {
            System.out.println(book);
        }
    }

    @Override
    public int compareTo(Book o) {
        return this.recommendedAge - o.recommendedAge;
    }
}
