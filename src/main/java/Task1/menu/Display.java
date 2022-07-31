package Task1.menu;

import Task1.flavor.FlavorList;
import Task1.topping.ToppingList;

import java.util.HashMap;

// customer interaction with order
public class Display {
    public void getMenu3() {
        System.out.println("Nhà hàng hiện có:");
        System.out.println(ToppingList.getToppingList().size() + " loại món phụ:");
        System.out.println("- Phím 1: thêm chân châu: 5.000");
        System.out.println("- Phím 2: thêm sữa: 4.000");
        System.out.println("- Phím 3: thêm kem: 3.000");
        System.out.println();
        System.out.println(FlavorList.getFlavorList().size() + " vị: ");
        System.out.println("- Phím 4: vị socola: 5.000");
        System.out.println();
        System.out.println("Để quay lại bước trước, ấn phím 0");
    }

    public void getMenu1(HashMap<StringBuilder, Integer> orders) {
        System.out.println("- Phím 1: Đặt trà sữa");
        System.out.println("- Phím 2: Xem đơn hàng");
        System.out.println("- Phím 3: Thực hiện thanh toán");
        System.out.println("Số lượng đã đặt: " + orders.size());
        System.out.print("Nhập phím: ");
    }

    public void getMenu2() {
        System.out.println("Giá 1 cốc trà sữa là: 23.000");
        System.out.println("- Phím 0: Quay lại");
        System.out.println("- Phím 1: Thêm vào giỏ hàng");
        System.out.println("- Phím 2: Thêm lựa chọn cho trà sữa của bạn");
    }
}