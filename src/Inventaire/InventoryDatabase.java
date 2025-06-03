package Item.Inventaire;

import Item.Item.Item;

public class InventoryDatabase {

    private int itemsCount = 0;
    private InventoryDatabaseNode first;
    
    public void insert(Item item){
        if (first == null){
            InventoryDatabaseNode newItem = new InventoryDatabaseNode(item);
            first = newItem;
            itemsCount++;
        }
        else{
            InventoryDatabaseNode newItem = new InventoryDatabaseNode(item);
            InventoryDatabaseNode current = first;
            while (current.next != null){
                current = current.next;
            }
            current.next = newItem;
            itemsCount++;
            }
    }
    
    public Item findById(int id){
        if (first == null){
            return null;
        }
        InventoryDatabaseNode current = first;
        while (current.item.getId() != id){
            current = current.next;
            if (current == null){
                return null;
            }
        }
        return current.item;
    }
    
    public void remove(int id){
        if (first == null){
            return;
        }
        if (findById(id) == null){
            return;
        }
        else {
            InventoryDatabaseNode current = first;
            
            if (first.item.getId() == id){
                first = first.next;
                itemsCount--;
            }
            else{
                for (int i = 0; i < itemsCount; i++){
                    if (current.item.getId() == id){
                        current.next = current.next.next;
                        itemsCount--;
                    }
                }
            }
        }
    }
    
    
    public Item[] getArrayOfitems(){
        Item[] items = new Item[itemsCount];
//        int index = 1;
        InventoryDatabaseNode current = first;
//        items[0] = first.item;
//        while (current.next != null){
//            items[index] = current.next.item;
//            index++;
//            current = current.next;
//        }
        
        for (int i = 0; i < itemsCount; i++){
            items[i] = current.item;
            current = current.next;
        }
        return items;
    }
}
