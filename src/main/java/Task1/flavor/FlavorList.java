package Task1.flavor;

import java.util.List;

public final class FlavorList {
    private static final List<Flavor> flavorList = List.of(
            new Chocolate()
    );

    public static List<Flavor> getFlavorList() {
        return flavorList;
    }
}
