package vehiculos;

import java.util.ArrayList;

public class Pais {
    private static ArrayList<Pais> listado = new ArrayList<Pais>();
    private String nombre;
    private int fabricas;

    public Pais(String nombre){
        this.nombre = nombre;
        this.fabricas = 0;
        listado.add(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFabricas() {
        return fabricas;
    }

    public void setFabricas(int fabricas) {
        this.fabricas = fabricas;
    }

    public static Pais paisMasVendedor() {
        int mayor = 0;
        int indiceMayor = 0;
        for(int i = 0; i < listado.size(); i++) {
            if(listado.get(i).getFabricas() > mayor){
                mayor = listado.get(i).getFabricas();
                indiceMayor = i;
            }
        }
        return listado.get(indiceMayor);
    }
}
