public class Slip17_A {
    static boolean isArmstrong(int num) {
        int sum = 0, temp = num, digits = String.valueOf(num).length();
        while (temp > 0) {
            sum += Math.pow(temp % 10, digits);
            temp /= 10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        int[] armstrongs = new int[args.length];
        int count = 0;
        for (String arg : args) {
            int num = Integer.parseInt(arg);
            if (isArmstrong(num)) armstrongs[count++] = num;
        }
        for (int i = 0; i < count; i++) System.out.println(armstrongs[i]);
    }
}
