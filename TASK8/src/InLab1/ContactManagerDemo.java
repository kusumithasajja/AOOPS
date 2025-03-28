package InLab1;

public class ContactManagerDemo {
    public static void main(String[] args) {
        ContactManager manager = new ContactManager();

        // Adding contacts
        manager.addContact("Alice", "123-456-7890");
        manager.addContact("Bob", "987-654-3210");
        manager.addContact("Charlie", "555-123-4567");

        // Retrieving a contact
        System.out.println("Bob's Number: " + manager.getPhoneNumber("Bob"));

        // Removing a contact
        manager.removeContact("Alice");

        // Listing all contacts
        manager.listContacts();
    }
}
