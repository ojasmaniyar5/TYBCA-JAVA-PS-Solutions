import java.io.File;
import java.io.IOException;

public class Slip22_B {
    public static void main(String[] args) throws IOException {
        // 1. Create a file
        File file = new File("example.txt");
        if (file.createNewFile()) System.out.println("File created: " + file.getName());
        else System.out.println("File already exists.");

        // 2. Rename the file
        File renamedFile = new File("renamed_example.txt");
        if (file.renameTo(renamedFile)) System.out.println("File renamed to: " + renamedFile.getName());

        // 3. Delete the file
        if (renamedFile.delete()) System.out.println("Deleted the file: " + renamedFile.getName());

        // 4. Display path of the file
        System.out.println("Path of the file: " + renamedFile.getAbsolutePath());
    }
}
