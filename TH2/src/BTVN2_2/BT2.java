package BTVN2_2;

import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double USD_TO_VND = 23500;
        final double EUR_TO_VND = 27000;

        System.out.println("Chon loai tien can doi:");
        System.out.println("1. USD sang VND");
        System.out.println("2. EUR sang VND");
        System.out.print("Lua chon cua ban: ");
        int choice = sc.nextInt();

        System.out.print("Nhap so tien can doi: ");
        double amount = sc.nextDouble();

        double vnd = 0;

        if (choice == 1) {
            vnd = amount * USD_TO_VND;
            System.out.printf("%,.0f USD = %,.0f VND%n", amount, vnd);
        } else if (choice == 2) {
            vnd = amount * EUR_TO_VND;
            System.out.printf("%,.0f EUR = %,.0f VND%n", amount, vnd);
        } else {
            System.out.println("Lua chon khong hop le!");
        }

        sc.close();
    }
}
