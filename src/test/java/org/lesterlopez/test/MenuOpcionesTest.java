package org.lesterlopez.test;

import org.junit.jupiter.api.Test;
import org.lesterlopez.operaciones.MenuOpciones;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MenuOpcionesTest {
    @Test
    void testOpcionOperacionSuma() {
        MenuOpciones menuOpciones = new MenuOpciones();
        double resultant = menuOpciones.opcionOperacion(5, 5, '+');
        assertEquals(10.0, resultant);
    }

    @Test
    void testOpcionOperacionResta() {
        MenuOpciones menuOpciones = new MenuOpciones();
        double resultant = menuOpciones.opcionOperacion(5, 2, '-');
        assertEquals(3.0, resultant);
    }

    @Test
    void testOpcionOperacionMultiplicacion() {
        MenuOpciones menuOpciones = new MenuOpciones();
        double resultant = menuOpciones.opcionOperacion(5, 5, '*');
        assertEquals(25.0, resultant);
    }

    @Test
    void testOpcionOperacionDivision() {
        MenuOpciones menuOpciones = new MenuOpciones();
        double resultant = menuOpciones.opcionOperacion(10, 2, '/');
        assertEquals(5.0, resultant);
    }
}
