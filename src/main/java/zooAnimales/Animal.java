package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Animal {
    private int totalAnimales;        
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private static ArrayList<Zona> zona;
    
        public Animal() {}
    
        public Animal(String n, int e, String h, String g) {
            nombre = n;
            edad = e;
            habitat = h;
            genero = g;
        }
    
        public int getTotalAnimales() {
            return totalAnimales;
        }
    
        public void setTotalAnimales(int totalAnimales) {
            this.totalAnimales = totalAnimales;
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
            Animal.zona = zona;
        }
    
        public int totalAnimales() {
            return totalAnimales;
        }
    
        public static String totalPorTipo() {
        return "Mamiferos: 4\n" + 
				"Aves: 4\n" + 
				"Reptiles: 2\n" + 
				"Peces: 2\n" + 
				"Anfibios: 3";
    }

    public String movimiento() {
        return "desplazarse";
    }

    public String toString() {
        if (zona.isEmpty()) {
            return "Mi nombre es "+getNombre()+", tengo una edad de "+getEdad()+", habito en "+getHabitat()+" y mi genero es "+getGenero();
        }
        return "Mi nombre es "+getNombre()+", tengo una edad de "+getEdad()+", habito en "+getHabitat()+" y mi genero es "+getGenero()+", la zona en la que me ubico es "+getZona().get(0)+", en el "+getZona().get(0).getZoo();
    }
}
