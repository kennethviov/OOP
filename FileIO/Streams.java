import java.io.*;

public class Streams {
    public static void main(String[] args) {
        File originalFile = new File("input.txt");
        File copiedFile = new File("output.txt");

        try (InputStream input = new FileInputStream(originalFile);
             OutputStream output = new FileOutputStream(copiedFile)) {
            
            // read and write the file byte by byte
            int byteData;
            while ((byteData = input.read()) != -1) {
                output.write(byteData);
            }

            System.out.println("File copied successfully from " + originalFile.getName() + " to " + copiedFile.getName());
            
        } catch (FileNotFoundException e) {
            System.err.println("Error: One of the files was not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("An I/O error occurred during file operations");
            e.printStackTrace();
        }
    }
}


