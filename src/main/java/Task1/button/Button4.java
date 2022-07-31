package Task1.button;

import Task1.Order;
import Task1.flavor.Chocolate;
import Task1.flavor.Flavor;

public class Button4 implements Button {
    Flavor chocolate;

    @Override
    public int setOrder(Order order) {
        chocolate = new Chocolate(order);
        return 4;
    }

    @Override
    public Order getOrder() {
        return chocolate;
    }

}
