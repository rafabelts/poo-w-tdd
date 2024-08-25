package org.example;

import java.util.HashMap;
import java.util.Map;

public class App {

    private String ENGLISH = "english";
    private String SPANISH = "spanish";
    private String FRENCH = "french";

    // Creamos el hash map (estructura de datos) de los prefijos
    Map<String, String> prefixes = new HashMap<>();

    public App() {
        // Agregamos los datos al mapa .put(llave, valor)
        prefixes.put(ENGLISH, "Hello, ");
        prefixes.put(SPANISH, "Hola, ");
        prefixes.put(FRENCH, "Bonjour, ");
    }

    public String getPrefix(String language) {
        // Rule switch para retornar el prefijo de acuerdo al lenguaje
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
        // Obtenemos el prefijo
        String prefix = getPrefix(language);

        /*
            Condicional para verificar que si el nombre este vacio entonces retorne
            "Hello, World!"

            En Java existe un metodo para verificar que string 1 sea igual que un string 2
            string1.equals(string2) -> boolean (true or false)
            si son iguales retorna true
            sino retorna false
        */
        if (name.equals("")) {
            return "Hello, World!";
        }

        // Retornamos el prefijo y el nombre
        return prefix + name;
    }
}
