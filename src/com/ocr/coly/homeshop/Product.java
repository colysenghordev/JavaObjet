package com.ocr.coly.homeshop;

public class Product {
   private String name;
   private String description;
   private Double price;

    /**
     * Display a full description of the product ( Afficher une description complète du produit )
     */
    public void look(){

    }

    /**
     * Add the product to a Bill ( Ajouter le produit à une facture )
     * @param bill the concerned bill ( bill la facture concernée )
     * @param quantity the quantity to add ( la quantité à ajouter )
     */
    public void buy(Bill bill, Integer quantity){

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
