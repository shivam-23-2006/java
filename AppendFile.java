// this code appends a file
// SHIVAM KUMAR
import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {
    public static void main(String[] args) {
        
        String contentToAppend = "\nThis is a new line appended to the file.";

        try (FileWriter writer = new FileWriter("example.txt", true)) {
            
            writer.write(contentToAppend);
            
            System.out.println("Successfully appended data to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred during file appending.");
            e.printStackTrace();
        }
    }
}