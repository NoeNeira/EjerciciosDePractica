package ejerciciosZac;

public class Ejercicio9 {
    public static void main(String[] args) {
        imprimirFecha(1,5, 1988);
        imprimirFecha2(16,6, 1991);
    }

    // Métodos y cuadro de diálogo
    public static void imprimirFecha(int dia, int mes, int anio) {
        if(mes == 1){
            System.out.println(dia + " de Enero de " + anio);
        }
        else if (mes == 2){
            System.out.println(dia + " de Febrero de " + anio);
        }
        else if (mes == 3){
            System.out.println(dia + " de Marzo de " + anio);
        }
        else if (mes == 4){
            System.out.println(dia + " de Abril de " + anio);
        }
        else if (mes == 5){
            System.out.println(dia + " de Mayo de " + anio);
        }
        else if (mes == 6){
            System.out.println(dia + " de Junio de " + anio);
        }
        else if (mes == 7){
            System.out.println(dia + " de Julio de " + anio);
        }
        else if (mes == 8){
            System.out.println(dia + " de Agosto de " + anio);
        }
        else if (mes == 9){
            System.out.println(dia + " de Septiembre de " + anio);
        }
        else if (mes == 10){
            System.out.println(dia + " de Octubre de " + anio);
        }
        else if (mes == 11){
            System.out.println(dia + " de Noviembre de " + anio);
        }
        else if (mes == 12){
            System.out.println(dia + " de Diciembre de " + anio);
        }
    }
    // Método alternativo con Switch Case
    public static void imprimirFecha2(int dia, int mes, int anio) {
        String mesComoPalabra = null;

        switch (mes){
            case 1:
                mesComoPalabra = "Enero";
                break;
            case 2:
                mesComoPalabra = "Febrero";
                break;
            case 3:
                mesComoPalabra = "Marzo";
                break;
            case 4:
                mesComoPalabra = "Abril";
                break;
            case 5:
                mesComoPalabra = "Mayo";
                break;
            case 6:
                mesComoPalabra = "Junio";
                break;
            case 7:
                mesComoPalabra = "Julio";
                break;
            case 8:
                mesComoPalabra = "Agosto";
                break;
            case 9:
                mesComoPalabra = "Septiembre";
                break;
            case 10:
                mesComoPalabra = "Octubre";
                break;
            case 11:
                mesComoPalabra = "Noviembre";
                break;
            case 12:
                mesComoPalabra = "Diciembre";
                break;
        }

        System.out.println(dia + " de " + mesComoPalabra + " de " + anio);
    }
}
