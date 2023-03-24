package vehiculos;

import java.util.ArrayList;

public class Fabricante {
    private static ArrayList<Fabricante> listado = new ArrayList<Fabricante>();
    private String nombre;
    private Pais pais;

    private int ventas;


    public Fabricante (){}

    public Fabricante(String nombre,Pais pais){
        this.nombre = nombre;
        this.pais = pais;
        this.pais.setFabricas(this.pais.getFabricas()+1);
        this.ventas = 0;
        listado.add(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public static Fabricante fabricaMayorVentas(){
        int mayor = 0;
        int indiceMayor = 0;
        for(int i = 0; i < listado.size(); i++){
           if(listado.get(i).getVentas() > mayor) {
               mayor = listado.get(i).getVentas();
               indiceMayor = i;
           }
        }
        return listado.get(indiceMayor);
    }
}
