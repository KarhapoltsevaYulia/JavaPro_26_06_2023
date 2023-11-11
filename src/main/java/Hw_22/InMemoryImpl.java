package Hw_22;

import java.util.*;

public class InMemoryImpl implements FitnessTracker {
    private  ArrayList<Object> stringArrayList = new ArrayList<>();

    @Override
    public int saveData(String fileName, Object... data) {
        if (data.length==0){
           throw new RuntimeException("Is Empty data ");
        }
       stringArrayList.addAll(Arrays.asList(data));
        return stringArrayList.size();
    }

    public ArrayList<Object> getStringArrayList() {
        return stringArrayList;
    }
}
