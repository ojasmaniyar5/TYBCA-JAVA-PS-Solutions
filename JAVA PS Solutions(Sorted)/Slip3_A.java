import java.util.Scanner;

public class Slip3_A {
    static boolean isArmstrong(int num) {
        int sum = 0, temp = num, digits = Integer.toString(num).length();
        while (temp > 0) {
            sum += Math.pow(temp % 10, digits);
            temp /= 10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isArmstrong(num) ? "Armstrong" : "Not Armstrong");
    }
}