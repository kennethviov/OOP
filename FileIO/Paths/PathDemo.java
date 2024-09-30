

// Import the necessary classes from the java.nio.file package
import java.nio.file.*; 

public class PathDemo { 
    public static void main(String[] args) { 
        // Create a Path object representing the specified file path
        Path filePath = Paths.get("C:\\Java\\Documents\\Data.txt"); 
        
        // Get the count of elements (directories and file) in the path
        int count = filePath.getNameCount(); 
        
        // Display the full file path as a string
        System.out.println("Path is " + filePath.toString()); 
        
        // Display the first element in the path (at index 0)
        System.out.println("File name is " + filePath.getName(0)); 
        
        // Display the total number of elements in the path
        System.out.println("There are " + count + " elements in the file path"); 
        
        for(int x = 0; x < count; ++x) 
            // Display each element of the path with its corresponding index
            System.out.println("Element " + x + " is " + filePath.getName(x));
    }
}


