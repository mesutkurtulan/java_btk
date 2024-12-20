package HashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> dictionary = new HashMap<String, String>();
        dictionary.put("apple", "elma");
        dictionary.put("banana", "muz");
        dictionary.put("cherry", "kiraz");
        System.out.println("Dictionary: " + dictionary); // Dictionary: {banana=muz, apple=elma, cherry=kiraz}

        for (String key : dictionary.keySet()) {
            System.out.println("Key: " + key + ", Value: " + dictionary.get(key));
        }
        System.out.println(dictionary.get("apple")); // elma

        dictionary.remove("apple");
        dictionary.clear();

        System.out.println(dictionary.get("apple")); // null
        System.out.println(dictionary.size()); // 0

    }
}
