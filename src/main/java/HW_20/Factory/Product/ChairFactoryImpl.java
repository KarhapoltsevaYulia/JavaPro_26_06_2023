package HW_20.Factory.Product;

import HW_20.Factory.FurnitureFactory;
import HW_20.Factory.MaterialType;

import java.util.Objects;

public class ChairFactoryImpl implements FurnitureFactory {

    @Override
    public void materialForMaking(MaterialType materialType) {
        try {
            frameManufacturingChair(materialType);
        } catch (RuntimeException e){
            System.out.println("Products  Chair cannot be prepared!!!");
        }
    }
    private void frameManufacturingChair(MaterialType materialType){
        if (Objects.requireNonNull(materialType) == MaterialType.TREE) {
            System.out.println("frame Manufacturing Chair Create!!");
            makingSoftChairCushion(materialType);
        }
        throw new RuntimeException(" It is impossible to make a frame from this material");

    }
    private void makingSoftChairCushion(MaterialType materialType){
        if (Objects.requireNonNull(materialType) == MaterialType.TEXTILE) {
            System.out.println("Chair Production create");
        }
        throw new RuntimeException("It is impossible to make a making Soft from this material");
    }
}
