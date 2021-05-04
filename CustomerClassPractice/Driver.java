import java.util.Scanner;

class Driver {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        boolean mailList;


        System.out.print("Enter name of customer: ");
        String name1 = keyboard.nextLine();

        System.out.print("Enter address of customer: ");
        String address1 = keyboard.nextLine();

        System.out.print("Enter phone number of customer: ");
        String phoneNumber1 = keyboard.nextLine();

        System.out.print("Enter customer number: ");
        String customerNumber1 = keyboard.nextLine();

        System.out.print("Enter (yes/no) does the customer want to receive mail?: ");
        String answer = keyboard.nextLine();
        if (answer.equalsIgnoreCase("yes")) {
            mailList = true;

        } else {
            mailList = false;
        }

        Customer customer1 = new Customer(name1, address1, phoneNumber1, customerNumber1, mailList);

        System.out.println("Customer:");
        System.out.println("Name: " + customer1.getName());
        System.out.println("Address: " + customer1.getAddress());
        System.out.println("Phone Number: " + customer1.getPhoneNumber());
        System.out.println("Customer Number: " + customer1.getCustomerNumber());
        System.out.println("Receive Mail?: " + customer1.getMail());


    }
}