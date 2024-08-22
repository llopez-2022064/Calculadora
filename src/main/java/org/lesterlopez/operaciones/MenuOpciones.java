package org.lesterlopez.operaciones;

import org.lesterlopez.interfaz.InterfazOperacion;

public class MenuOpciones {
    public double opcionOperacion(double num1, double num2, char signo){
        InterfazOperacion operacion = (signo == '+') ? new Suma() :
                (signo == '-') ? new Resta() :
                        (signo == '*') ? new Multiplicacion() :
                                (signo == '/') ? new Division() :
                                        null;

        return operacion.operar(num1, num2);
    }
}