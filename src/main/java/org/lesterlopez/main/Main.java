package org.lesterlopez.main;

import org.lesterlopez.operaciones.MenuOpciones;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        MenuOpciones menuOpciones = new MenuOpciones();

        logger.info("Resultado de la suma", menuOpciones.opcionOperacion(4, 5, '+'));
        logger.info("Resultado de la resta", menuOpciones.opcionOperacion(15, 5, '-'));
        logger.info("Resultado de la multiplicación", menuOpciones.opcionOperacion(5, 5, '*'));
        logger.info("Resultado de la división", menuOpciones.opcionOperacion(10, 2, '/'));
    }
}
