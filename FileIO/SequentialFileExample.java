import java.io.*;

public class SequentialFileExample {
    public static void main(String[] args) {
        //File fileName = new File("sequentialData.txt");
        String fileName = "sequentialData.txt";

        System.out.println();

        // Writing to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("John,25,Software Engineer");
            writer.newLine();
            writer.write("Alice,30,Data Scientist");
            writer.newLine();
            writer.write("Bob,22,Web Developer");
            System.out.println("Data written to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }

        // Reading from the file
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("\nReading data from the file:");
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                System.out.println("Name: " + data[0] + ", Age: " + data[1] + ", Occupation: " + data[2]);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }

        System.out.println();
    }
}


