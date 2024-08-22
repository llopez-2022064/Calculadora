package org.lesterlopez.test;

import org.junit.jupiter.api.Test;
import org.lesterlopez.operaciones.Division;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DivisionTest {
    @Test
    void testOperar() {
        Division division = new Division();
        assertEquals(2.0, division.operar(10, 5));
        assertEquals(-2.0, division.operar(-10, 5));
    }
}
