package org.example.module9;

import org.example.module9.*;

public class CasualGarmentFactory implements GarmentFactory {
    @Override
    public Tops createTops() {
        return new CasualTops();
    }

    @Override
    public Pants createPants() {
        return new CasualPants();
    }

    @Override
    public Shoes createShoes() {
        return new CasualShoes();
    }
}
