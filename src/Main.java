public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        ContactsManager mn = new ContactsManager("NEO");
        mn.addContact("Dastan", "999 235-000");
        mn.addContact("Kanat", "77239047293433");
        mn.addContact("Tima", "0312 1241 151");
        mn.addContact("Sergey", "888 1241 4124");
        mn.searchContact("Sergey");
        mn.searchContact("Dastan");
        mn.searchContact("Kanat");
        mn.searchContact("Tima");
    }
}
