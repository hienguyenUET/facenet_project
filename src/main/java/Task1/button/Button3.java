package Task1.button;

import Task1.Order;
import Task1.topping.Cream;
import Task1.topping.Topping;

// button 3 is used for adding more cream to the current order
public class Button3 implements Button{
    Topping cream;

    @Override
    public int setOrder(Order order) {
        cream = new Cream(order);
        return 3;
    }

    @Override
    public Order getOrder() {
        return cream;
    }
}
