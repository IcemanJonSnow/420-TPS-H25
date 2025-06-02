package Item.Item;

public class ItemMilk extends Item{

    private double fat, liters;
    
    public ItemMilk(Category category, int id, String name, double price, double fat, double liters) {
        super(category, id, name, price);
        this.fat = fat;
        this.liters = liters;
    }
    
    
    public Category getCategory() {
        return Category.Milk;
    }
    
    public String getCategoryString() {
        return "Milk";
    }
    
    public double getFat() {return fat;}
    public void setFat(double fat){this.fat = fat;}

    public double getLiters() {return liters;}
    public void setLiters(double liters){this.liters = liters;}
    
    public String getInfoToString(){
        return "";
    }
}
