package Task1.button;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class ButtonList{
    private static final List<Button> buttons = Arrays.asList(
            new Button1(),
            new Button2(),
            new Button3(),
            new Button4()
    );



    public static List<Button> getButtons() {
        return buttons;
    }
}
