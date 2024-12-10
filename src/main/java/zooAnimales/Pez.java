package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Pez extends Animal{
    private static int totalAnimales;        
    private String nombre;
    private int edad;
    private static String habitat;
    private String genero;
    private ArrayList<Zona> zona;

    private static ArrayList<Pez> listado;
    public static int salmones;
    public static int bacalaos;
    private static String colorEscamas;
    private static int cantidadAletas;

    public Pez() {}

    public Pez(String n, int e, String h, String g, String co, int ca) {
        nombre = n;
        edad = e;
        habitat = h;
        genero = g;
        colorEscamas = co;
        cantidadAletas = ca;
    }

public int getTotalAnimales() {
        return totalAnimales;
    }

    public void setTotalAnimales(int totalAnimales) {
        Pez.totalAnimales = totalAnimales;
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
        Pez.habitat = habitat;
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

    public static ArrayList<Pez> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Pez> listado) {
        Pez.listado = listado;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        Pez.colorEscamas = colorEscamas;
    }

    public int getCantidadAletas() {
        return cantidadAletas;
    }

    public void setCantidadAletas(int cantidadAletas) {
        Pez.cantidadAletas = cantidadAletas;
    }

    @Override
    public String movimiento() {
        return "nadar";
    }

    public static Pez crearSalmon(String n, int e, String g) {
        colorEscamas = "rojo";
        cantidadAletas = 6;
        habitat = "oceano";
        salmones++;
        Pez p = new Pez(n, e, habitat, g, colorEscamas, cantidadAletas);
        Pez.listado.add(p);
        return p;
    }

    public static Pez crearBacalao(String n, int e, String g) {
        colorEscamas = "gris";
        cantidadAletas = 6;
        habitat = "oceano";
        bacalaos++;
        Pez p = new Pez(n, e, habitat, g, colorEscamas, cantidadAletas);
        Pez.listado.add(p);
        return p;
    }

    public int cantidadPeces() {
        return Pez.listado.size();
    }
}
