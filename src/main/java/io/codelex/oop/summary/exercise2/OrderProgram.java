package io.codelex.oop.summary.exercise2;

public class OrderProgram {
    public static void main(String[] args) {
        try {
            // Create items
            FoodItem milk = new FoodItem("Milk", 0.75, "01.04.2082");
            ElectronicsItem radio = new ElectronicsItem("Radio", 25.00, 100);
            HouseholdItem bucket = new HouseholdItem("Bucket", 5.00, "red");
            ItemPacking packing = new ItemPacking();

            // Create order and add items
            Order order = new Order();
            order.addItem(milk);
            order.addItem(radio);
            order.addItem(bucket);
            order.addItem(packing);

            // Create invoice from order
            Invoice invoice = new Invoice(order, "INV123");

            // Print out invoice
            System.out.println(invoice.getInvoice());
        } catch (WrongOrderException | BadFoodException e) {
            System.out.println(e.getMessage());
        }
    }
}
