package gestion;

import java.util.ArrayList;

public class Zoologico {
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zonas;
    public Zoologico() {

    }
    public Zoologico(String n, String u) {
        nombre = n;
        ubicacion = u;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public ArrayList<Zona> getZona() {
        return zonas;
    }

    public int cantidadTotalAnimales() {
        int cant = 0;
        for (Zona zona : zonas) {
            cant += zona.getAnimales().size();
        }
        return cant;
    }

    public void agregarZonas(Zona z) {
        zonas.add(z);
    }
}
