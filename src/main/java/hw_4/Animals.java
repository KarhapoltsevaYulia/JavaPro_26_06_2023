package hw_4;

import java.util.Scanner;

public class Animals {
    public String name;

    public Animals(String name) {
        this.name = name;
    }

     String running(int lengthObstacle){
        return this.name +" пробіг "+lengthObstacle+" метрів";
    }
     String swimable(int lengthObstacle){
        return this.name +" проплив "+lengthObstacle+" метрів";
    }
}
