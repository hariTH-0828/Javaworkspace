package workSpace.src.workSpace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Product {
    private long productId;
    private String name;
    private double price;
    private int quantity;

    private static final HashMap<Long, ArrayList<String>> productDB = new HashMap<>();
    // Static variable to keep track of total products in the inventory
    private static int totalProducts = 0;

    public Product(long id, String name, double price, int quantity) {
        this.productId = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;

        if(!productDB.containsKey(id)) {
            productDB.put(id, new ArrayList<>() {{add(name); add(String.valueOf(price)); add(String.valueOf(quantity));}});
            // Increment the totalProducts count when a new product is created
            totalProducts++;
        }else {
            int newQuantity = Integer.parseInt(productDB.get(id).get(2)) + quantity;
            productDB.replace(id, productDB.get(id), new ArrayList<>() {
                {
                    add(name);
                    add(String.valueOf(price));
                    add(String.valueOf(newQuantity));
                }
            });
        }
    }

    // Getter for totalProducts
    public static int getTotalProducts() {
        return totalProducts;
    }

    public void purchase(long id, int quantity) {
        if(!productDB.containsKey(id)) return;
        ArrayList<String> productDetails = productDB.get(id);
        int balQuantity = Integer.parseInt(productDetails.get(2));

        if(balQuantity < quantity) {
            System.out.println("Insufficient Quantity");
            return;
        }

        balQuantity -= quantity;
        if(balQuantity == 0) {
            productDB.remove(id);
            totalProducts--;
        }else {
            int finalBalQuantity = balQuantity;
            productDB.replace(id, productDB.get(id), new ArrayList<>() {
                {
                    add(productDB.get(id).get(0));
                    add(productDB.get(id).get(1));
                    add(String.valueOf(finalBalQuantity));
                }
            });
        }
    }

    public String getProductById(long id) {
        if (productDB.isEmpty()) return "There is no available product";
        return "Product Name : "+productDB.get(id).get(0)
                +"\nProduct price : "+productDB.get(id).get(1)
                +"\nProduct quantity : "+productDB.get(id).get(2);

    }
}

