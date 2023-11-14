
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String longest(){
        int stringSize = 0;
        String longestString = "";
        if (elements.isEmpty()){
            return null;
        }

        for (String item:
             elements) {if (item.length() > stringSize){
            longestString = item;
            stringSize = item.length();
        }
        }
        return longestString;
    }
}
