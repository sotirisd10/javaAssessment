public class Service {
    String nameOfService;
    String descriptionOfService;
    double priceOfService;

    public Service(String serviceName, String serviceDescription, 
                    double servicePrice)
    {
        nameOfService = serviceName;
        descriptionOfService = serviceDescription;
        priceOfService = servicePrice;
    }

    public static void main(String[] args) {
        // write your code here
        Service s1 = new Service("deposit","deposit of 1000 euros", 1000.00);
        System.out.println(s1.descriptionOfService);
        } 
}
