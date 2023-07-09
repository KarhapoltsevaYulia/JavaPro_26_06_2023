package hw_4;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* Animals[] ychasniki = new Animals[]
           {
                   new Cat("aaaa"),
                   new Dog("bbbb"),
                   new Cat("cccc"),
                   new Dog ("dddd")
           };
    ychasniki.*/
    /*    Cat ychasnik = new Cat("aaaa");
        Dog ychasnik2 = new Dog("aaaa");
        ychasnik2.running(100);*/
        String answer;
        Animals[] partisipant = new Animals[10];
        int i = 0;
        do {
            System.out.println("Хочете додати учасника? (Yes/yes)(No/no)");
            answer = scanner.nextLine().toUpperCase();
            while (answer.equals("Y")) {
                System.out.println("Введіть, якого участника хочете додати: (Сat/Dog)");
                String name = scanner.nextLine().toUpperCase();

                while ((name.contains("C") || name.contains("CA") || name.contains("CAT"))) {
                    partisipant[i] = createCat(partisipant,i);
                    i++;
                    break;
                }
                scanner.nextLine();
                break;
            }
        } while ((answer.equals("Y")));
        for (Animals par:partisipant) {
            System.out.println(par.name);

        }
    }

    private static Animals createCat(Animals[] par, int i) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя Коту ");
        return new Cat(scanner.nextLine());
    }
}

