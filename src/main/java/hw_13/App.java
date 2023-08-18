package hw_13;

import hw_13.coffee.order.CoffeeOrderBoard;

public class App {
    public static  void main(String[] args) {

        CoffeeOrderBoard coffeeOrderBoard= new CoffeeOrderBoard();
        coffeeOrderBoard.add();
        coffeeOrderBoard.draw();
        coffeeOrderBoard.deliver();
        coffeeOrderBoard.deliver(-100);
        coffeeOrderBoard.draw();
        coffeeOrderBoard.deliver();
        coffeeOrderBoard.draw();
    }
}
