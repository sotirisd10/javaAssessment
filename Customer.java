public class Customer {

    int accountNum;
    double accountBalance;
    String custAddress;
    int custPhone;
    String custFirstName;
    String custMiddleName;
    String custLastName;

    public Customer(int acc_num, double balance, String address, int phone, String firstName, String middleName,
            String lastName) {
        accountNum = acc_num;
        accountBalance = balance;
        custAddress = address;
        custPhone = phone;
        custFirstName = firstName;
        custMiddleName = middleName;
        custLastName = lastName;
    }

    public static void main(String[] args) {
        // write your code here
        Customer c1 = new Customer(2, 9999.99999, "Elasonos", 999999, "Sotiris", "Sotiri", "Sotiriou");
        System.out.println(c1.accountBalance);
    }
}