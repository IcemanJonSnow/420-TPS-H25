package Item.Exceptions;

public class ExceptionItemAlreadyExists extends Exception {
    public ExceptionItemAlreadyExists(int id) {
        super("Item " + id + " est déjà dans la bases de données");
    }
}
