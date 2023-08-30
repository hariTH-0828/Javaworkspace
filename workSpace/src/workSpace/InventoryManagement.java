package workSpace.src.workSpace;

public class InventoryManagement {
    public static void main(String[] args) {
        Product product = new Product(100, "Colgate", 20, 10);
        Product product1 = new Product(100, "Colgate", 20, 20);
        String productData = product.getProductById(100);
        System.out.println(productData);
        System.out.println();
        product.purchase(100, 30);
        String productData1 = product.getProductById(100);
        System.out.println(productData1);
        System.out.println();

        int total = Product.getTotalProducts();
        System.out.println("Total products in inventory: " + total); // Output: Total products in inventory: 2
    }
}
