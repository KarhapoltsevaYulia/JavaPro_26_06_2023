package hw_14;

public class Book extends Product{
    public Book( String nameProduct, double price,boolean possibilityApplyingDiscount) {
        super(TypeProduct.BOOK, nameProduct, price,possibilityApplyingDiscount);
    }
}
