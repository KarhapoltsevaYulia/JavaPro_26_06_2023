package hw_4;

import java.util.Scanner;

public class Cat extends Animals{
    public Cat(String name) {
        super(name);
    }

    // кіт біг 200 метрів
    //кіт не вміє плавати
    @Override
    String running(int lengthObstacles){
        return this.name +" пробіг "+lengthObstacles+" метрів";
    }

}
