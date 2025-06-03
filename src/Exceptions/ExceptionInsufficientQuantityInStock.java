package Item.Exceptions;

public class ExceptionInsufficientQuantityInStock extends RuntimeException {
    public ExceptionInsufficientQuantityInStock(int quantity) {
        super("Item " + quantity + " est déjà dans la bases de données");
    }
}
