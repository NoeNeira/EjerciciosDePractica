package ejerciciosZac;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextFloat();
        double y = scanner.nextFloat();

        ponerNota(x,y);
    }

    public static void ponerNota(double x, double y){
        double promedio = (x + y) / 2.0;

        if(promedio >= 7.0){
            System.out.println("Promocionade");
        }
        else if(promedio >= 4 && promedio < 7){
            System.out.println("Aprobade");
        }
        else {
            System.out.println("Debe Recuperar");
        }

    }
}
