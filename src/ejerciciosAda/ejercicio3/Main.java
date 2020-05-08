package ejerciciosAda.ejercicio3;

public class Main {
    public static void main(String[] args) {
        Cadete cadete = new Cadete();
        Gerente gerente = new Gerente();

        cadete.setFaltas(0);
        gerente.setFaltas(4);

        System.out.println(cadete.obtenerSueldoEnMano());
        System.out.println(gerente.obtenerSueldoEnMano());
    }

}
