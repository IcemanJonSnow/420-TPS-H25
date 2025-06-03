package Item.Inventaire;

import Item.Exceptions.ExceptionItemAlreadyExists;
import Item.Item.*;

public class InventoryManager {

    private InventoryDatabase inventaire =  new InventoryDatabase();

    public InventoryManager() {}

    public void addNewBreadItem(int id, String name, double price, String color, int weight) throws ExceptionItemAlreadyExists {
        if (getItem(id) != null) {
            throw new ExceptionItemAlreadyExists("Item " + id + " est déjà dans la bases de données");
        }
        ItemBread newItem = new ItemBread(Category.Bread, id, name, price, color, weight);
        inventaire.insert(newItem);
    }

    public void addNewEggsItem(int id, String name, double price, String color, int number) throws ExceptionItemAlreadyExists {
        if (getItem(id) != null) {
            throw new ExceptionItemAlreadyExists("Item " + id + " est déjà dans la bases de données");
        }
        ItemEggs newItem = new ItemEggs(Category.Eggs, id, name, price, color, number);
        inventaire.insert(newItem);
    }

    public void addNewMilkItem(int id, String name, double price, double fat, double liters) throws ExceptionItemAlreadyExists {
        if (getItem(id) != null) {
            throw new ExceptionItemAlreadyExists("Item " + id + " est déjà dans la bases de données");
        }
        ItemMilk newItem = new ItemMilk(Category.Milk, id, name, price, fat, liters);
        inventaire.insert(newItem);
    }
    
    public void removeItem(int id){
        inventaire.remove(id);
    }
    
    public void increaseItemQuantity(int id, int quantity){
        getItem(id).increaseQuantityInStock(quantity);
    }
    
    public void decreaseItemQuantity(int id, int quantity){
        getItem(id).decreaseQuantityInStock(quantity);
    }
    
    public Item getItem(int id){
        return inventaire.findById(id);
    }
    
    public Item[] getArrayOfItems(){
        return inventaire.getArrayOfitems();
    }
}
