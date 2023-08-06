package hw_9.exam_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToList {

    public  static <T> List toList(T[] val){
        List<T> tArrayList = new ArrayList<>();
        tArrayList.addAll(Arrays.asList(val));
        System.out.println((T)tArrayList);
        return tArrayList;
    }
}

