package org.sebas.java8.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFunction {
    public static void main(String[] args) {

        /*
            Recibe un argumento y tambien devuelve un valor,
            es una combinacion entre Consumer y Supplier

            Function< TipoValorRecibe , TipoValorDevuelve >
         */
        Function<String,Integer> f1 = param -> {
            return Integer.parseInt(param);
        };
        Function<String,Integer> f1Simplificado = Integer::parseInt;
        System.out.println("Function 1: " + f1.apply("12345"));

        //Usando metodo de referencia para simplificar
        //Lo que se recibe se pasa en algun metodo -> [ v -> v.toUpperCase() ]
        Function<String,String> f2 = String::toUpperCase;
        System.out.println("Function 2: "+f2.apply("andres"));



        /*
            TODO: BiFunction
            Recibe 2 parametros y devuelve un valor
            BiFunction < Tipo1, Tipo2, TipoDevolver >
         */
        BiFunction<String, String, String> f3 = (a,b) -> {
            return  a.toUpperCase().concat(b.toUpperCase());
        };
        System.out.println("Function 3: " + f3.apply("jose","luis"));

        //***************************
        BiFunction<String, String, Integer> f4 = (a,b) -> {
            int sum = Integer.parseInt(a) + Integer.parseInt(b);
            return sum;
        };
        System.out.println("Suma de (5+6)= " + f4.apply("5","6"));




    }
}
