package vehiculos;

import java.util.ArrayList;

public class Camion extends Vehiculo{
    //private static ArrayList<Camion> listado = new ArrayList<Camion>();
    private static int cantidadCamiones = 0;
    private int ejes;

    public Camion(String placa, String nombre, double precio, double peso, Fabricante fabricante, int ejes){
        super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
        this.ejes = ejes;
        cantidadCamiones ++;
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    public static int getCantidadCamiones() {
        return cantidadCamiones;
    }
}
