public class Person {
    private String name;
    private String address;
    private String phoneNumber;

    public Person(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getName()  {
        return this.name;
    }

    public void setAddress(String a) {
        this.address = a;
    }

    public String getAddress() {
        return this.address;
    }

    public void setPhoneNumber(String p) {
        this.phoneNumber = p;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }
}

