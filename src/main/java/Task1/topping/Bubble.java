package Task1.topping;

import Task1.Order;

public class Bubble extends Topping {
    public Bubble() {
        super();
    }

    public Bubble(Order curOrder) {
        super(curOrder);
    }

    @Override
    public double getCost() {
        return 5000;
    }

    @Override
    public String description() {
        return " thêm chân châu,";
    }

}
