/*Created by : Sotiris Demetriades / Date of Submission : 23/4/2021
My program uses hardcoded data to implement it general purpose
About the "Extra Points" part, it gets user input and stores it accordingly, and then it calculates what needs to be calculated
*/

import java.util.Scanner;
import java.util.ArrayList; // import the ArrayList class
import java.util.List;

public class Main {

    public static String serviceName;
    public static String serviceDescription;
    public static double servicePrice;
    public static int acc_num;
    public static double balance;
    public static int phone;
    public static String middleName;
    public static String lastName;
    public static String firstName;
    public static String address;
    public static int numInv;
    public static String dateInv;
    static int quantity1,quantity2,quantity3;
    static double amount1,amount2,amount3;
    static double totalAmount1,totalAmount2,totalAmount3;
    static boolean x=true;
    
    static void printCustomerRecord(int accountnumber,String firstname,String middlename,String lastname,String address,int phone,double amount,String servicename,String servicedescription,
                            double serviceprice,int invoicenum,String invoicedate,int quantity,double totalamount){
        System.out.println("Printing account information.....");                        
        System.out.println("Account number: " + accountnumber + "\nCustomer Name: " + firstname + " " + middlename + " " + lastname + "\nAddress: "+ address + "\nPhone: " + phone 
                            + "\nAccount balance: " + amount + "\n---Services---\nServiceName: " + servicename + "\nService Description :" + servicedescription + "\nService Price: " + 
                            serviceprice + "\n---Invoices---\nInvoice Number: " + invoicenum + "\nDate created: " + invoicedate + "\nService Name: " + servicename + "\nQuantity: " 
                            + quantity + "\nAmount: " + amount + "\nTotal Amount: " + totalamount);    
    }
    public static void main(String[] args) {
        
        Service service1 = new Service("Deposit", "Deposit of 1000 euros.", 1000.00);
        Service service2 = new Service("Desposit", "Deposit of 50000.", 50000.00);
        Service service3 = new Service("Withdrawal", "Withdrawal of 35000.", 35000.00);

        ArrayList<Service> arrlistServices = new ArrayList<Service>();
        arrlistServices.add(service1);
        arrlistServices.add(service2);
        arrlistServices.add(service3);
        
        Customer customer1 = new Customer(124,100000.00,"Elasonos",99999999,"Sotiris","Andrea", "Sotiriou");
        Customer customer2 = new Customer(364, 19999.95,"Posidonos",98989898,"Andreas","Sotiri","Andreou");
        Customer customer3 = new Customer(255,300000.50,"Olympou",97979797,"Giorgos","Kwsta","Georgiou");

        List <Customer> arrlistCustomers = new ArrayList<Customer>();
        arrlistCustomers.add(customer1);
        arrlistCustomers.add(customer2);
        arrlistCustomers.add(customer3);

        Invoice invoice1 = new Invoice(1500, "23/4/2021");
        Invoice invoice2 = new Invoice(5000, "12/5/2015");
        Invoice invoice3 = new Invoice(7500,"10/11/2018");

        ArrayList<Invoice> arrlistInvoices = new ArrayList<Invoice>();
        arrlistInvoices.add(invoice1);
        arrlistInvoices.add(invoice2);
        arrlistInvoices.add(invoice3);     
        
        quantity1=quantity2=quantity3=1;
        amount1=amount2=amount3=0;
        totalAmount1=totalAmount2=totalAmount3=0;

        amount1 = service1.priceOfService * quantity1;
        amount2 = service2.priceOfService * quantity2;
        amount3 = service3.priceOfService * quantity3;

        totalAmount1 = amount1;
        totalAmount2 = amount2;
        totalAmount3 = amount3;

        Scanner in = new Scanner(System.in);
        Scanner db = new Scanner(System.in);
        Scanner strg = new Scanner(System.in);

        System.out.println("Hello!");
        while(x){
            System.out.print("\n---Menu---\nIn order to retrieve your account details, press 1\nIn order to generate a new invoice, press 2\nIn order to exit, press 3\nPlease give your choice: ");
            int selection = Integer.parseInt(System.console().readLine());
            if(selection==1){
                System.out.print("Please provide your last name: ");
                String input = in.nextLine();
                while(x){
                    if(input.equals(customer1.custLastName)){
                        printCustomerRecord(customer1.accountNum,customer1.custFirstName,customer1.custMiddleName,customer1.custLastName,customer1.custAddress,customer1.custPhone,customer1.accountBalance,
                                            service1.nameOfService,service1.descriptionOfService,service1.priceOfService,invoice1.numOfInvoice,invoice1.dateCreated,quantity1,totalAmount1);
                        break;
                    }else if(input.equals(customer2.custLastName)){
                        printCustomerRecord(customer2.accountNum,customer2.custFirstName,customer2.custMiddleName,customer2.custLastName,customer2.custAddress,customer2.custPhone,customer2.accountBalance,
                                            service2.nameOfService,service2.descriptionOfService,service2.priceOfService,invoice2.numOfInvoice,invoice2.dateCreated,quantity2,totalAmount2);
                        break;
                    }else if(input.equals(customer3.custLastName)){
                        printCustomerRecord(customer3.accountNum,customer3.custFirstName,customer3.custMiddleName,customer3.custLastName,customer3.custAddress,customer3.custPhone,customer3.accountBalance,
                                            service3.nameOfService,service3.descriptionOfService,service3.priceOfService,invoice3.numOfInvoice,invoice3.dateCreated,quantity3,totalAmount3);
                        break;
                    }else{
                        System.out.print("Last name not found. Please try again: ");
                        input = in.nextLine();
                    }
                }
            }else if(selection==2){
                    Customer customer4 = new Customer(acc_num,balance,address,phone,firstName,middleName,lastName);
                    Service service4 = new Service(serviceName, serviceDescription, servicePrice);
                    Invoice invoice4 = new Invoice(numInv, dateInv);
    
                    System.out.print("\n---New Customer Details---\nNew Account number: ");
                    int inpAccNum = in.nextInt();
                    System.out.print("\nNew Customer address: ");
                    String inpCustAddr = strg.nextLine();
                    System.out.print("\nNew Customer phone: ");
                    int inpCustPh = in.nextInt();
                    System.out.printf("\nNew Customer first name: ");
                    String inpCustFrName = strg.nextLine();
                    System.out.print("\nNew Customer middle name: ");
                    String inpCustMdName = strg.nextLine();
                    System.out.print("\nNew Customer last name: ");
                    String inpCustLsName = strg.nextLine();
                    System.out.print("\n---Services---\nNew Service Name: ");
                    String inpSrvcName = strg.nextLine();
                    System.out.print("\nNew Service Description: ");
                    String inpSrvcDscr = strg.nextLine();
                    System.out.print("\nNew Service Price: ");
                    double inpSrvcPrc = db.nextDouble();
                    System.out.print("\n---New Invoice Details---\nNew Invoice Number: ");
                    int inpInvcNum = in.nextInt();
                    System.out.print("\nNew Date: ");
                    String inpInvcDt = strg.nextLine();
    
                    customer4.accountNum = inpAccNum;
                    customer4.custAddress = inpCustAddr;
                    customer4.custPhone = inpCustPh;
                    customer4.custFirstName = inpCustFrName;
                    customer4.custMiddleName = inpCustMdName;
                    customer4.custLastName = inpCustLsName;
                    service4.nameOfService = inpSrvcName;
                    service4.descriptionOfService = inpSrvcDscr;
                    service4.priceOfService = inpSrvcPrc;
                    invoice4.numOfInvoice = inpInvcNum;
                    invoice4.dateCreated = inpInvcDt;
                    
                    int quantity4=1;
                    double amount4=0;
                    double totalAmount4=0;
                    double balance4=0;
    
                    amount4 = inpSrvcPrc * quantity4;
                    totalAmount4 = amount4;
                    balance4=totalAmount4;
    
                    printCustomerRecord(inpAccNum,inpCustFrName,inpCustMdName,inpCustLsName,inpCustAddr,inpCustPh,balance4,inpSrvcName,inpSrvcDscr,
                                        inpSrvcPrc,inpInvcNum,inpInvcDt,quantity4,totalAmount4);
                    
            }else if(selection==3){
                System.out.println("Thank you and goodbye!!");
                break;
            }else{
                System.out.println("Number not acceptable. Please try again :");
                selection = in.nextInt();
            }
        }
    }
}