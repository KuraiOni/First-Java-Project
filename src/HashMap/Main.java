package HashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] arges) {
        HashMap<String, String> countries = new HashMap<>();

        countries.put("USA", "Washington DC");
        countries.put("Lebanon", "Beirut");
        countries.put("England", "London");
        countries.put("France", "Paris");

        // System.out.println(countries);
        // countries.remove("USA");
        // System.out.println(countries.get("Lebanon"));
        // countries.clear();
        // System.out.println(countries.size());
        // countries.replace("USA", "Detroit");
        // System.out.print(countries.containsKey("England"));
        // System.out.print(countries.containsValue("Beijing"));

        for (String i : countries.keySet()) {
            System.out.print(i + "\t" + " = ");
            System.out.println(countries.get(i));
        }
    }
}