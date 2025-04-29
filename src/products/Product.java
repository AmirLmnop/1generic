package products;

public abstract class Product {
    private String title;
    private Double price;
    private String id;
    private static int number = 1;
    public Product(String title, Double price) {
        this.title = title;
        this.price = price;
        setId(String.valueOf(Integer.parseInt(generateId())*1000 + number));
        number++;
    }

    //setter & getter
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String toString() {
        return "Title: " + title + ", Price: " + price + ", ID: " + id;
    }
    protected abstract String generateId();
}
