package org.sebas.java8.lambda;

import org.sebas.java8.lambda.models.Usuario;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EjemploPredicate {
    public static void main(String[] args) {

        /*
            TODO: Predicate
            Evalua una expresion y retorna un booleano
            Recibe por argumento
         */
        Predicate<Integer> t1 = number  -> number > 10;
        boolean result = t1.test(9);
        System.out.println("9 > 10: " + result);

        Predicate<String> t2 = role -> role.equals("ROLE_ADMIN");
        System.out.println("ROLE_USER == ROLE_ADMIN: " + t2.test("ROLE_USER"));


        /*
            TODO: BIPREDICATE
            Es igual pero recibe 2 argumentos y devuelve un boolean
         */
        BiPredicate<String, String> t3 = String::equals;
        System.out.println("Luis == luis: " + t3.test("Luis","luis"));

        BiPredicate<Integer, Integer> t4 = (i,j) -> i > j;
        boolean resultadoComparacion = t4.test(4,5);
        System.out.println("4 > 5: " + resultadoComparacion);


        /////////////////
        Usuario u1 = new Usuario();
        Usuario u2 = new Usuario();
        u1.setNombre("Alejandra");
        u2.setNombre("Alejandra");
        BiPredicate<Usuario, Usuario> t5 = (a,b) -> a.getNombre().equals(b.getNombre());
        System.out.println("Alejandra == Alejandra: " + t5.test(u1,u2));




    }
}
