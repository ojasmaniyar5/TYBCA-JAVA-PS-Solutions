import java.io.*;

public class Slip21_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            for (String word : line.split(" ")) {
                System.out.println(new StringBuilder(word).reverse());
            }
        }
        br.close();
    }
}
