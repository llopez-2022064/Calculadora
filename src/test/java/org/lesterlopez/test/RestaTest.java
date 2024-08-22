package org.lesterlopez.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.lesterlopez.operaciones.Resta;

class RestaTest {
    @Test
    void testOperar() {
        Resta resta = new Resta();
        assertEquals(10.0, resta.operar(15, 5));
        assertEquals(-10.0, resta.operar(-5, 5));
    }
}
