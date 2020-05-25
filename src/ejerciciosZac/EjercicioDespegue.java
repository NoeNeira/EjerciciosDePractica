package ejerciciosZac;

public class EjercicioDespegue {
    public static void main(String[] args) {
        despegue(3);
    }

    public static void despegue(int numero){
        for (int i = numero; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("Despegue!");
        }
}