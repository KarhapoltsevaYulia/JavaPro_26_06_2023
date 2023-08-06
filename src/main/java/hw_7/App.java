package hw_7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception  {

        String[][] arrayValueCalculatorss = {
              {"1","1","1","1"},
              {"1","1","4","5"},
               {"1","f","1","1"},
             {"1","5","1","a"}
        };

        ArrayValueCalculator arrayValueCalculator = new ArrayValueCalculator(arrayValueCalculatorss);

    }
}
