package Item.Item;

public class ItemEggs extends Item {

    private String color;
    private int number;
    
    public ItemEggs(Category category, int id, String name, double price, String color, int number) {
        super(category, id, name, price);
        this.color = color;
        this.number = number;
    }
    
    public Category getCategory() {
        return Category.Bread;
    }
    
    public String getCategoryString(){
        return "Bread";
    }
    
    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}
    
    public int getNumber() {return number;}
    public void setNumber(int number) {this.number = number;}
    
    public String infoToString(){
        return "Item Information \n Id \t: " + getId() + "\nName \t: " + getName() + "\n Price \t: " + getPrice() +
                "\nIn stock\t: " + getQuantityInStock() + "\n Color\t: " + getColor() +  "\n Number \t: " + getNumber();
    }
}
