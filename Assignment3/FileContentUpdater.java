import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileContentUpdater {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\soura\\OneDrive\\Pictures\\Screenshots\\Screenshot (37).png";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));   // Read the existing contents of the file
            StringBuilder contentBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                contentBuilder.append(line);
                contentBuilder.append(System.lineSeparator());
            }
            reader.close();
            String newContent = "This is the new content of the file.";// Modify the contents

            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));// Write the new contents to the file
            writer.write(newContent);
            writer.close();

            System.out.println("File content updated successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while updating the file: " + e.getMessage());
        }
    }
}
