package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Ave extends Animal{
    private static int totalAnimales;        
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private ArrayList<Zona> zona;

    private static ArrayList<Ave> listado;
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;

    public Ave() {}

    public Ave(String n, int e, String h, String g, String co) {
        nombre = n;
        edad = e;
        habitat = h;
        genero = g;
        colorPlumas = co;
    }

public int getTotalAnimales() {
        return totalAnimales;
    }

    public void setTotalAnimales(int totalAnimales) {
        Ave.totalAnimales = totalAnimales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public ArrayList<Zona> getZona() {
        return zona;
    }

    public void setZona(ArrayList<Zona> zona) {
        this.zona = zona;
    }

    public static ArrayList<Ave> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Ave> listado) {
        Ave.listado = listado;
    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }

    @Override
    public String movimiento() {
        return "volar";
    }

    public Ave crearHalcon(String n, int e, String g) {
        colorPlumas = "cafe glorioso";
        habitat = "montanas";
        halcones++;
        Ave a = new Ave(n, e, habitat, g, colorPlumas);
        Ave.listado.add(a);
        return a;
    }

    public Ave crearAguila(String n, int e, String g) {
        colorPlumas = "blanco y amarillo";
        habitat = "montanas";
        aguilas++;
        Ave a = new Ave(n, e, habitat, g, colorPlumas);
        Ave.listado.add(a);
        return a;
    }

    public int cantidadAves() {
        return Ave.listado.size();
    }

}
