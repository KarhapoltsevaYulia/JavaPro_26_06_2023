package hw_12;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        MyLinkedList<String> linked = new MyLinkedList<>();
        linked.add("Test");
        linked.add("Test2");
        linked.add("Test3");
        linked.add("Test4");
        linked.add("Test5");

        System.out.println(Arrays.toString(linked.toArray()));
       // System.out.println(Arrays.toString(add2.toArray()));
        MyLinkedList<String> add3 = new MyLinkedList<>(linked);
        System.out.println(Arrays.toString(add3.toArray()));

     //   System.out.println(add3.remove("Test2"));
      //  add3.remove("Test3");
     //   System.out.println(add3.contains("Tass"));
     //   System.out.println(add3.contains("Test3"));

      //   System.out.println(add3.removeFirstOccurrence("Test3"));
     //    System.out.println(add3.removeLastOccurrence("Test"));
      //   add3.removeAll(linked);
     //    add3.remove("Test2");
        // System.out.println(add3.getFirst());
        add3.offer("yyyyy");
        add3.offer("eeeee");
      //  add3.retainAll(linked);
        System.out.println(Arrays.toString(add3.toArray()));

    }
}
