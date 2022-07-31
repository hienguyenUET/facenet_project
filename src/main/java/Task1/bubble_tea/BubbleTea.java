package Task1.bubble_tea;

import Task1.Order;

public class BubbleTea implements Order {
    @Override
    public double getCost() {
        return 23000;
    }

    @Override
    public String description() {
        return "trà sữa";
    }
}
