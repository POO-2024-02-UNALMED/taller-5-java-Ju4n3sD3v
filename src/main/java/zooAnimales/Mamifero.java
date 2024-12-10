package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Mamifero extends Animal{
    private static int totalAnimales;        
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private static ArrayList<Zona> zona;

    private static ArrayList<Mamifero> listado;
    public int caballos;
    public int leones;
    private boolean pelaje;
    private int patas;

    public Mamifero() {}

    public Mamifero(String n, int e, String h, String g, boolean pe, int pa) {
        nombre = n;
        edad = e;
        habitat = h;
        genero = g;
        pelaje = pe;
        patas = pa;
    }

public int getTotalAnimales() {
        return totalAnimales;
    }

    public void setTotalAnimales(int totalAnimales) {
        Mamifero.totalAnimales = totalAnimales;
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
        Mamifero.zona = zona;
    }

    public static ArrayList<Mamifero> getListado() {
        return listado;
    }
    public static void setListado(ArrayList<Mamifero> listado) {
        Mamifero.listado = listado;
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public Mamifero crearCaballo(String n, int e, String g) {
        pelaje = true;
        patas = 4;
        habitat = "pradera";
        caballos++;
        Mamifero m = new Mamifero(n, e, habitat, g, pelaje, patas);
        Mamifero.listado.add(m);  
        return m;
    }

    public Mamifero crearLeon(String n, int e, String g) {
        pelaje = true;
        patas = 4;
        habitat = "selva";
        leones++;
        Mamifero m = new Mamifero(n, e, habitat, g, pelaje, patas);  
        Mamifero.listado.add(m);      
        return m;
    }

    public int cantidadMamiferos() {
        return Mamifero.listado.size();
    }

}
