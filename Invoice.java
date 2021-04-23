//import java.util.Date;

public class Invoice {
    int numOfInvoice;
    String dateCreated;


    public Invoice(int numInv, String dateInv){
        numOfInvoice = numInv;
        dateCreated = dateInv;
    }

    public static void main(String[] args) {
        // write your code here
        Invoice i1 = new Invoice(124,"22/4/2021");
        System.out.println(i1.dateCreated);
        } 
}
