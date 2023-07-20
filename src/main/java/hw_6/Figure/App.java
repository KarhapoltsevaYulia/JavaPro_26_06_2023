package hw_6;

public class App {
    public static void main(String[] args) {
        double sum=0;
        BaseGeometricFigure[] baseGeometricFigures = {
                new Circle(10),
                new Square(11),
                new Triangle(11,11)
        };

        for (BaseGeometricFigure figyres: baseGeometricFigures){
           System.out.println(figyres.getClass().getName());
           System.out.println(sum = figyres.areaOllInt(sum));
        }
        System.out.println("Area oll figure = "+ sum);
    }
}
