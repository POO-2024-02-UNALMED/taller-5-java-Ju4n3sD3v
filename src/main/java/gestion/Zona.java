package gestion;

import java.util.ArrayList;

import zooAnimales.Animal;

public class Zona {
    private String nombre;    
    private ArrayList<Zoologico> zoo = new ArrayList<Zoologico>();
    private ArrayList<Animal> animales;    

    public Zona() {
        zoo.add(new Zoologico());
    }

    public Zona(String n, Zoologico z) {
        nombre = n;
        zoo.add(z);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Zoologico getZoo() {
        return zoo.get(0);
    }

    public void setZoo(ArrayList<Zoologico> zoo) {
        this.zoo = zoo;
    }

    public ArrayList<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(ArrayList<Animal> animales) {
        this.animales = animales;
    }

    public void agregarAnimales(Animal a) {
        animales.add(a);
    }

    public int cantidadAnimales() {
        return animales.size();
    }
}
