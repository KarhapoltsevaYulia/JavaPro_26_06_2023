package HW_20.Factory;

public class Main {
    public static void main(String[] args) {
       Factory factory = new Factory();
       factory.createFurniture(FactoryType.CHAIR).materialForMaking(MaterialType.TREE);
       factory.createFurniture(FactoryType.CHAIR).materialForMaking(MaterialType.NAILS);
    }
}
