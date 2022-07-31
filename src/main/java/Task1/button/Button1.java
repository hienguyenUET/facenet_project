package Task1.button;

import Task1.Main;
import Task1.Order;
import Task1.topping.Bubble;
import Task1.topping.Topping;

// button 1 is used for adding more bubbles to the current order
public class Button1 implements Button{
    Topping topping;

    @Override
    public int setOrder(Order order) {
        topping = new Bubble(order);
        return 1;
    }

    @Override
    public Order getOrder() {
        return topping;
    }

}
