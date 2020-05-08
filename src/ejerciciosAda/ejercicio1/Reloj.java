package ejerciciosAda.ejercicio1;


public class Reloj {

    private int hora;
    private int min;
    private int seg;

    public Reloj (int hora, int min, int seg) {
        this.hora = hora;
        this.min = min;
        this.seg = seg;
    }

    public String horaActualFormato24() {
        return hora + ":" + min + ":" + seg;
    }

    public String horaActualEnFormatoAmPm() {
        if (hora > 12) {
            int horaPm = hora - 12;
            return horaPm + ":" + min + ":" + seg + " am";
        }

        else {
            return horaActualFormato24() + " pm";
        }
    }
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSeg() {
        return seg;
    }

    public void setSeg(int seg) {
        this.seg = seg;
    }

    }

