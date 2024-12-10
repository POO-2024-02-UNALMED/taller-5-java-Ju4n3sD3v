package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Reptil extends Animal{
    private static int totalAnimales;        
    private String nombre;
    private int edad;
    private static String habitat;
    private String genero;
    private ArrayList<Zona> zona;

    private static ArrayList<Reptil> listado;
    public static int iguanas;
    public static int serpientes;
    private static String colorEscamas;
    private static int largoCola;

    public Reptil() {}

    public Reptil(String n, int e, String h, String g, String co, int la) {
        nombre = n;
        edad = e;
        habitat = h;
        genero = g;
        colorEscamas = co;
        largoCola = la;
    }

public int getTotalAnimales() {
        return totalAnimales;
    }

    public void setTotalAnimales(int totalAnimales) {
        Reptil.totalAnimales = totalAnimales;
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
        Reptil.habitat = habitat;
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

    public static ArrayList<Reptil> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Reptil> listado) {
        Reptil.listado = listado;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        Reptil.colorEscamas = colorEscamas;
    }

    public int getLargoCola() {
        return largoCola;
    }

    public void setLargoCola(int largoCola) {
        Reptil.largoCola = largoCola;
    }

    @Override
    public String movimiento() {
        return "reptar";
    }

    public static Reptil crearIguana(String n, int e, String g) {
        colorEscamas = "verde";
        largoCola = 3;
        habitat = "humedal";
        iguanas++;
        Reptil r = new Reptil(n, e, habitat, g, colorEscamas, largoCola);
        Reptil.listado.add(r);
        return r;
    }

    public static Reptil crearSerpiente(String n, int e, String g) {
        colorEscamas = "blanco";
        largoCola = 1;
        habitat = "jungla";
        serpientes++;
        Reptil r = new Reptil(n, e, habitat, g, colorEscamas, largoCola);
        Reptil.listado.add(r);
        return r;
    }

    public int cantidadReptiles() {
        return Reptil.listado.size();
    }
}
