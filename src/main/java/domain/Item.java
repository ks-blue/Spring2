package domain;

public class Item {

    private String name;
    private int price;
    private String color;


    public Item(String name, int pricd, String color) {
        this.name = name;
        this.price = pricd;
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPricd() {
        return price;
    }
    public void setPricd(int pricd) {
        this.price = pricd;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

}
