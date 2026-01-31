package BTVN3_2;

import java.util.Scanner;

public class DoiTienTe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double USD_TO_VND = 23500;

        System.out.println("1. USD -> VND");
        System.out.println("2. VND -> USD");
        System.out.print("Lua chon: ");
        int choice = sc.nextInt();

        System.out.print("Nhap so tien: ");
        double amount = sc.nextDouble();

        if (choice == 1) {
            System.out.printf("%.2f USD = %,.0f VND%n", amount, amount * USD_TO_VND);
        } else if (choice == 2) {
            System.out.printf("%,.0f VND = %.2f USD%n", amount, amount / USD_TO_VND);
        } else {
            System.out.println("Lua chon khong hop le!");
        }

        sc.close();
    }
}

