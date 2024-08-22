package org.lesterlopez.operaciones;

import org.lesterlopez.interfaz.InterfazOperacion;

public class Resta implements InterfazOperacion {
    @Override
    public double operar(double num1, double num2){
        return num1 - num2;
    }
}
