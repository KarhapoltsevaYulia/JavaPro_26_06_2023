package hw_13.coffee.order;

import hw_13.coffee.order.Order;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoffeeOrderBoard  extends Order{
    int counterNumber=0;
    public Map<Integer,String> mapOrder = new HashMap<>();


    public void add(){
        List<Order> order = List.of(
                new Order(counterNumber++,"Pol"),
                new Order(counterNumber++,"Alex"),
                new Order(counterNumber++,"Pitom"),
                new Order(counterNumber++,"Roma")
        );

        for (Order o:order){
            mapOrder.put(o.orderNumber, o.nameCustomer);
        }
    }
    public void deliver(){
        for(int key: mapOrder.keySet()){
            if (key>0){
                if (mapOrder.keySet().remove(key)) {
                    System.out.println("Zakaz = "+ key+" vudano");
                    break;
                }
            }
        }
    }
    public void deliver(int counterNumber){

        for(int key: mapOrder.keySet()){
            if (key>0){
                if (mapOrder.keySet().remove(counterNumber)) {
                    System.out.println("Zakaz  "+ key+" vudano!!!!");
                    break;
                }
            }
        }
    }
    public void draw(){
        System.out.println("Невиконані замовлення!");
        for(Map.Entry<Integer,String> entry: mapOrder.entrySet()){
            System.out.println("-----------------");
            System.out.println("||"+entry.getKey()+"  ||  "+entry.getValue()+"  ||");
            System.out.println("-----------------");
        }
    }
}
