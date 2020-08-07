
package ejerciciosZac;
/*
Una palabra se dice que es \abecedaria" si las letras en la palabra aparecen en orden alfabetico.
Por ejemplo, las siguientes son todas palabras abecedarias del idioma castellano.
adios, afn, ano, agil, bello, celos, ceno, chinos dijo, dimos, dios, jos, nos, hijos, hilos,
himno
1. Describ un algoritmo para decidir si una palabra dada es abecedaria, asumiendo que la misma
contiene solo letras minusculas.
2. Implementar el algoritmo en un metodo static boolean esAbecedaria(String s).
 */

public class Ejercicio21 {
    public static void main(String[] args) {
        System.out.println(esAbecedaria("chinos"));
    }

    static boolean esAbecedaria(String palabra){
        boolean esAlfabetica = true;
        for (int i = 0; i < palabra.length() - 1; i++) {
            if(palabra.charAt(i) > palabra.charAt(i + 1)){
                esAlfabetica = false;
            }
        }
        return esAlfabetica;
    }
}
