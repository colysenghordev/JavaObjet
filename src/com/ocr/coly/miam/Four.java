package com.ocr.coly.miam;

public class Four {
    int puissance;
    int capacite;

    public void cuire(Aliment aliment){
        System.out.println("Je cuis un aliment : " +aliment.nom);
        System.out.println("avec ma capacite de " +capacite+ " litres");
        System.out.println("et ma puissante de " +puissance+ " watt");
        aliment.estCuit = true;
    }
}
