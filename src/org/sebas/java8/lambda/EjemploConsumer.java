package org.sebas.java8.lambda;

import org.sebas.java8.lambda.models.Usuario;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class EjemploConsumer {
    public static void main(String[] args) {

        /*
            Una expresion lambda es usar un metodo sin necesidad de usar
            una clase, parte de que solo se usan cuando una interfaz tiene
            un unico metodo y debe ser abstracto, para cuando se use
            una expresion lambda ya se sabe a que metodo se refiere
         */

        /*
            Tambien hay interfaces especiales que nos permiten crear
            expresiones lambda de lo que queramos y cual nos permmite pasar
            un solo parametro de tipo generico
         */

        Consumer<String> consumer = saludo -> {
            System.out.println(saludo + ", Carlitos");
        };

        Consumer<Date> consumer1 = fecha -> {
            SimpleDateFormat patter = new SimpleDateFormat("dd/MM/yyyy");
            String fecharFormateada = patter.format(fecha);
            System.out.println(fecharFormateada);
        };

        //Para que funciona debemos llamar el metodo accept y pasar el parametro
        consumer.accept("Buen dia");
        consumer1.accept(new Date());


        //TODO: Podemos tener un consumer que reciba 2 parametros
        BiConsumer<String,Integer> consumer2 = (v1,v2) -> {
            System.out.println(v1 + " tiene " + v2 + " años");
        };
        consumer2.accept("pepe",20);


        //TODO: Metodo de referencia
        Consumer<String> consumer3 = System.out::println;
        consumer3.accept("Hola mundo desde el Consumer usando referencia de metodo o vicebersa");


        /*
            Los consumer se usan bastante en el API de Stream
         */
        List<String> nombres = Arrays.asList("Pepe","Lulu","Luna","Ana");
        nombres.forEach(consumer3);


        // TODO:  EJEMPLOS
        System.out.println("\n*************Ejemplos******************");
        Usuario usuario = new Usuario();
        BiConsumer<Usuario,String> asignarNombre = (persona,nombrePersona) ->{
            persona.setNombre(nombrePersona);
        };
        asignarNombre.accept(usuario,"Jose Luis");
        System.out.println("Nombre persona: " + usuario.getNombre());





        /*
            TODO: Supplier<Tipo dato a retornar>
            No recibe argumentos y solo devuelve un valor
         */

        Supplier<String> proveedor = () -> {
            return "Hello World Supplier";
        };
        System.out.println("\n********Supplier*************");
        System.out.println("Supplier: "+proveedor.get());


    }
}
