package ejerciciosZac;

/*
Ejercicio 20 F
Escribir un metodo static int cantidadVocales(String s) que dada una cadena que contiene
solo letras minusculas sin acentuar, devuelve la cantidad de vocales en dicha cadena. Nota: se puede
utilizar el metodo denida en el ejercicio anterior.
 */
public class Ejercicio20 {
    public static void main(String[] args) {
        System.out.println(cantidadVocales("murcielago")); // palabra en castellano que contiene todas las vocales
    }
    static int cantidadVocales(String palabra) {
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == 'a') {
                contador += 1; // contador = contador + 1 o contador++ // Suma uno item al contador
            }
            else if (palabra.charAt(i) == 'e') {
                contador += 1;
            }
            else if (palabra.charAt(i) == 'i') {
                contador += 1;
            }
            else if (palabra.charAt(i) == 'o') {
                contador += 1;
            }
            else if (palabra.charAt(i) == 'u') {
                contador += 1;
            }
        }
        return contador;
    }
}