package org.lesterlopez.main;

import org.lesterlopez.operaciones.MenuOpciones;

public class Main {
    public static void main(String[] args) {
        MenuOpciones menuOpciones = new MenuOpciones();

        System.out.println(menuOpciones.opcionOperacion(4,5,'+'));
        System.out.println(menuOpciones.opcionOperacion(15,5,'-'));
        System.out.println(menuOpciones.opcionOperacion(5,5,'*'));
        System.out.println(menuOpciones.opcionOperacion(10,2,'/'));

    }
}