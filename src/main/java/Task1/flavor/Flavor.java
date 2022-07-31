package Task1.flavor;

import Task1.Order;

public abstract class Flavor implements Order{
    protected Order order;

    public Flavor() {
    }

    public Flavor(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
