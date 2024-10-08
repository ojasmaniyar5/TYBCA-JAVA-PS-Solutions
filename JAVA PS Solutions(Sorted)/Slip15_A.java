import java.util.*;

public class Slip15_A {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie"};
        String search = new Scanner(System.in).nextLine();
        int index = Arrays.asList(names).indexOf(search);
        System.out.println(index != -1 ? "Found at index: " + index : "Name not found");
    }
}
