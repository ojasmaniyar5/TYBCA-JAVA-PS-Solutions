import java.util.Scanner;

public class Slip25_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println(str.equals(new StringBuilder(str).reverse().toString() ? "Palindrome" : "Not a palindrome"));
        sc.close();
    }
}
