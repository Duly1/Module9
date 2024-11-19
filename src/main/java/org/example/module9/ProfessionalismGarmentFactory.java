package org.example.module9;

import org.example.module9.*;

public class ProfessionalismGarmentFactory implements GarmentFactory {
    @Override
    public Tops createTops() {
        return new ProfessionalTops();
    }

    @Override
    public Pants createPants() {
        return new ProfessionalPants();
    }

    @Override
    public Shoes createShoes() {
        return new ProfessionalShoes();
    }
}
