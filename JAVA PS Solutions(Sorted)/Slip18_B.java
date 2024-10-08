import java.io.*;

public class Slip18_B {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("source.txt"));
             PrintWriter pw = new PrintWriter(new FileWriter("target.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                pw.println(line.replaceAll("[0-9]", "*").replaceAll("[a-zA-Z]", m -> 
                    Character.isLowerCase(m.charAt(0)) ? Character.toUpperCase(m.charAt(0)) : Character.toLowerCase(m.charAt(0))));
            }
        }
    }
}
