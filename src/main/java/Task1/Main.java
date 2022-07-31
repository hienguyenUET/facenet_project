package Task1;

import Task1.bubble_tea.BubbleTea;
import Task1.button.Button;
import Task1.button.ButtonList;
import Task1.menu.Display;

import java.util.*;

public class Main {

    static List<Button> buttonsList = ButtonList.getButtons();
    static Display menu = new Display();
    static Scanner sc = new Scanner(System.in);
    static int total = 0;
    static HashMap<StringBuilder, Integer> orders = new HashMap<>();


    public static void main(String[] args) {
        boolean isPaid = false;
        while (!isPaid) {
            Order order = new BubbleTea();
            int cost = 0;
            StringBuilder description = new StringBuilder(order.description());
            // display selection for customer
            menu.getMenu1(orders);
            int buttonToType = sc.nextInt();
            switch (buttonToType) {
                case 1 -> setOptionForCustomer(order, cost, description);
                case 2 -> printBill();
                case 3 -> {
                    System.out.println("Tổng tiền: " + total);
                    isPaid = true;
                }
            }
        }
    }


    // print empty lines for each switching screen
    static void printEmptyLines() {
        for (int i = 0; i < 4; i++) {
            System.out.println();
        }
    }

    static void printBill() {
        for (Map.Entry<StringBuilder, Integer> entry : orders.entrySet()) {
            String getDes = String.valueOf(entry.getKey());
            if (getDes.charAt(getDes.length() - 1) == ',') {
                getDes = getDes.substring(0, getDes.length() - 1);
            }
            System.out.println(getDes + ", giá: " + entry.getValue());
        }
        System.out.println();
    }

    /**
     * @param order       the current order
     * @param cost        the cost of current order
     * @param description the description of current oreder
     */
    static void setOptionForCustomer(Order order, int cost, StringBuilder description) {
        boolean isDone = false;
        cost += Math.round(order.getCost());
        int nextSelection;
        while (!isDone) {
            menu.getMenu2();
            System.out.print("Mời bạn nhập lựa chọn: ");
            nextSelection = sc.nextInt();
            switch (nextSelection) {
                case 0 -> isDone = true;

                case 1 -> {
                    orders.put(description, cost);
                    isDone = true;
                }
                case 2 -> {
                    // display options for current order
                    menu.getMenu3();
                    while (true) {
                        System.out.print("Mời bạn nhập lựa chọn: ");
                        int buttonNum = sc.nextInt();
                        if (buttonNum == 0) {
                            break;
                        }
                        try {
                            Button chosenButton = buttonsList.stream().filter(button -> button.setOrder(order) == buttonNum).findFirst().orElse(null);
                            assert chosenButton != null;
                            cost += chosenButton.getOrder().getCost();
                            description.append(chosenButton.getOrder().description());
                            System.out.println(description + ", giá " + cost);
                            System.out.println();
                        } catch (NullPointerException e1) {
                            System.out.println("Xin mời nhập lại!");
                        }
                    }
                }
            }
        }
    }
}



