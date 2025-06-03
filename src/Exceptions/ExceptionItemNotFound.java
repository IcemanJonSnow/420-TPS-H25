package Item.Exceptions;

public class ExceptionItemNotFound extends Exception {
    public ExceptionItemNotFound(int id) {
        super("Item " + id + " n'est pas dans la bases données");
    }
}
