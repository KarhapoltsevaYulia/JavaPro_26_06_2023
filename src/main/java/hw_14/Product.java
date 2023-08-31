package hw_14;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public abstract class Product {
   public String nameProduct;
   public TypeProduct typeProduct;
   public Double price;
    Boolean possibilityApplyingDiscount;
    static Double priceApplyingDiscount = 0.10d;
    LocalDate dateCreate;
    int idNumberProduct;
    int couter=0;

    public Product(TypeProduct typeProduct,
                   String nameProduct,
                   double price,
                   boolean possibilityApplyingDiscount) {
        this.typeProduct=typeProduct;
        this.nameProduct = nameProduct;
        this.possibilityApplyingDiscount=possibilityApplyingDiscount;
        examplNumberPrice(price);
        this.dateCreate = LocalDate.now();
        this.idNumberProduct = couter;
        couter++;
    }
    private void examplNumberPrice(double price){
       if (price>0) {
           this.price = price;
       } else {
           throw new NullPointerException("Prices < 0");
       }
    }
   public static ArrayList<Product> createListProduct(Product[] products){
        Stream<Product> streamm = Stream.of(products);
        ArrayList<Product> streamList= streamm
                .filter(product -> product.typeProduct==TypeProduct.BOOK)
                .filter(product -> product.getPrice()>250)
                .collect(Collectors.toCollection(ArrayList::new));
        streamList.forEach(System.out::println);
       return streamList ;
    }

   private static void getProductApplyingDiscount(ArrayList<Product> streamList){
        double temp = 0.0;
        for (Product product : streamList) {
            temp = product.getPrice();
            temp = temp * priceApplyingDiscount;
            product.setPrice(product.getPrice()-temp);
        }
    }
    static void getListProductApplyingDiscount (Product[] products){
        Stream<Product> streamm = Stream.of(products);
        ArrayList<Product> streamList= streamm
                .filter(product -> product.possibilityApplyingDiscount)
                .collect(Collectors.toCollection(ArrayList::new));
        getProductApplyingDiscount(streamList);
        streamList.forEach(System.out::println);
    }
    static void getMinPriceProduct(Product[] products){
        Stream<Product> streamm = Stream.of(products);
        Product streamList = streamm
                .filter(product -> product.typeProduct==TypeProduct.BOOK)
                .min(Comparator.comparing(Product::getPrice)).get();
        if (streamList==null){
            System.out.println("This Book on the Min price don't no!");
        } else {
            System.out.println("Min price on the Book = " + streamList);
        }
    }

    public static void addLastProduct(Product[] products){
        Stream<Product> streamm = Stream.of(products);
        ArrayList<Product> streamList= streamm
                .sorted()
                .skip(3)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(streamList);
    }
    public static void calculatePriceProduct(Product[] products){
        Stream<Product> streamm = Stream.of(products);
        Boolean streamList= streamm
                .filter(product -> product.getPrice()<75)
                .allMatch(date -> {
                    int year = date.getDateCreate().getYear();
                    return year == 2023;
                });
        System.out.println(streamList);
    }
    public static void mapList(Product[] products){
        Map<TypeProduct,ArrayList<String>> listProduct = new HashMap<>();
        Stream<Product> streamm = Stream.of(products);
        ArrayList<String> streamList= streamm
                .map(Product::getNameProduct)
                .collect(Collectors.toCollection(ArrayList::new));
        for (Product product:products) {
            listProduct.put(product.getTypeProduct(),streamList);
        }
        System.out.println(listProduct);
    }
    public LocalDate getDateCreate() {
        return dateCreate;
    }
    private   void setPrice(Double price) {
        this.price = price;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public TypeProduct getTypeProduct() {
        return typeProduct;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameProduct='" + nameProduct + '\'' +
                ", typeProduct=" + typeProduct +
                ", price=" + price +
                ", possibilityApplyingDiscount=" + possibilityApplyingDiscount +
                ", date=" + dateCreate +
                '}';
    }
    public enum TypeProduct{
        BOOK,
        TOYS,
        NOTEBOOK,
        PENS,
        PENCILS,
        RULERS;
    }
}
