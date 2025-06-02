package Item.Exceptions;

public class ExceptionItemAlreadyExists extends Exception {
    public ExceptionItemAlreadyExists(int id) {
        System.out.println("Item Already Exists");
    }
}
