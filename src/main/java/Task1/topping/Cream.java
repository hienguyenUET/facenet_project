package Task1.topping;

import Task1.Order;

public class Cream extends Topping {

    public Cream() {
        super();
    }

    public Cream(Order curOrder) {
        super(curOrder);
    }

    @Override
    public double getCost() {
        return 3000;
    }

    @Override
    public String description() {
        return " thêm kem,";
    }
}
