package ejerciciosAda.ejercicio4;

public class MainCuenta {
    public static void main(String[] args) {
        double totalCuenta;
        Cuenta cuenta = new Cuenta(1,5.0);

        totalCuenta = cuenta.saldo();
        System.out.println("Total actual en la cuenta: " + totalCuenta + " $");

        double ingreso = 5;
        System.out.println("Se ingresan en la cuenta " + ingreso + " $");
        cuenta.ingresar(ingreso);

        totalCuenta = cuenta.saldo();
        System.out.println("Total actual en la cuenta: " + totalCuenta + " $");

        double egreso = 4;
        System.out.println("Se retiran de la cuenta " + ingreso + " $");
        cuenta.retirar(egreso);

        totalCuenta = cuenta.saldo();
        System.out.println("Total actual en la cuenta: " + totalCuenta + " $");

    }
}

