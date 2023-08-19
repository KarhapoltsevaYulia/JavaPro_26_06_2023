package hw_11.phonebook;

import java.util.*;

public class PhoneDirectory {
    Map<String,List<Long>> mapPhoneDirectory = new HashMap<>();
    List<Record> recordy = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public void add(String nameUser, long telepfone){

        if (mapPhoneDirectory.isEmpty()){
            recordy.add(new Record(nameUser, telepfone));
            addElementMap();
        } else {
            if (mapPhoneDirectory.containsKey(nameUser)) {
                for (Record record : recordy) {
                    if(record.name.equals(nameUser)){
                        record.listTelepfone.add(telepfone);
                        mapPhoneDirectory.put(record.getName(),record.getListTelepfone());
                    }
                }
            } else {
                recordy.add(new Record(nameUser, telepfone));
                addElementMap();
            }
       }
    }

    public List  find(String nameSubscriber){
        if (mapPhoneDirectory.containsKey(nameSubscriber)) {
            return  mapPhoneDirectory.get(nameSubscriber);
        }
        return null;
    }
    public List  findAll(List<String> nameSubscriber){
            for (String peopleName : nameSubscriber) {
               return find(peopleName);
            }
        return  null;
    }
    public void print(){
        System.out.println("______________PhoneContacts______________________");
        for (String key: mapPhoneDirectory.keySet()){
            System.out.print("|| "+key+" :  || "+ mapPhoneDirectory.get(key)+" ||");
            System.out.println();
        }
        System.out.println("-------------------------------------------------");
    }
    private void addElementMap(){
        for (Record recordT : recordy) {
            mapPhoneDirectory.put(recordT.getName(), recordT.getListTelepfone());
        }
    }
    public void userAnswer(){
        Long tempTelepfone = 0L;
        System.out.println("Хочете ввести нового адрессата у записну книгу? (Y/n)");

        while (scanner.nextLine().equalsIgnoreCase("Y")){
            System.out.println("Введіть будь ласка ім'я людини");
            String tempName= scanner.nextLine();
            System.out.println("Введіть номер телефона абонента");
            while (true){
                if (scanner.hasNextLong()){
                    tempTelepfone =  scanner.nextLong();
                    scanner.nextLine();
                }
                if (tempTelepfone!= 0) break;
            }
            add(tempName,tempTelepfone);
           System.out.println("Хочете ввести нового адрессата у записну книгу? (Y/n)");
        }
    }
    public void findPrint(){
        while(true) {
            System.out.println("Введіть ім'я контака якого хочете знайти?");
            String tempName = scanner.nextLine();
            if (mapPhoneDirectory.containsKey(tempName)) {
                System.out.println(find(tempName));
            } else {
                System.out.println("Абонета не знайдено");
                System.out.println("Спробуєте ще раз знайти?(Y/N)");
                if (scanner.nextLine().equalsIgnoreCase("Y")) {
                continue;
                } else{
                    break;
                }
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PhoneDirectory that = (PhoneDirectory) o;

        return Objects.equals(mapPhoneDirectory, that.mapPhoneDirectory);
    }

    @Override
    public int hashCode() {
        return mapPhoneDirectory != null ? mapPhoneDirectory.hashCode() : 0;
    }
}
