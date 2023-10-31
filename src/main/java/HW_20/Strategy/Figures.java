package HW_20.Strategy;

public class Figures {
    AreaFiguresStrategy areaFiguresStrategy;

    public Figures(AreaFiguresStrategy areaFiguresStrategy) {
        this.areaFiguresStrategy = areaFiguresStrategy;
    }

    public void area (float a, float b){
        areaFiguresStrategy.areaFigures(a,b);
    }
}
