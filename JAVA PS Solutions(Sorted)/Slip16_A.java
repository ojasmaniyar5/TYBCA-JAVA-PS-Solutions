public class Slip16_A {
    static int sum(int n) {
        return n == 0 ? 0 : n % 10 + sum(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(sum(1234)); // Example: 1 + 2 + 3 + 4 = 10
    }
}
