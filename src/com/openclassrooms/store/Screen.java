package com.openclassrooms.store;

// La classe Screen hérite de la classe Item
public class Screen extends Item {

    private String resolution; // Résolution de l'écran

    // Constructeur pour initialiser les propriétés de l'écran
    public Screen(Brand brand, double price, String resolution) {
        super(brand, price); // Appelle le constructeur de la classe mère Item
        this.resolution = resolution; // Initialise la résolution de l'écran
    }

    // Getter pour la résolution
    public String getResolution() {
        return resolution;
    }

    // Setter pour la résolution
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    // Méthode toString pour afficher les informations de l'écran
    @Override
    public String toString() {
        return "Screen{" + super.toString() + ", resolution='" + resolution + '\'' + '}';
    }
}

