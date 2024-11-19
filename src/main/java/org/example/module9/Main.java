package org.example.module9;

import org.example.module9.*;

public class Main {
    public static void main(String[] args) {
        // Professional outfit
        GarmentFactory professionalFactory = new ProfessionalismGarmentFactory();
        displayOutfit(professionalFactory, "Professional");

        // Casual outfit
        GarmentFactory casualFactory = new CasualGarmentFactory();
        displayOutfit(casualFactory, "Casual");

        // Party outfit
        GarmentFactory partyFactory = new PartyGarmentFactory();
        displayOutfit(partyFactory, "Party");
    }

    private static void displayOutfit(GarmentFactory factory, String style) {
        Tops top = factory.createTops();
        Pants pants = factory.createPants();
        Shoes shoes = factory.createShoes();

        System.out.println(style + " Outfit:");
        System.out.println("Top: " + top.getType());
        System.out.println("Pants: " + pants.getType());
        System.out.println("Shoes: " + shoes.getType());
        System.out.println();
    }
}