import java.util.HashMap;

public class Abbreviations {
    private HashMap<String,String> mp;

    public Abbreviations() {
        mp = new HashMap<>();
    }
    public void addAbbreviation(String abbreviation, String explanation) {
        mp.put(abbreviation,explanation);
    }
    public boolean hasAbbreviation(String abbreviation){
        return mp.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation){
        return mp.get(abbreviation);
    }
}


