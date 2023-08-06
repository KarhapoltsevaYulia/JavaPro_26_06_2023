package hw_9.Fruit;

public class App {
    public static void main(String[] args) {

        Box<BaseFruit> box = new Box(5);
        Box<BaseFruit> box2 = new Box(7);
        Box<BaseFruit> box3 = new Box(7);

        box.addFruit(new Orange(),new Orange());
        box2.addFruit(new Apple(),new Apple(),new Apple(),new Apple(),new Orange(), new Apple(),new Apple());
        box3.addFruit(new Apple(),new Apple(),new Apple(), new Apple(),new Apple());

        System.out.println(box.getWeight());
        System.out.println(box2.getWeight());
        System.out.println(box3.getWeight());
        box2.compare(box3);
        box3.compare(box);
    }
}
