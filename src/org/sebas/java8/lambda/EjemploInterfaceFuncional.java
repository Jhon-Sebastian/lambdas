package org.sebas.java8.lambda;

import org.sebas.java8.lambda.aritmetica.Aritmetica;
import org.sebas.java8.lambda.aritmetica.Calculadora;

public class EjemploInterfaceFuncional {
    public static void main(String[] args) {

        /*
            Podemos usar las expresiones lambda que viene o
            podemos implementar nuestras porpias expresiones
         */

        Aritmetica suma = (a,b) -> a+b;
        Aritmetica resta = (a,b) -> a-b;
        Aritmetica multiplicacion = (a,b) -> a*b;
        Aritmetica division = (a,b) -> a/b;

        Calculadora cal = new Calculadora();
        System.out.println(cal.computar(10, 5, suma));
        System.out.println(cal.computar(10, 5, resta));
        System.out.println(cal.computar(10, 5, multiplicacion));
        System.out.println(cal.computar(10, 5, division));
        System.out.println(cal.computar(10, 5, (a,b) -> a*b));

        System.out.println("\n"+cal.computarConBiFunction(10,5, (a,b) -> a+b));

        
    }
}
