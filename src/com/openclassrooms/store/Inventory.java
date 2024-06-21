package com.openclassrooms.store;

import java.util.HashMap;
import java.util.Map;


 //Classe pour gérer les items et leurs quantités dans l'inventaire


public class Inventory {

 // Map pour stocker les items et leurs quantités
 private Map<Item, Integer> items = new HashMap<>();

 // Constructeur par défaut
 public Inventory() {}

 // Constructeur qui initialise l'inventaire avec des items existants
 public Inventory(Map<Item, Integer> existingItems) {
  items.putAll(existingItems);
 }


  //Ajoute la quantité spécifiée de l'item à l'inventaire.
  //Prend en compte la quantité existante.

 public void addItem(Item item, Integer quantity) {
  // Si l'item existe déjà, ajoute la quantité à la quantité existante
  if(items.containsKey(item)) {
   quantity = items.get(item) + quantity;
  }
  // Ajoute l'item avec la nouvelle quantité
  items.put(item, quantity);
 }


  // Retire la quantité spécifiée d'un item de l'inventaire

 public void removeItem(Item item, Integer quantity) {
  if(items.containsKey(item)) {
   Integer existingCount = items.get(item); // Quantité existante de l'item
   Integer newQuantity = existingCount - quantity; // Nouvelle quantité après retrait
   if(newQuantity < 0) {
    newQuantity = 0; // Ne permet pas que la quantité descende en dessous de 0
   }
   // Met à jour l'item avec la nouvelle quantité
   items.put(item, newQuantity);
  }
 }


  // Affiche les items et leurs quantités sur la console.


 public void displayInventoryOnConsole() {
  // Utilisation des lambdas pour parcourir et afficher chaque entrée de la map
  items.forEach((item, quantity) ->
          System.out.println(item.getClass().getSimpleName() + " - " + item.getBrand() + ": " + quantity));
 }


  //Affiche les items sans les quantités sur la console.

 public void displayItemsOnConsole() {
  // Utilisation des lambdas pour parcourir et afficher chaque item
  items.forEach((item, quantity) -> System.out.println(item));
 }
}
