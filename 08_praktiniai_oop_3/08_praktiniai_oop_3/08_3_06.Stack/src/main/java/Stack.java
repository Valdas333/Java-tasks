import java.util.ArrayList;

public class Stack {

    ArrayList<String> list = new ArrayList<>();

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public void add(String value){
        list.add(0, value);
    }

    public ArrayList<String> values(){
        return list;
    }

    public String take(){
        String valueToReturn = list.get(0);
        list.remove(0);
        return valueToReturn;
    }
}
