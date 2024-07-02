import java.util.Scanner;

public class Slip4A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      System.out.println("Enter a string:");
        String input = scanner.nextLine();
        System.out.println("Alternate characters in the given string:");
        for (int i = 0; i < input.length(); i += 2) {
            System.out.print(input.charAt(i) + " ");
        }
        scanner.close();
    }
}
