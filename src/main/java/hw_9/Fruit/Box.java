package hw_9.Fruit;
import java.util.*;

public class Box <B extends BaseFruit>  {
    private Object[] fruitArray;
    /**
     * it is index for {@link #fruitArray}
     */
    private int index;
    private int lengthArray;
    private float weight;
    private float weightBox;

    public Object[] getFruitArray() {
        return fruitArray;
    }

    public Box(int lengthArray) {
        this.fruitArray = new Object[lengthArray];
        this.lengthArray = lengthArray;
    }

    public boolean addFruit(B fruit){
        if (this.index==0){
            if (examplArrays(fruit)) {
                addOneFruit(fruit);
                return true;
            }
        } else {
            if (examFirstFruitAdd(fruit)) {
                if (examplArrays(fruit)) {
                    addOneFruit(fruit);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean addFruit(B... fruits) {
        if (this.index==0) {
            if (examplArrays(fruits)) {
                addManyFruit(fruits);
                return true;
            }
        } else {
            if (examFirstFruitAdd(fruits)) {
                if (examplArrays(fruits)) {
                    addManyFruit(fruits);
                    return true;
                }
            }
        }
        return false;
    }
    public float getWeight(){
        if (index!=0) {
            if (fruitArray[0] instanceof Orange){
                weight = Orange.WEIGHT;
            } else{
                if (fruitArray[0] instanceof Apple) {
                    weight = Apple.WEIGHT;
                }
            }
            return this.weightBox=weight*this.index;
        } else System.out.println("Ви не додали у коробку фруктів");
        return 0.0f;
    }
    public boolean compare(Box... box){

            for (int i = 0; i < box.length; i++) {
                if(this.weightBox!=0.0f && box[i].weightBox!=0.0f ) {
                if (box[i].weightBox == this.weightBox) {
                    if (box[i].fruitArray[0].getClass() == this.fruitArray[0].getClass()) {
                        System.out.println("У цих коробках лежать однакові фрукти " + this.fruitArray[0].getClass());
                        System.out.println("Box " + (i + 1) + " еквівалентна по вазі з поточною Вох, і важить кожна з них " +
                                +box[i].weightBox);
                        merge(box);
                    } else {
                        System.out.println("У цих коробках лежать різні фрукти у першій "
                                + box[i].fruitArray[0].getClass() + "у другій " + this.fruitArray[0].getClass());
                        System.out.println("Aле важать коробки однаково");
                    }
                    return true;
                } else {
                    System.out.println();
                    System.out.println("Box " + (i + 1) + " важить " + box[i].weightBox + " не рівна по вазі з поточною Вох, " +
                            "яка важить " + this.weightBox);
                    if (box[i].fruitArray[0].getClass() == this.fruitArray[0].getClass()) {
                        System.out.println("У цих коробках лежать однакові фрукти " + this.fruitArray[0].getClass());
                        merge(box);
                    } else System.out.println("У цих коробках лежать різні фрукти у першій "
                            + box[i].fruitArray[0].getClass() + " у другій " + this.fruitArray[0].getClass());
                }
            } else System.out.println("Ви не додали фруктів у коробку, чи не зважили коробку");
        }
        return false;
    }
    private void merge(Box... box){

        int arrayFreePlacesTransferred;
        int arrayFreePlacesSave;
        Scanner scanner = new Scanner(System.in);

      for (int i=0; i<box.length; i++){
          arrayFreePlacesTransferred= box[i].lengthArray-box[i].index;
          arrayFreePlacesSave=this.fruitArray.length - this.index;
          System.out.println(arrayFreePlacesTransferred+"  "+arrayFreePlacesSave);
          if (arrayFreePlacesSave>0){
              System.out.println("В поточну коробку можна пересипати  "+arrayFreePlacesSave+" Ви згодні пересипати?(Yes/No)");
              if (scanner.nextLine().toUpperCase().contains("Y")){
                  System.out.println();
                  for (int j = index,k=box[i].lengthArray-arrayFreePlacesTransferred-1; j < this.fruitArray.length ; j++) {
                      this.fruitArray[j] = box[i].fruitArray[k];
                      box[i].fruitArray[k] = null;
                      k--;
                      }
                  System.out.println();
              }
          } else System.out.println("В поточну коробку не можна пересипати фрукти, коробка повна");
      }
      for (int i=0; i<box.length; i++){
          for(int j=0; j<box[i].lengthArray;j++)
              System.out.println(box[i].fruitArray[j]);
      }
      System.out.println();
      for (int i=0; i<fruitArray.length; i++){
          System.out.println(fruitArray[i]);
      }
    }
    private void addOneFruit(B fruit){
        this.fruitArray[this.index] = fruit;
        this.index++;
    }
    private void addManyFruit(B... fruits){
        for (B fruit : fruits) {
            addFruit(fruit);
        }
    }
    private boolean examplArrays(B... fruits){

        switch (fruits.length){
            //one elements add
           case 1 -> {
               if ((fruits != null) && (this.fruitArray != null) && (this.lengthArray > 0)) {
                   if (this.index < this.fruitArray.length) {
                       return true;
                   }
               }
           }
           //many elements add
            default -> {
               if (fruits!=null) {
                   int freePlacesArray = fruitArray.length - this.index;
                   if(!((fruits.length > fruitArray.length)||(freePlacesArray < fruits.length))){
                       return true;
                   }
               }
           }
        }
        return false;
    }
    private boolean examFirstFruitAdd(B... fruits){

        for (int i = 0; i < fruits.length; i++) {
            if (fruitArray[0].getClass()==fruits[i].getClass()){
                return true;
            }
        }
        return false;
    }
}