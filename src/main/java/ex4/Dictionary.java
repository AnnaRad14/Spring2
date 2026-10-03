package ex4;

import java.util.Map;

public class Dictionary {
    private Map<String, String> terms; // Наша майбутня Map

    public void setTerms(Map<String, String> terms) {
        this.terms = terms;
    }

    public void printDictionary() {
        System.out.println("--- Словник термінів Spring ---");
        for (Map.Entry<String, String> entry : terms.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
