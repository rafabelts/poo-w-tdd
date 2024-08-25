package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AppTest {

    App classToTest = new App();

    @Test
    @DisplayName("Test get prefix")
    void testGetPrefix() {
        String got = classToTest.getPrefix("french");

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
        String got = classToTest.getGreeting(name, "");

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
        String got = classToTest.getGreeting(name, "spanish");

        assertEquals(
            "Hola, " + name,
            got,
            "Error. \"Queriamos recibir saludo con nombre en espaniol\""
        );
    }
}
