package org.example;

import java.util.HashMap;
import java.util.Map;

public class App {

    private String ENGLISH = "english";
    private String SPANISH = "spanish";
    private String FRENCH = "french";

    Map<String, String> prefixes = new HashMap<>();

    public App() {
        prefixes.put(ENGLISH, "Hello, ");
        prefixes.put(SPANISH, "Hola, ");
        prefixes.put(FRENCH, "Bonjour, ");
    }

    public String getPrefix(String language) {
        switch (language) {
            case "spanish" -> {
                return prefixes.get(SPANISH);
            }
            case "french" -> {
                return prefixes.get(FRENCH);
            }
            default -> {
                return prefixes.get(ENGLISH);
            }
        }
    }

    public String getGreeting(String name, String language) {
        String prefix = getPrefix(language);
        if (name.equals("")) {
            return "Hello, World!";
        }

        return prefix + name;
    }
}
