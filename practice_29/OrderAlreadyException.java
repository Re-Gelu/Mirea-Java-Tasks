public class OrderAlreadyException extends Exception{
    public OrderAlreadyException(int ex){
        super("Order is already added at " + ex + " table");
    }
}