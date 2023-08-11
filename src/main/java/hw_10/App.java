package hw_10;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        MyArrayList<String > myArrayList = new MyArrayList<>();
        myArrayList.add("Sat");
        myArrayList.add("kot");
        myArrayList.add("Cat");

        MyArrayList<String > myArrayList2 = new MyArrayList<>(3);
        myArrayList2.add("kol1111");
        myArrayList2.add("222222");
        myArrayList2.addAll(2,myArrayList);
        System.out.println(myArrayList);
        System.out.println(myArrayList2);
        System.out.println(myArrayList2.retainAll(myArrayList));
        System.out.println(myArrayList2);
//        myArrayList2.add("kol2");
//        myArrayList2.add("kol3");
//        myArrayList2.add("kol4");
//        myArrayList2.add(1,"aaaa");
//        System.out.println(myArrayList2.get(2));
//        System.out.println(myArrayList2.set(4,"iii"));
//        System.out.println(myArrayList.remove(2));
//        System.out.println(myArrayList2.contains("kol1"));
//        myArrayList.clear();
//     //   myArrayList2.add("kol2");
//        System.out.println("------------------------------");
//        System.out.println(myArrayList2);
//        System.out.println(myArrayList2.remove("kol3"));
//        System.out.println(myArrayList2.remove(0));
//        System.out.println(myArrayList.indexOf("fff"));
//        System.out.println(myArrayList2.indexOf("kol2"));
//        myArrayList2.add("kol2");
//        System.out.println(myArrayList.toString());
//        System.out.println(myArrayList2.lastIndexOf("aaaa"));
//        System.out.println(myArrayList2);
//        MyArrayList<String > myArrayList3 = new MyArrayList<>();
//        myArrayList3.add("1");
//        myArrayList3.add("2");
//        myArrayList3.add("3");
//        MyArrayList<String > myArrayList4 = new MyArrayList<>();
//        myArrayList4.add("lop");
//        myArrayList4.add("Array");
//        System.out.println(myArrayList2);
//        myArrayList2.addAll(2,myArrayList4);
//
//        System.out.println(myArrayList2.containsAll(myArrayList3));
//        System.out.println(myArrayList2.containsAll(myArrayList4));
//        MyArrayList<String > myArrayList5 = new MyArrayList<>(myArrayList3);
//        System.out.println(myArrayList2);
//        System.out.println(myArrayList5);

    }
}
