import java.io.*;
import java.util.*;

public class ContactManagementSystem {
    private final File file = new File("contacts.txt");
    private final String path = file.getAbsolutePath();

    public ContactManagementSystem() {
        try {
            if (!file.exists()) file.createNewFile();
        } catch (IOException e) {
            System.err.println("Error initializing contacts file: " + e.getMessage());
        }
    }

    public boolean addContact(String name) {
        List<String> contacts = readFile();

        contacts.add(makeUniqueName(name, contacts));

        Collections.sort(contacts, String.CASE_INSENSITIVE_ORDER);
        return writeToFile(contacts);
    }

    public boolean updateContact(String storedName, String newName) {
        List<String> contacts = readFile();

        if (!contacts.contains(storedName)) {
            System.err.println("Contact not found.");
            return false;
        }
        
        int index = contacts.indexOf(storedName);
        contacts.set(index, newName);
        
        Collections.sort(contacts, String.CASE_INSENSITIVE_ORDER);
        return writeToFile(contacts);
    }

    public boolean deleteContact(String name) {
        List<String> contacts = readFile();

        if (!contacts.contains(name)) {
            System.err.println("Contact not found.");
            return false;
        }

        contacts.remove(name);

        return writeToFile(contacts);
    }

    public void viewContacts() {
        List<String> contacts = readFile();

        System.out.println("Contacts(" + contacts.size() +")");

        if (contacts.isEmpty()) {
            System.err.println("No contacts to view.");
        } else {
            for (int i = 0; i < contacts.size(); i++) {
                System.out.println(i+1 + ". " + contacts.get(i));
            }
        }
    }

    public boolean isEmpty() {
        try (FileReader fr = new FileReader(path)) {
            return fr.read() == -1;
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return false;
        }
    }

    private List<String> readFile() {
        List<String> contacts = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                contacts.add(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        return contacts;
    }

    private boolean writeToFile(List<String> contacts) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String contact : contacts) {
                bw.write(contact);
                bw.newLine();
            }
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    private String makeUniqueName(String name, List<String> contacts) {
        int count = 1;
        String newName = name;
        
        while (contacts.contains(newName))
            newName = name + "(" + count++ + ")";
        
        return newName;
    }
}
