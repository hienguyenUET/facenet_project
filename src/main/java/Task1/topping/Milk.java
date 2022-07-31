package Task1.topping;

import Task1.Order;

public class Milk extends Topping {

    public Milk() {
        super();
    }

    public Milk(Order order) {
        super(order);
    }

    @Override
    public double getCost() {
        return 4000;
    }

    @Override
    public String description() {
        return " thêm sữa,";
    }
}
