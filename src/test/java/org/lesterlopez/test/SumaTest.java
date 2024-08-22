package org.lesterlopez.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.lesterlopez.operaciones.Suma;

class SumaTest {
    @Test
    void testOperar() {
        Suma suma = new Suma();
        assertEquals(10.0, suma.operar(5, 5));
        assertEquals(0.0, suma.operar(-5, 5));
    }
}
