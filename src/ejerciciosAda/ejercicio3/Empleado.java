package ejerciciosAda.ejercicio3;

public abstract class Empleado {
    int faltas;

    public double presentismo(){
        int sueldoNeto = obtenerSueldoNeto();

        if (faltas == 0) {
            return sueldoNeto * 0.1;
        }
        else if (faltas >= 3) {
            return sueldoNeto * -0.05;
        }
        else {
            return sueldoNeto;
        }

    }

    public double obtenerSueldoEnMano(){
        return presentismo() + obtenerSueldoNeto();
    }

    public abstract int obtenerSueldoNeto(); // Clase abstracta que se sobreescribe en las clases hijas.

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }
}
