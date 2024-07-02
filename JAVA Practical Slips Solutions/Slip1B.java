import java.io.*;

public class Slip1B {
    public static void main(String[] args) {
        // Specify the source and destination file paths
        String sourceFilePath = "source.txt";
        String destinationFilePath = "destination.txt";

        try (
            // Create BufferedReader to read from the source file
            BufferedReader reader = new BufferedReader(new FileReader(sourceFilePath));
            // Create BufferedWriter to write to the destination file
            BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFilePath))
        ) {
            String line;
            // Read each line from the source file
            while ((line = reader.readLine()) != null) {
                // Filter out numeric data using a regular expression
                String filteredLine = line.replaceAll("\\d", "");
                // Write the filtered line to the destination file
                writer.write(filteredLine);
                writer.newLine();
            }
            System.out.println("Non-numeric data has been copied successfully.");
        } catch (IOException e) {
            // Handle any I/O errors
            e.printStackTrace();
        }
    }
}
