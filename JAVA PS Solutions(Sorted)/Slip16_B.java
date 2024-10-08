import java.util.*;

class Employee {
    static void sortAndDisplay(String[] names) {
        Arrays.sort(names);
        for (String name : names) System.out.println(name);
    }
}

public class Slip16_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = new String[n];
        for (int i = 0; i < n; i++) names[i] = sc.next();
        Employee.sortAndDisplay(names);
    }
}
