package Item.Item;

public abstract class Item {

    private Category category;
    private int id;
    private String name;
    private double price;
    private int quantityInStock;
    
    public Item(Category category, int id, String name, double price) {
        this.category = category;
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantityInStock = 0;
    }
    
    public abstract Category getCategory();
    
    public abstract String getCategoryString();
    
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    
    public double getPrice() {return price;}
    public void setPrice(double price) {this.price = price;}
    
    public int getQuantityInStock() {return quantityInStock;}
    public void setQuantityInStock(int quantityInStock) {this.quantityInStock = quantityInStock;}
    
    public void increaseQuantityInStock(int quantityInStock) {
        this.quantityInStock += quantityInStock;
    }
    
    public void decreaseQuantityInStock(int quantityInStock) {
        this.quantityInStock -= quantityInStock;
    }
    
    public String infoToString() {
        String info = "";
        switch (category) {
            case Eggs ->
            {
                ItemEggs item = (ItemEggs)this;
                 info = "Item Information \n Id \t: " + item.getId() + "\nName \t: " + item.getName() + "\n Price \t: " + item.getPrice() +
                        "\nIn stock\t: " + item.getQuantityInStock() + "\n Color\t: " + item.getColor() +  "\n Number \t: " + item.getNumber();
            }
            case Bread ->
            {
                ItemBread item = (ItemBread) this;
                info = "Item Information \n Id \t: " + item.getId() + "\nName \t: " + item.getName() + "\n Price \t: " + item.getPrice() +
                        "\nIn stock\t: " + item.getQuantityInStock() + "\n Color\t: " + item.getColor() +  "\n Weight \t: " + item.getWeight();
            }
            case Milk ->
            {
                ItemMilk item = (ItemMilk) this;
                info = "Item Information \n Id \t: " + item.getId() + "\nName \t: " + item.getName() + "\n Price \t: " + item.getPrice() +
                        "\nIn stock\t: " + item.getQuantityInStock() + "\n Fat\t: " + item.getFat() +  "\n Liters \t: " + item.getLiters();
            }
            case Unknown ->
            {
                info = "Item Information inconnu";
            }
        }
        return info;
    }
    
    public String toString() {
        return this.infoToString();
    }
}
