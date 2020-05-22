package ejerciciosZac;

/*
Ejercicio 18
a) Escribir un programa que pida por pantalla un texto y a continuacion lo imprima de
atras para adelante. Para obtener las letras de una cadena de caracteres pueden utilizar
el metodo charAt de String. Por ejemplo, cadena.charAt(0) devuelve el primer
caracter del String cadena.
b) Mover el codigo que imprime la cadena al reves a un metodo
static void imprimirReversa(String cadena)
c) Escribir un metodo static String reversa(String cadena) que dado un String, devuelve
otro String con los caracteres invertidos. Por ejemplo, reversa(``hola'') debera
devolver el String `` aloh''.
d) Modicar el metodo imprimirReversa para que utilice el metodo denido en el punto
anterior.
 */

public class Ejercicio18 {
    public static void main(String[] args) {
        String cadena = "Hello";
        imprimirReversa(cadena);
        imprimirReverse("Aloha");
    }

    static void imprimirReversa(String cadena) {
        String acumuladorDeNuevoTexto = "";

        for (int i = cadena.length() - 1; i >= 0; i--) {
            acumuladorDeNuevoTexto += cadena.charAt(i); // acumuladorDeNuevoTexto = acumuladorDeNuevoTexto + cadena.chart(i);
        }
        System.out.println(acumuladorDeNuevoTexto);

    }

    static void imprimirReverse(String cadena) {
        StringBuilder sb = new StringBuilder(cadena);
        String reversa = sb.reverse().toString();

        System.out.println(reversa);
    }

}

