package org.lesterlopez.test;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;
import org.lesterlopez.interfaz.InterfazOperacion;
import org.lesterlopez.operaciones.*;
import org.mockito.Mockito;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MenuOpcionesTest {
    @Test
    void testOpcionOperacionSuma() {
        // Crear un mock de la interfaz InterfazOperacion
        InterfazOperacion mockSuma = Mockito.mock(Suma.class);

        // Configurar el mock para que retorne un valor específico
        Mockito.when(mockSuma.operar(5, 5)).thenReturn(10.0);

        // Crear una instancia de MenuOpciones y usar el mock
        MenuOpciones menuOpciones = new MenuOpciones();
        double resultant = menuOpciones.opcionOperacion(5, 5, '+');

        // Verificar que el metodo retorna el valor esperado
        assertEquals(10.0, resultant);
    }

    @Test
    void testOpcionOperacionResta() {
        InterfazOperacion mockResta = Mockito.mock(Resta.class);

        Mockito.when(mockResta.operar(5, 2)).thenReturn(3.0);

        MenuOpciones menuOpciones = new MenuOpciones();
        double resultant = menuOpciones.opcionOperacion(5,2,'-');

        assertEquals(3.0, resultant);
    }

    @Test
    void testOpcionOperacionMultiplicacion() {
        InterfazOperacion mockMultiplicacion = Mockito.mock(Multiplicacion.class);

        Mockito.when(mockMultiplicacion.operar(5,5)).thenReturn(25.0);

        MenuOpciones menuOpciones = new MenuOpciones();
        double resultant = menuOpciones.opcionOperacion(5,5,'*');

        assertEquals(25.0, resultant);
    }

    @Test
    void testOpcionOperacionDivision() {
        InterfazOperacion mockDivision = Mockito.mock(Division.class);

        Mockito.when(mockDivision.operar(10,2)).thenReturn(5.0);

        MenuOpciones menuOpciones = new MenuOpciones();
        double resultant = menuOpciones.opcionOperacion(10,2,'/');

        assertEquals(5, resultant);
    }
}
