public class Person {
    protected String name;
    protected String contactInfo;
    protected String address;

    public Person(String name, String contactInfo, String address) {
        this.name = name;
        this.contactInfo = contactInfo;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public String getAddress() {
        return address;
    }
}
