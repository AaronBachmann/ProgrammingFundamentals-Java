public class Customer extends Person {

    private String customerNumber;
    private boolean mail = false;

    public Customer(String name, String address, String phoneNumber, String c, boolean m) {
        super(name, address, phoneNumber);
        this.customerNumber = c;
        this.mail = m;
    }

    public void setCustomerNumber(String c) {
        this.customerNumber = c;
    }

    public String getCustomerNumber() {
        return this.customerNumber;
    }

    public void setMail(boolean mailList) {
        this.mail = mailList;

    }

    public boolean getMail() {
        return this.mail;
    }

}