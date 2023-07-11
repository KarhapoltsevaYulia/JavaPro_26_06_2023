package hw_4;

import java.util.Scanner;

public  abstract class Animals{
    public final String name;
    private  int counterPartisipant;

    public Animals(String name) {
        this.counterPartisipant++;
        this.name = name;
    }
}
