package com.openclassrooms.store;

// La classe Mouse hérite de la classe Item
public class Mouse extends Item {

    // Constructeur pour initialiser les propriétés de la souris
    public Mouse(Brand brand, double price) {
        super(brand, price); // Appelle le constructeur de la classe mère Item
    }

    // Méthode toString pour afficher les informations de la souris
    @Override
    public String toString() {
        return "Mouse{" + super.toString() + '}';
    }
}

