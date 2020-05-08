package ejerciciosAda.ejercicio4;

public class Cuenta {
    private String titular;
    private double saldo;

    public void ingresar(Double cantidad) {
        if (cantidad >= 0) {
            this.saldo += cantidad; // saldo = saldo + cantidad;
        }

    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    protected double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}
