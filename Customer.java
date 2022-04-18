import java.util.List;

public class Customer {
    private int customerID;
    private String name;
    private String phoneNumber;
    private String email;
    private int paymentDetail;


public void changeInfo(int customerID, String name, String phoneNumber,String email, int paymentDetail){
    this.customerID = customerID;
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.email = email;
    this.paymentDetail = paymentDetail;
}

public  void makeOrder(List<Item> items, PaymentMethod PaymentMethod, Hour hour, OrderType type){
    new Order(items, PaymentMethod, hour, type);
}

}
