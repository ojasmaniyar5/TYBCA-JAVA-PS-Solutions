import java.util.Scanner;

class Product {
    int pid, qty;
    String pname;
    double price;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Product ID, Name, Price, Quantity: ");
        pid = sc.nextInt();
        pname = sc.next();
        price = sc.nextDouble();
        qty = sc.nextInt();
    }

    void display() {
        System.out.println("Product ID: " + pid + ", Name: " + pname + ", Price: " + price + ", Quantity: " + qty);
    }

    double totalAmount() {
        return price * qty;
    }
}

public class Slip17_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {
            products[i] = new Product();
            products[i].input();
        }

        double total = 0;
        for (Product product : products) {
            product.display();
            total += product.totalAmount();
        }
        System.out.println("Total Amount: " + total);
    }
}
