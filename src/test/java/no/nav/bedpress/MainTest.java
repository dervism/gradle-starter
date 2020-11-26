package no.nav.bedpress;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void shouldSayHelloWorld() {
        Main main = new Main();
        assertEquals("Hello, world!", main.sayHelloWorld());
    }
}