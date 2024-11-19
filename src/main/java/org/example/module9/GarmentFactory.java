package org.example.module9;

import org.example.module9.Tops;
import org.example.module9.Pants;
import org.example.module9.Shoes;

public interface GarmentFactory {
    Tops createTops();
    Pants createPants();
    Shoes createShoes();
}
