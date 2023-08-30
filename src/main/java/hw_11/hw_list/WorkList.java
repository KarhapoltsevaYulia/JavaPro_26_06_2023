package hw_11.hw_list;

import java.util.*;

public class WorkList {

    public List<String> addList() {
        List<String> list = new ArrayList<>();

        list.add("Mama");
        list.add("Mama");
        list.add("Mama");
        list.add("sad");
        list.add("pol");
        list.add("sad");
        list.add("pol");
        list.add("Aaa");
        list.add("Mama");
        return list;
    }

    public int countOccurance(List<String> stringList, String testString) {
        if (stringList.isEmpty()) {
            throw new NullPointerException("List is Empty");
        }
        int counter = 0;
        Object[] test = stringList.toArray();
        for (Object o : test) {
            if (o.equals(testString)) {
                counter++;
            }
        }
        return counter;
    }

    public <T> List toList(T[] test) {
        if (test.length == 0) {
            throw new RuntimeException("The passed array is empty");
        }
        List<T> tArrayList = new ArrayList<>(test.length);
        tArrayList.addAll(Arrays.asList(test));
        return tArrayList;
    }

    public Set<Integer> findUnique(List<Integer> integerList) {
        if (integerList.isEmpty()) {
            throw new NullPointerException("List is Empty");
        }
        Set<Integer> list = new HashSet<>(integerList);
        return list;
    }

    public void calcOccurance(List<String> stringList) {
        if (stringList.isEmpty()) {
            throw new NullPointerException("List is Empty");
        }
        Set<String> list = new HashSet<>(stringList);
        int counter = 0;
        for (String s : list) {
            for (String value : stringList) {
                if (s.equals(value)) {
                    counter++;
                }
            }
            System.out.println(counter + " = " + s);
            counter = 0;
        }
    }

    public Map findOccurance(List<String> stringList) {


        if (stringList.isEmpty()) {
            throw new NullPointerException("List is Empty");
        }
        Map<String, Integer> map;
        Set<String> list = new HashSet<>(stringList);
        map = new HashMap<>();
        int counter = 0;
        for (String s : list) {
            for (String value : stringList) {
                if (s.equals(value)) {
                    counter++;
                }
            }
            map.put(s, counter);
            counter = 0;
        }
        return map;
    }
}



