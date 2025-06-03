package Item.Item;

public class ItemBread extends Item {

    private String color;
    private double weight;
    
    public ItemBread(Category category, int id, String name, double price, String color, double weight) {
        super(category, id, name, price);
        this.color = color;
        this.weight = weight;
    }
    
    public Category getCategory() {
        return Category.Bread;
    }
    
    public String getCategoryString() {
        return "Bread";
    }
    
    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}
    
    public double getWeight() {return weight;}
    public void setWeight(double weight) {this.weight = weight;}
    
    public String infoToString() {
        return "Item Information \n Id \t: " + getId() + "\nName \t: " + getName() + "\n Price \t: " + getPrice() +
                "\nIn stock\t: " + getQuantityInStock() + "\n Color\t: " + getColor() +  "\n Weight \t: " + getWeight();
    }
}
