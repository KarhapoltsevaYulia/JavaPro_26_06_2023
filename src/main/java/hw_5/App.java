package hw_5;

public class App {
    public static void main(String[] args) {
       Ice ice = Ice.builder(Ice.MilkType.COCONUT, Ice.CreamType.LACTOSEFREE, Ice.ButterType.BUTTER_78, Ice.SugarType.MAPLE)
               .berries(null)
               .fruits(Ice.FruitsType.KIWI)
               .build();

        System.out.println(ice.toString());
        Ice iceMilk =Ice.builder(Ice.MilkType.COWS, Ice.CreamType.VEGETABLE, Ice.ButterType.BUTTER_78,Ice.SugarType.REEDY)
                .build();
        System.out.println(iceMilk.toString());
        Ice iceMil = Ice.builder(Ice.MilkType.COWS, Ice.CreamType.VEGETABLE, Ice.ButterType.BUTTER_78,Ice.SugarType.REEDY)
                .build();

    }
}
