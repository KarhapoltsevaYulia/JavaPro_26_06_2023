package HW_20.Factory;

import HW_20.Factory.Product.BedFactoryImpl;
import HW_20.Factory.Product.ChairFactoryImpl;
import HW_20.Factory.Product.SofaFactoryImpl;

public class Factory {
    public FurnitureFactory createFurniture(FactoryType factoryType ){
        switch (factoryType) {
            case CHAIR -> {
                return new ChairFactoryImpl();
            }
            case SOFA -> {
                return new SofaFactoryImpl();
            }
            case BED -> {
                return new BedFactoryImpl();
            }
        }
        throw new RuntimeException("There is no such type of furniture");
    }
}
