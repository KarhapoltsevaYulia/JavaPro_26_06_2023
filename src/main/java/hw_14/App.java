package hw_14;

import java.util.Arrays;
import java.util.List;

import static hw_14.Product.*;

public class App {
    public static void main(String[] args) {
        Product[] products = {
                new Book ( "King",250,true),
                new Book ( "ing",260,true),
                new Book ( "Pol",90,false),
                new Book ( "Poly",70,false),
                new Toys("Car",90,true),
                new Toys("Dol",90,false),

        };
        createListProduct(products);
        getListProductApplyingDiscount(products);
         getMinPriceProduct(products);
        calculatePriceProduct(products);
        mapList(products);

    }
}
