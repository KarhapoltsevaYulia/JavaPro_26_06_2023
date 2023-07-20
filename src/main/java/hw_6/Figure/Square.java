package hw_6;

public class Square implements BaseGeometricFigure{
   private  double areaSquare;

    public Square(double sideSquare) {
        this.areaSquare = areaSquare(sideSquare);
    }
    @Override
    public double areaFigureInt() {
        return this.areaSquare;
    }

    private double areaSquare(double sideSquare){
        if (sideSquare>0) {
            return this.areaSquare = (Math.pow(sideSquare, 2));
        } else {
            return 0;
        }
    }
    public double getAreaSquare() {
        return areaSquare;
    }
}
