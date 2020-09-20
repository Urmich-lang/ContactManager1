public class ContactsManager {
    String myContactsManager;
    String name;
    String phoneNumber;
    Contact contact;

    public ContactsManager(String myContactsManager) {
        this.contact = new Contact(this.name, this.phoneNumber);
        this.myContactsManager = myContactsManager;
    }

    public void addContact(String name, String phoneNumber) {
        this.contact.setName(name);
        this.contact.setPhoneNumber(phoneNumber);
        System.out.println("Saved: " + name + " " + phoneNumber);
    }

    public String searchContact(String name) {
        this.name = name;
        String phoneNumber = this.contact.getPhoneNumber(name);
        System.out.println("This is " + name + "'s number: " + phoneNumber);
        return phoneNumber;
    }
}
}
