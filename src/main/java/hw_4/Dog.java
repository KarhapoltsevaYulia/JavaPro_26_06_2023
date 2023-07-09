package hw_4;

public class Dog extends Animals{
    public Dog(String name) {
        super(name);
    }

    // собака біг 500 метрів
    //собака пливе 10 метрів
    @Override
    protected String running(int lengthObstacles){
        return this.name +" пробіг "+lengthObstacles+" метрів";
    }
    @Override
     String swimable(int lengthObstacles){
        return this.name +" проплив "+lengthObstacles+" метрів";
    }
}
