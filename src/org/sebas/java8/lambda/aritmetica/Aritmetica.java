package org.sebas.java8.lambda.aritmetica;

// Es opcional, pero aporta semantica
@FunctionalInterface
public interface Aritmetica {

    /*
        Podemos nuestras propias expresiones lambdas para ello
        se requiere una interfaz con un unico metodo asbtracto
     */
    double operacion(double a, double b);

}
