package vehiculos;

import java.util.ArrayList;

public class Automovil extends Vehiculo{
    //private static ArrayList<Automovil> listado = new ArrayList<Automovil>();
    private static int cantidadAutomoviles = 0;
    private int puestos;

    public Automovil(String placa, String nombre, double precio, double peso, Fabricante fabricante, int puestos) {
        super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
        this.puestos = puestos;
        cantidadAutomoviles ++;

    }

    public int getPuestos() {
        return puestos;
    }

    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }

    public static int getCantidadAutomoviles() {
        return cantidadAutomoviles;
    }

}
