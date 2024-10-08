import java.util.*;

public class Slip13_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) list.add(sc.nextInt());
        Collections.reverse(list);
        System.out.println(list);
    }
}
