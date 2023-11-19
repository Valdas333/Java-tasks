
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();
        String bookName = "";
        int ageRecom = 0;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Input the name of the book, empty stops: ");
            bookName = scanner.nextLine();
            if (bookName.isEmpty()){
                break;
            }
            System.out.print("Input the age recommendation: ");
            ageRecom = Integer.parseInt(scanner.nextLine());
            books.add(new Book(bookName, ageRecom));
        }
        System.out.println(books.size() +" books in total.");
        System.out.println("Books: ");
        Comparator<Book> comparator = Comparator.comparing(Book::getRecommendedAge).thenComparing(Book::getName);
        Collections.sort(books,comparator);
        for (Book book: books) {
            System.out.println(book);
        }
    }
}
