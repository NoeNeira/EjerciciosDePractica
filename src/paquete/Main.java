package paquete;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        String nombre = "Noe";

        System.out.println("Bienvenida" + " " + nombre);

        String variable = "Primer Intento";
        variable = "Segundo Intento";

       System.out.println(variable);

       int valorNum1 = 20;
       int valorNum2 = 2;

       System.out.println(valorNum1 + valorNum2);
       System.out.println(valorNum1 - valorNum2);
       System.out.println(valorNum1 * valorNum2);
       System.out.println(valorNum1 / valorNum2);


       int valorNum3 = 10;
       int valorNum4 = valorNum3 + 1;

       System.out.println(valorNum4);

       int arrayNum5[] = {1, 2, 0, 7, 9};

       System.out.println(arrayNum5[2]);

       String arrayDeCaracteres[] = {"Noe", "Neira"};

       System.out.println( "Mi nombre es: " + arrayDeCaracteres[0] +" " + arrayDeCaracteres[1]);

       int arrayNum6[] = {1, 7, 3, 0, 1, 5};
       System.out.println( "Este array contiene " + arrayNum6.length + " elementos");

       String arrayDeCaracteres2[] = new String[4];
       int size = arrayDeCaracteres2.length;
       arrayDeCaracteres2 [0] = "Primero";
       arrayDeCaracteres2 [size-1] = "Último";

       System.out.println(arrayDeCaracteres2 [0]);
       System.out.println(arrayDeCaracteres2 [size-1]);

    }
}