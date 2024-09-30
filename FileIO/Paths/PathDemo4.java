import java.nio.file.*; 
import java.io.IOException; 

public class PathDemo4 { 
    public static void main(String[] args) {
        System.out.println();
        // Create a Path object representing the file path
        Path filePath = Paths.get("C:\\Users\\kenne\\OneDrive\\Documents\\Third Sem\\NonEmpty.zip"); 
        
        try {
            // Use Files.delete to delete the file or directory
            Files.delete(filePath); 
            System.out.println("File or directory is deleted"); 
        } 
        // Catch the exception if the file or directory does not exist
        catch (NoSuchFileException e) {
            System.out.println("No such file or directory");
        } 
        // Catch the exception if trying to delete a non-empty directory
        catch (DirectoryNotEmptyException e) {
            System.out.println("Directory is not empty"); 
        } 
        // Catch any other I/O exception (e.g., insufficient permissions)
        catch (IOException e) { 
            System.out.println("No permission to delete"); 
        }

        System.out.println();
    } 
}


