package Task1.topping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class ToppingList {
    private final static List<Topping> topping = List.of(
            new Bubble(),
            new Cream(),
            new Milk()
    );

    public static List<Topping> getToppingList() {
        return topping;
    }
}
