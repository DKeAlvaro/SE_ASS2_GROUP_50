import java.util.List;

public class Order {
    private int OrderID;
    private List<Item> items;
    private int OrderHour;
    private Comment comment;
    private Price price;
    private PaymentMethod paymentMethod;
    private OrderType orderType;
    private OrderStatus status;
    private DeliveryAdress adress;

    public Order(List<Item> items, PaymentMethod paymentMethod, Hour orderHour, OrderType type){
        
    }
    public int getOrderID() {
        return OrderID;
    }
    public List<Item> getItems() {
        return items;
    }
    public int getOrderHour() {
        return OrderHour;
    }
    public Comment getComment() {
        return comment;
    }
    public Price getPrice() {
        return price;
    }
    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }
    public OrderType getOrderType() {
        return orderType;
    }
    public OrderStatus getStatus() {
        return status;
    }
    
}
