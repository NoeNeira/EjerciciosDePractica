package ejerciciosAda.ejercicio1;
/*
* Ejercicio 1
Escribir una clase que represente un reloj que señale la hora, el minuto y el segundo.
Habrá que realizar los siguientes métodos:
1.	Uno que da la hora, los minutos y los segundos, separados por el char “:”  en una cadena.
2.	Otro que también da la hora, pero en formato 24 horas (como el anterior) o en formato de 12 horas, en cuyo caso debe distinguir entre “am” (para horas de 0 a 11) o “pm”, para horas de 12 a 23, también en una cadena.
* */


public class Main {
    public static void main(String[] args) {
        Reloj reloj = new Reloj(14, 42, 50);

        System.out.println(reloj.horaActualFormato24()); // formato 24hs
        System.out.println(reloj.horaActualEnFormatoAmPm()); // formato am/pm
        }
    }
