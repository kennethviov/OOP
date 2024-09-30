import java.nio.file.*; // Provides classes for file and path handling
import java.nio.file.attribute.*; // Provides classes for file attribute handling
import java.io.IOException; // Provides the class to handle input/output exceptions

public class PathDemo5 {
    public static void main(String[] args) {

        System.out.println();
        
        // Define the path to the file using the Paths class
        // This specifies the location of "FileIO.txt" on the file system
        Path filPath = Paths.get("C:\\Users\\kenne\\OneDrive\\Documents\\Third Sem\\NonEmpty\\FileIO.txt");

        try {
            // Read basic file attributes from the specified path
            // 'BasicFileAttributes' interface contains methods to access file attributes
            BasicFileAttributes attr = Files.readAttributes(filPath, BasicFileAttributes.class);
            
            // Display the creation time of the file
            System.out.println("Creation time " + attr.creationTime());
            
            // Display the last modification time of the file
            System.out.println("Last modification time " + attr.lastModifiedTime());
            
            // Display the size of the file in bytes
            System.out.println("Size " + attr.size());
        } catch (IOException e) {
            // Handle exceptions related to input/output operations, such as file not found
            System.out.println("IO Exception");
        }

        System.out.println();
    }
}


