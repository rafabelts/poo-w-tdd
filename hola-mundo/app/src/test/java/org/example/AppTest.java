package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AppTest {

    /* Creo instancia de la clase App la cual se probara, esta funciona como
     campo de la clase AppTest */
    App classToTest = new App();

    // Anotacion de que la función es un test
    @Test
    // Nombre a mostrar tests
    @DisplayName("Test get prefix")
    void testGetPrefix() {
        // Probamos el metodo del prefijo en idioma frances
        String got = classToTest.getPrefix("french");

        // Checamos que el resultado sea lo que esperabamos
        assertEquals(
            "Bonjour, ",
            got,
            "Error. \"Queriamos recibir el prefijo en frances\""
        );
    }

    @Test
    @DisplayName("Test hola con name vacio")
    void testGreetingVoid() {
        String name = "";

        // Probamos el metodo del saludo con nombre e idioma vacio
        String got = classToTest.getGreeting(name, "");

        // Checamos que el resultado sea lo que esperabamos
        assertEquals(
            "Hello, World!",
            got,
            "Error. Si name == '' debemos obtener un Hello, World!"
        );
    }

    @Test
    @DisplayName("Test hola")
    void testGreeting() {
        String name = "Rafa";
        // Probamos el metodo del saludo con un nombre
        String got = classToTest.getGreeting(name, "spanish");

        // Checamos que el resultado sea lo que esperabamos
        assertEquals(
            "Hola, " + name,
            got,
            "Error. \"Queriamos recibir saludo con nombre en espaniol\""
        );
    }
}
