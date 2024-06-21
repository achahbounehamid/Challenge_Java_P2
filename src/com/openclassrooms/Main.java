

package com.openclassrooms;

import com.openclassrooms.store.*;

public class Main {

    public static void main(String[] args) {
        // Crée une souris de marque Dell avec un prix de 20.0
        Mouse dellMouse = new Mouse(Brand.DELL, 20.0);
        // Crée un écran de marque Samsung avec un prix de 150.0 et une résolution de 1920x1080
        Screen samsungScreen = new Screen(Brand.SAMSUNG, 150.0, "1920x1080");

        // Crée un nouvel inventaire
        Inventory inventory = new Inventory();
        // Ajoute 5 écrans Samsung à l'inventaire
        inventory.addItem(samsungScreen, 5);
        // Ajoute 12 souris Dell à l'inventaire
        inventory.addItem(dellMouse, 12);
        // Retire 2 souris Dell de l'inventaire
        inventory.removeItem(dellMouse, 2);
        // Affiche l'inventaire avec les quantités sur la console
        inventory.displayInventoryOnConsole();
        // Retire 12 souris Dell de l'inventaire, ce qui devrait ramener la quantité à 0
        inventory.removeItem(dellMouse, 12);
        // Affiche l'inventaire mis à jour avec les quantités sur la console
        inventory.displayInventoryOnConsole();
        // Affiche tous les items sans les quantités sur la console
        inventory.displayItemsOnConsole();
    }
}
