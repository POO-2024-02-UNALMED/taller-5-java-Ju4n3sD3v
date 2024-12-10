package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Anfibio extends Animal{
    private static int totalAnimales;        
    private String nombre;
    private int edad;
    private static String habitat;
    private String genero;
    private ArrayList<Zona> zona;

    private static ArrayList<Anfibio> listado;
    public static int ranas;
    public static int salamandras;
    private static String colorPiel;
    private static boolean venenoso;

    public Anfibio() {}

    public Anfibio(String n, int e, String h, String g, String co, boolean v) {
        nombre = n;
        edad = e;
        habitat = h;
        genero = g;
        colorPiel = co;
        venenoso = v;
    }

public int getTotalAnimales() {
        return totalAnimales;
    }

    public void setTotalAnimales(int totalAnimales) {
        Anfibio.totalAnimales = totalAnimales;
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
        Anfibio.habitat = habitat;
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

    public static ArrayList<Anfibio> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Anfibio> listado) {
        Anfibio.listado = listado;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        Anfibio.colorPiel = colorPiel;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    @Override
    public String movimiento() {
        return "saltar";
    }

    public static Anfibio crearRana(String n, int e, String g) {
        colorPiel = "rojo";
        venenoso = true;
        habitat = "humedal";
        ranas++;
        Anfibio an = new Anfibio(n, e, habitat, g, colorPiel, venenoso); 
        Anfibio.listado.add(an);
        return an;
    }

    public static Anfibio crearSalamandra(String n, int e, String g) {
        colorPiel = "negro y amarillo";
        venenoso = false;
        habitat = "jungla";
        salamandras++;
        Anfibio an = new Anfibio(n, e, habitat, g, colorPiel, venenoso); 
        Anfibio.listado.add(an);
        return an;
    }

    public int cantidadAnfibios() {
        return Anfibio.listado.size();
    }
}
