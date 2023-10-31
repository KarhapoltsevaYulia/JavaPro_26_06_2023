package HW_20.Factory.Product;

import HW_20.Factory.FurnitureFactory;
import HW_20.Factory.MaterialType;

import java.util.Objects;

public class BedFactoryImpl implements FurnitureFactory {

    @Override
    public void materialForMaking(MaterialType materialType) {
        try {
            frameManufacturingBed(materialType);
        } catch (RuntimeException e){
            System.out.println("Products  Bed cannot be prepared!!!");
        }
    }
    private void frameManufacturingBed(MaterialType materialType){
        if (Objects.requireNonNull(materialType) == MaterialType.TREE) {
            System.out.println("frameManufacturing Create!!");
            makingSoftBedCushion(materialType);
        }
        throw new RuntimeException(" It is impossible to make a frame from this material");

    }
    private void makingSoftBedCushion(MaterialType materialType){
        if (Objects.requireNonNull(materialType) == MaterialType.TEXTILE) {
            System.out.println("Mattress Production create");
        }
        throw new RuntimeException("It is impossible to make a making Soft from this material");
    }
}
