
import java.util.HashMap;

public class Program {

    public static void printValues(HashMap<String,Book> hashmap){
        for (String book:hashmap.keySet()) {
            System.out.println(hashmap.get(book).toString());
        }
    }

    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text){
        for (String book:hashmap.keySet()) {
            if (hashmap.get(book).getName().contains(text)){
                System.out.println(hashmap.get(book));
            }
        }
    }
    public static void main(String[] args) {
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("pride", 1813, "...."));
        hashmap.put("happy", new Book("Don't let the pigeon drive the bus", 2003, "...."));
        printValueIfNameContains(hashmap, "p");
    }

}
