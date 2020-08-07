package ejerciciosZac;
/*
Escribir un metodo static int cantidadApariciones(String s, char c) que dada una cadena
y un caracter, cuenta la cantidad de veces que aparece c en s.
 */

public class Ejercicio19 {
    public static void main(String[] args) {
        System.out.println(cantidadApariciones("zacarias", 'z'));
    }

    static int cantidadApariciones(String palabra, char letra) {
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            if(palabra.charAt(i) == letra){
                contador += 1; // contador = contador + 1 o contador++
            }
        }
        return contador;
    }

}
