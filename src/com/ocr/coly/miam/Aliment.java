package com.ocr.coly.miam;

public class Aliment {
    String nom;
    Boolean estCuit;

    public  void manger(){
        if (estCuit){
            System.out.println("Miam miam : " +nom+ " est bien cuit");
        }else {
            System.out.println("Oops cet aliment : " +nom+ " n'est pas cuit");
        }
    }

}
