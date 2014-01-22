package pl.finsys.behavioral.visitor;

public class GeneralReport implements IVisitor {

    private int customersNo;
    private int ordersNo;
    private int itemsNo;

    public void visit(Customer customer) {
        System.out.println("visit(Customer customer): " + customer.getName());
        customersNo++;
    }

    public void visit(Order order) {
        System.out.println("visit(Order order): " + order.getName());
        ordersNo++;
    }

    public void visit(Item item) {
        System.out.println("visit(Item item): " + item.getName());
        itemsNo++;
    }

    public void displayResults() {
        System.out.println("Nr of customers:" + customersNo);
        System.out.println("Nr of orders:   " + ordersNo);
        System.out.println("Nr of items:   " + itemsNo);
    }

}
