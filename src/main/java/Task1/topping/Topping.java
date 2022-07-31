package Task1.topping;

import Task1.Order;

import java.util.List;


public abstract class Topping implements Order{
    protected Order order;

    public Topping() {
    }

    // init topping with existing bubble that customer ordered
    public Topping(Order curOrder) {
        this.order = curOrder;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "Topping{" +
                "order=" + order +
                '}';
    }
}
