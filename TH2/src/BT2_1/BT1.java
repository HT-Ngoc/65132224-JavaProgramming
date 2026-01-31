package BT2_1;

public class BT1 {
    public static void main(String[] args) {
        // 1. Khai báo các biến mới
        int x = 25;
        int y = 7;
        double z = 4.0;

        // 2. Thực hiện tính toán
        int tong = x + y;
        double thuong = x / z;
        int phanDu = x % y;

        // 3. In kết quả ra màn hình
        System.out.println("--- Kết quả tính toán ---");
        System.out.println("Tổng của x và y là: " + tong);
        System.out.println("Thương của x và z là: " + thuong);
        System.out.println("Phần dư của x khi chia cho y là: " + phanDu);
    }
}
