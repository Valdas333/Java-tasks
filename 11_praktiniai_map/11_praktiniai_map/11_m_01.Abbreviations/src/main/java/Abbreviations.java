import java.util.HashMap;

public class Abbreviations {

    HashMap<String, String> abbreviationsHashMap = new HashMap<>();
    public Abbreviations() {
    }

    public void addAbbreviation(String abbreviation, String explanation){
        abbreviationsHashMap.put(abbreviation,explanation);
    }

    public boolean hasAbbreviation(String abbreviation){
        return abbreviationsHashMap.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation){
        return abbreviationsHashMap.get(abbreviation);
    }
}
