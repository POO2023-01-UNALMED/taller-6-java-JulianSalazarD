package vehiculos;

import java.util.ArrayList;

public class Camioneta extends Vehiculo{
    //private static ArrayList<Camioneta> listado = new ArrayList<Camioneta>();
    private static int cantidadCamionetas = 0;
    private boolean volco;

    public Camioneta( String placa, int puertas, String nombre, double precio, double peso, Fabricante fabricante, boolean volco){
        super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
        this.volco = volco;
        cantidadCamionetas ++;
    }

    public boolean isVolco() {
        return volco;
    }

    public void setVolco(boolean volco) {
        this.volco = volco;
    }

    public static int getCantidadCamionetas() {
        return cantidadCamionetas;
    }
}
