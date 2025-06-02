package Item.Exceptions;

public class ExceptionItemNotFound extends Exception {
    public ExceptionItemNotFound(int id) {
        System.out.println("Item Not Found");
    }
}
