import java.util.ArrayList;

public class Contacts {
        String name;
        String phoneNumber;
        ArrayList nameList = new ArrayList();
        ArrayList phoneNumberList = new ArrayList();

        public Contacts(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }

        public void setName(String name) {
            this.name = name;
            this.nameList.add(name);
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            this.phoneNumberList.add(phoneNumber);
        }

        public String getPhoneNumber(String name) {
            int index = this.nameList.indexOf(name);
            return (String)this.phoneNumberList.get(index);
        }
    }
}
