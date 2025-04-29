import inventory.Inventory;
import products.*;

import java.util.ArrayList;

public class Main {
    public static double calculateTotalPrice (Inventory <? extends Product> inventory ){
        ArrayList<Product> products = (ArrayList<Product>) inventory.getItems();
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
    public static void main(String[] args) {

        Inventory<Book> books = new Inventory<>();
        Inventory<Notebook> notebooks = new Inventory<>();
        Inventory<Accessory> accessories = new Inventory<>();

        Book firstB = new Book("physic" , 140.0, "amir" , "Mahi" , "Novel");
        Book secondB = new Book("story" , 220.0 , "hamla" , "Mahi" , "short story");

        Notebook firstNote = new Notebook("planer" , 15.0 , 50 , true);
        Notebook secondNote = new Notebook("sticker" , 15.0 , 50 , false);

        Accessory firstAccessory = new Accessory("rings" , 100.0 , "roseGold");
        Accessory secondAccessory = new Accessory("necles" , 100.0 , "silver");

        books.addItems(firstB);
        books.addItems(secondB);

        notebooks.addItems(firstNote);
        notebooks.addItems(secondNote);

        accessories.addItems(firstAccessory);
        accessories.addItems(secondAccessory);

        books.displayAll();
        notebooks.displayAll();
        accessories.displayAll();

        books.removeItemsById(firstB.getId());
        notebooks.removeItemsById(firstNote.getId());

        System.out.println("Total price is: " + calculateTotalPrice(books));
        System.out.println("Total price is: " + calculateTotalPrice(notebooks));
        System.out.println("Total price is: " + calculateTotalPrice(accessories));

        books.findItemsById(firstB.getId());
        accessories.findItemsById(firstAccessory.getId());

        accessories.applyDiscount("ring" , 50);
        books.applyDiscount("White Nights" , 50);

        books.displayAll();
        notebooks.displayAll();
        accessories.displayAll();
    }
}