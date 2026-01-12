public class NewWaiter implements WaiterInterface{
    @Override
    public void serveCustomers() {
        System.out.println("Serving the customer");
    }

    @Override
    public void takeOrder() {
        System.out.println("Taking orders");
    }
}
