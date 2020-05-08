package ejerciciosZac;

public class EjercicioSimple {
    public static void main(String[] args) {
        String nombre = "Noe";

        System.out.println("Bienvenida " + nombre);

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

        String arrayDeStrings[] = {"Noe", "Neira"};

        System.out.println("Mi nombre es: " + arrayDeStrings[0] + " " + arrayDeStrings[1]);

        int arrayNum6[] = {1, 7, 3, 0, 1, 5};
        System.out.println("Este array contiene " + arrayNum6.length + " elementos");

        String arrayDeStrings2[] = new String[4];
        int size = arrayDeStrings2.length;
        arrayDeStrings2[0] = "Primero";
        arrayDeStrings2[size - 1] = "Último";

        System.out.println(arrayDeStrings2[0]);
        System.out.println(arrayDeStrings2[size - 1]);

        int valorNum7 = 25;
        if (valorNum7 > 0) {
            System.out.println(valorNum7);
        }

        int valorNum8 = 30;
        int valorNum9 = 29;
        if (valorNum8 > valorNum9) {
            System.out.println(valorNum8);
        }
        if (valorNum9 > valorNum8) {
            System.out.println(valorNum9);
        }

    }
}
