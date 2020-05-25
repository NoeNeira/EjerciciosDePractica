package ejerciciosAda.electrodómesticos;

public abstract class Electrodómestico {
    int precioBase;
    int precioBaseDefault;
    String color;
    String colorDefault = "blanco";
    char consumoEnergetico;
    char consumoEnergeticoDefault = 'F';
    int peso;
    int pesoDefault = 5;

    public void comprobarConsumoEnergetico(char consumoEnergetico){
        if(consumoEnergetico >= 'A' && consumoEnergetico <= 'F'){
            this.consumoEnergetico = consumoEnergetico;
        }else{
            this.consumoEnergetico = consumoEnergeticoDefault;
        }
    }

    public void comprobarColor(String color){
        String colores[] = {"blanco", "negro", "rojo", "azul", "gris"};
        boolean colorEncontrado = false;

        for (int i = 0; i < colores.length && !colorEncontrado; i++) {
            if (colores[i].equals(color)){
                colorEncontrado = true;
            }
        }
        if (colorEncontrado){
            this.color = color;
        } else {
            this.color = colorDefault;
        }
    }


}
