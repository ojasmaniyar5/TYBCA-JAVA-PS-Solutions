import java.io.File;

public class Slip8_B {
    public static void main(String[] args) {
        File dir = new File(args[0]);
        for (File file : dir.listFiles((d, name) -> name.endsWith(".txt")))
            System.out.println(file.getName());
    }
}
