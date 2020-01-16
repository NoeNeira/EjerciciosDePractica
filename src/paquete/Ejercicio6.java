package paquete;

import javax.swing.*;

public class Ejercicio6 {
        // Atributos
        int num1;
        int num2;
        int suma;
        double promedio;

        // Métodos
        public void ingresarNumeros () {
            num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingreso un número"));
            num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingreso otro número"));
        }

        public void sumar () {
            suma = num1 + num2;
        }

        public void imprimirSuma () {
            System.out.println("El resultado de la suma es: " + suma);
        }
        public void promediar(){
            promedio = (num1 + num2) / (double) 2;
        }

        public void imprimirPromedio(){
            System.out.println("El promedio es: " + promedio);
        }
    }
