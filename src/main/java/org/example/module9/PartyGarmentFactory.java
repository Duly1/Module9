package org.example.module9;

import org.example.module9.*;

public class PartyGarmentFactory implements GarmentFactory {
    @Override
    public Tops createTops() {
        return new PartyTops();
    }

    @Override
    public Pants createPants() {
        return new PartyPants();
    }

    @Override
    public Shoes createShoes() {
        return new PartyShoes();
    }
}