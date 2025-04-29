package inventory;
import products.Product;
import java.util.ArrayList;

public class Inventory <T extends Product> {
    private ArrayList<T> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    // setter & getter
    public ArrayList<T> getItems() {
        return items;
    }
    public void setItems(ArrayList<T> items) {
        this.items = items;
    }
    public void applyDiscount (String productName, int discount){
        for (T item : items) {
            if(item.getTitle().equals(productName)){
                item.setPrice(item.getPrice()*(100 - discount)/100);
                return;
            }
        }

    }
    public void addItems (T product) {
        items.add(product);
    }
    public void removeItemsById(String id) {
        for(T item : items) {
            if(item.getId().equals(id)){
                items.remove(item);
                System.out.println("Removed successfully");
                return;
            }
        }
    }
    public T findItemsById(String id) {
        for (T item : items) {
            if(item.getId().equals((id))){
                System.out.println("Item found");
                return item;
            }
        }
        System.out.println("Item not found");
        return null;
    }
    public void displayAll() {
        for (T item : items) {
            System.out.println(item.toString());
        }
    }
}