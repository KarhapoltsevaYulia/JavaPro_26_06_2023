package HW_20.Strategy;

public class Main {
    public static void main(String[] args) {

        Figures figures = new Figures(new Rectangle());
        figures.area(4,4);
       Figures figures1 = new Figures(new Triangle());
       figures1.area(1,1);
    }
}
