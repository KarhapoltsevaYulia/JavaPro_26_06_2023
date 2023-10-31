package HW_20.Factory.Product;

import HW_20.Factory.FurnitureFactory;
import HW_20.Factory.MaterialType;

import java.util.Objects;

public class SofaFactoryImpl implements FurnitureFactory {


    @Override
    public void materialForMaking(MaterialType materialType) {
        try {
            frameManufacturing(materialType);
        } catch (RuntimeException e){
            System.out.println("Products  SOFA cannot be prepared");
        }
    }
    private void frameManufacturing(MaterialType materialType){
        if (Objects.requireNonNull(materialType) == MaterialType.TREE) {
            System.out.println("frameManufacturing Create!!");
            mattressProduction(materialType);
        }
        throw new RuntimeException(" It is impossible to make a frame from this material");

    }
    private void mattressProduction(MaterialType materialType){
        if (Objects.requireNonNull(materialType) == MaterialType.TEXTILE) {
            System.out.println("Mattress Production create");
        }
        throw new RuntimeException("It is impossible to make a mattress from this material");
    }
}
