package ejerciciosAda.ejercicio4;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();

        cuenta.ingresar(5.0);
        System.out.println(cuenta.getSaldo());
    }
}
