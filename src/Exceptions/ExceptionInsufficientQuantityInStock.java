package Item.Exceptions;

public class ExceptionInsufficientQuantityInStock extends Exception {
    public ExceptionInsufficientQuantityInStock(int quantity) {
        System.out.println("Insufficient Quantity in Stock");
    }
}
