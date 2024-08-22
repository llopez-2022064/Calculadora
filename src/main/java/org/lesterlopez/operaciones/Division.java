package org.lesterlopez.operaciones;

import org.lesterlopez.interfaz.InterfazOperacion;

public class Division implements InterfazOperacion {
    private static final double CERO = 0.0;

    @Override
    public double operar(double num1, double num2){
        if (num2 == CERO) {
            throw new ArithmeticException("No se puede dividir con 0");
        }
        return num1 / num2;
    }
}
