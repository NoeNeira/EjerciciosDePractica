package ejerciciosAda.ejercicio4;

public class Cuenta {
    private int titular;
    private double saldo;

    public Cuenta(int cuenta, double inicial){ // Constructor
        titular = cuenta;
        saldo = inicial;
    }

    public void ingresar(double cantidad) {
        saldo += cantidad; // saldo = saldo + cantidad

    }

    public void retirar(double cantidad) {
        saldo -= cantidad; // saldo = saldo - cantidad
    }

    public double saldo(){
        return saldo;
    }

}
