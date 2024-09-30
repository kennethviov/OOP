import java.io.*;

public class FileOperationsExample {
    public static void main(String[] args) {
        // Specify the path for the file you want to create
        File originalFile = new File("C:\\Users\\kenne\\OneDrive\\Desktop\\2ndYear1stSem\\codes\\OOPROG\\FileIO\\Practice\\originalFile.txt");
        File copiedFile = new File("C:\\Users\\kenne\\OneDrive\\Desktop\\2ndYear1stSem\\codes\\OOPROG\\FileIO\\Practice\\copiedFile.txt");

        // Step 1: Create the file and write 3 lines of text into it
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(originalFile))) {
            writer.write("This is the first line.");
            writer.newLine();
            writer.write("This is the second line.");
            writer.newLine();
            writer.write("This is the third line.");
            System.out.println("Successfully created and wrote to the file: " + originalFile.getName());
        } catch (IOException e) {
            System.err.println("An error occurred while creating or writing to the file.");
            e.printStackTrace();
        }

        // Step 2: Read the original file using InputStream and copy to another file
        try (
            //InputStream inputStream = new FileInputStream(originalFile);
            //OutputStream outputStream = new FileOutputStream(copiedFile);
            BufferedWriter writer = new BufferedWriter(new FileWriter(copiedFile));
            ) {
                
            BufferedReader reader = null;

            // Read and write the content line by line
            reader = new BufferedReader(new FileReader(originalFile));
            System.out.println("Original file lines: ");
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
                writer.write("HAHAHAHA");
                writer.newLine();
                System.out.println(line);
            }

            writer.flush();
            reader.close();

            System.out.println("Successfully copied content from " + originalFile.getName() + " to " + copiedFile.getName());

            reader = new BufferedReader(new FileReader(copiedFile));
            System.out.println("Copied file lines: ");
            String line2;
            while ((line2 = reader.readLine()) != null) {
                System.out.println(line2);
            }

            reader.close();
        } catch (FileNotFoundException e) {
            System.err.println("Error: One of the files was not found.");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("An I/O error occurred during the file operations.");
            e.printStackTrace();
        }
    }
}