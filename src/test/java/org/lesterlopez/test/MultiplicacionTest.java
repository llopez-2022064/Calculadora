package org.lesterlopez.test;

import org.junit.jupiter.api.Test;
import org.lesterlopez.operaciones.Multiplicacion;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplicacionTest {
    @Test
    void testOperar() {
        Multiplicacion multiplicacion = new Multiplicacion();
        assertEquals(25.0, multiplicacion.operar(5, 5));
        assertEquals(-25.0, multiplicacion.operar(-5, 5));
    }
}
