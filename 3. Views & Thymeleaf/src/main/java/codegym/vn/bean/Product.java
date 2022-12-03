package codegym.vn.bean;

public class Product {
    private String id;
    private String name;
    private int number;
    private int price;
    private String description;

    public Product() {
    }

    public Product(String id, String name, int number, int price, String description) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.price = price;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
