package Task1.flavor;

import Task1.Order;

public class Chocolate extends Flavor{

    public Chocolate() {
        super();
    }

    public Chocolate(Order order) {
        super(order);
    }

    @Override
    public double getCost() {
        return 4000;
    }

    @Override
    public String description() {
        return " vị socola,";
    }
}
