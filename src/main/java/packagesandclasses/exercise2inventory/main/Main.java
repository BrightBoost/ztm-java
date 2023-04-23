package packagesandclasses.exercise2inventory.main;

import packagesandclasses.exercise2inventory.inventory.Inventory;
import packagesandclasses.exercise2inventory.inventory.Product;
import packagesandclasses.exercise2inventory.inventory.Warehouse;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.productId = 1001;
        product.productName = "Laptop";
        product.price = 1200.0;

        Inventory inventory = new Inventory();
        inventory.product = product;
        inventory.quantity = 5;

        Warehouse warehouse = new Warehouse();
        warehouse.warehouseId = 1;
        warehouse.warehouseName = "Main Warehouse";
        warehouse.inventories = "Placeholder"; // Placeholder for now, later we'll create an ArrayList of Inventory objects

        System.out.println("Product ID: " + inventory.product.productId + ", Name: " + inventory.product.productName + ", Price: " + inventory.product.price);
        System.out.println("Inventory Quantity: " + inventory.quantity);
        System.out.println("Warehouse ID: " + warehouse.warehouseId + ", Name: " + warehouse.warehouseName);
    }
}
