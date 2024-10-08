import java.io.File;

public class Slip5_B {
    public static void main(String[] args) {
        for (String fileName : args) {
            File file = new File(fileName);
            if (file.exists() && file.isFile()) {
                if (fileName.endsWith(".txt")) file.delete();
                else System.out.println("Name: " + file.getName() + ", Location: " + file.getAbsolutePath() + ", Size: " + file.length() + " bytes");
            }
        }
    }
}
