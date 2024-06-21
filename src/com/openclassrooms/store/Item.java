package com.openclassrooms.store;


 //La classe Item représente tout type d'items qui doivent être gérés dans cet inventaire.

public abstract class Item {

    protected Brand brand; // Marque de l'item
    protected double price; // Prix de l'item

    // Constructeur pour initialiser les propriétés communes des items
    public Item(Brand brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    // Getter pour la marque
    public Brand getBrand() {
        return brand;
    }

    // Setter pour la marque
    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    // Getter pour le prix
    public double getPrice() {
        return price;
    }

    // Setter pour le prix
    public void setPrice(double price) {
        this.price = price;
    }

    // Méthode toString pour afficher les informations de l'item
    @Override
    public String toString() {
        return "brand=" + brand + ", price=" + price;
    }
}

