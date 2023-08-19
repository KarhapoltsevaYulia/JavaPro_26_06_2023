package hw_11.hw_list;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        WorkList workList = new WorkList();
        System.out.println(workList.countOccurance(workList.addList(), "Aaaam"));
        Integer[] test ={1,5,2,1,5,8,9,10};
        System.out.println(Arrays.toString(test));
        System.out.println(workList.toList(test));
        System.out.println(workList.findUnique(workList.toList(test)));
        workList.calcOccurance(workList.addList());
        System.out.println(workList.findOccurance(workList.addList()));
    }
}
