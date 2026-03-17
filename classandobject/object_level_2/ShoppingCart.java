import java.util.ArrayList;

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}

class ShoppingCart {
    ArrayList<CartItem> cart = new ArrayList<>();

     void addItem(CartItem item) {
        cart.add(item);
        System.out.println(item.itemName + " added to cart.");
    }

    void removeItem(String itemName) {
        cart.removeIf(item -> item.itemName.equals(itemName));
        System.out.println(itemName + " removed from cart.");
    }

    void displayTotalCost() {
        double total = 0;
        System.out.println("\n--- Cart Summary ---");
        for (CartItem item : cart) {
            double cost = item.price * item.quantity;
            System.out.println(item.itemName + " x" + item.quantity + " = ₹" + cost);
            total += cost;
        }
        System.out.println("Total Cost: ₹" + total);
    }

     public static void main(String[] args) {
        ShoppingCart sc = new ShoppingCart();
        sc.addItem(new CartItem("Pen", 10.0, 3));
        sc.addItem(new CartItem("Notebook", 50.0, 2));
        sc.addItem(new CartItem("Eraser", 5.0, 5));
        sc.removeItem("Eraser");
        sc.displayTotalCost();
    }
}