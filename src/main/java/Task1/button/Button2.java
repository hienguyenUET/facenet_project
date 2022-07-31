package Task1.button;

import Task1.Order;
import Task1.topping.Milk;
import Task1.topping.Topping;

// button 2 is used for adding more milk to the current order
public class Button2 implements Button{
    Topping milk;

    @Override
    public int setOrder(Order order) {
        milk = new Milk(order);
        return 2;
    }

    @Override
    public Order getOrder() {
        return milk;
    }
}
